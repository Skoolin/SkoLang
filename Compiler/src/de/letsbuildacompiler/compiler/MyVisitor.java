package de.letsbuildacompiler.compiler;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import de.letsbuildacompiler.exceptions.SystemFunctionNotFoundException;
import de.letsbuildacompiler.exceptions.UndeclaredVariableException;
import de.letsbuildacompiler.exceptions.UndefinedFunctionException;
import de.letsbuildacompiler.exceptions.VariableAlreadyDefinedException;
import de.letsbuildacompiler.parser.DemoBaseVisitor;
import de.letsbuildacompiler.parser.DemoParser.AndContext;
import de.letsbuildacompiler.parser.DemoParser.ArrayElementContext;
import de.letsbuildacompiler.parser.DemoParser.AssignmentContext;
import de.letsbuildacompiler.parser.DemoParser.AssignmentListContext;
import de.letsbuildacompiler.parser.DemoParser.BooleanContext;
import de.letsbuildacompiler.parser.DemoParser.BranchContext;
import de.letsbuildacompiler.parser.DemoParser.ClassDeclarationContext;
import de.letsbuildacompiler.parser.DemoParser.ConstructorCallContext;
import de.letsbuildacompiler.parser.DemoParser.DivContext;
import de.letsbuildacompiler.parser.DemoParser.FunctionCallContext;
import de.letsbuildacompiler.parser.DemoParser.FunctionDefinitionContext;
import de.letsbuildacompiler.parser.DemoParser.ImportFunctionCallContext;
import de.letsbuildacompiler.parser.DemoParser.ImportListContext;
import de.letsbuildacompiler.parser.DemoParser.LoopContext;
import de.letsbuildacompiler.parser.DemoParser.MainStatementContext;
import de.letsbuildacompiler.parser.DemoParser.MinusContext;
import de.letsbuildacompiler.parser.DemoParser.MultContext;
import de.letsbuildacompiler.parser.DemoParser.NumberContext;
import de.letsbuildacompiler.parser.DemoParser.OrContext;
import de.letsbuildacompiler.parser.DemoParser.PlusContext;
import de.letsbuildacompiler.parser.DemoParser.PrintContext;
import de.letsbuildacompiler.parser.DemoParser.PrintlnContext;
import de.letsbuildacompiler.parser.DemoParser.ProgramContext;
import de.letsbuildacompiler.parser.DemoParser.RelationalContext;
import de.letsbuildacompiler.parser.DemoParser.StringContext;
import de.letsbuildacompiler.parser.DemoParser.SystemCallContext;
import de.letsbuildacompiler.parser.DemoParser.TypeArrayFieldContext;
import de.letsbuildacompiler.parser.DemoParser.TypeDeclarationContext;
import de.letsbuildacompiler.parser.DemoParser.TypeElementContext;
import de.letsbuildacompiler.parser.DemoParser.TypeFieldAssignmentContext;
import de.letsbuildacompiler.parser.DemoParser.VarDeclarationContext;
import de.letsbuildacompiler.parser.DemoParser.VariableContext;

public class MyVisitor extends DemoBaseVisitor<String> {

	private Map<String, StorageModel> statics = new HashMap<>();
	private Map<String, StorageModel> variables = new HashMap<>();
	private Map<String, File> importedFiles = new HashMap<>();
	private LinkedHashMap<String, TypeModel> types;
	private File parentDir;
	private File currentDir;
	private JvmStack jvmStack = new JvmStack();
	private final FunctionList definedFunctions;
	private int branchCounter = 0;
	private int compareCounter = 0;
	private int andCounter = 0;
	private int orCounter = 0;
	private int loopCounter = 0;
	private String staticVars = "";
	private boolean main = true;
	private String lookingAtStorageCommand = "";
	private String lookingAtLoadCommand = "";
	private int lookingAtObjectId = 0;
	private String header = "";
	private String typeHeader = "";

	public MyVisitor(FunctionList definedFunctions, Map<String, StorageModel> statics,
			LinkedHashMap<String, TypeModel> types, String header, File parentDir, File currentDir) {
		if (definedFunctions == null || statics == null || types == null) {
			throw new NullPointerException("defined functions/statics/types");
		} else {
			this.definedFunctions = definedFunctions;
			this.statics = statics;
			this.types = types;
			this.header = header;
			this.typeHeader = "Type" + header;
			this.parentDir = parentDir;
			this.currentDir = currentDir;
		}
	}

	@Override
	public String visitPrintln(PrintlnContext ctx) {
		String argumentInstructions = visit(ctx.argument);
		DataType type = jvmStack.pop();

		return "getstatic java/lang/System/out Ljava/io/PrintStream;\n" + argumentInstructions + "\n"
				+ "invokevirtual java/io/PrintStream/println(" + type.getJvmType() + ")V\n";
	}

	@Override
	public String visitPrint(PrintContext ctx) {
		String argumentInstructions = visit(ctx.argument);
		DataType type = jvmStack.pop();
		return "getstatic java/lang/System/out Ljava/io/PrintStream;\n" + argumentInstructions + "\n"
				+ "invokevirtual java/io/PrintStream/print(" + type.getJvmType() + ")V\n";
	}

	@Override
	public String visitPlus(PlusContext ctx) {
		String instructions = visitChildren(ctx) + "\n" + "iadd";
		jvmStack.pop();
		jvmStack.pop();
		jvmStack.push(DataType.INT);
		return instructions;
	}

	@Override
	public String visitMinus(MinusContext ctx) {
		String instructions = visitChildren(ctx) + "\n" + "isub";
		jvmStack.pop();
		jvmStack.pop();
		jvmStack.push(DataType.INT);
		return instructions;
	}

	@Override
	public String visitDiv(DivContext ctx) {
		String instructions = visitChildren(ctx) + "\n" + "idiv";
		jvmStack.pop();
		jvmStack.pop();
		jvmStack.push(DataType.INT);
		return instructions;
	}

	@Override
	public String visitMult(MultContext ctx) {
		String instructions = visitChildren(ctx) + "\n" + "imul";
		jvmStack.pop();
		jvmStack.pop();
		jvmStack.push(DataType.INT);
		return instructions;
	}

	@Override
	public String visitRelational(RelationalContext ctx) {
		int compareNum = compareCounter;
		compareCounter++;
		String result = "";
		String operator = ctx.operator.getText();
		switch (operator) {
		case "<":
			result = "if_icmplt";
			break;
		case ">":
			result = "if_icmpgt";
			break;
		case "<=":
			result = "if_icmple";
			break;
		case ">=":
			result = "if_icmpge";
			break;
		case "==":
			result = "if_icmpeq";
			break;
		case "<>":
			result = "if_icmpne";
			break;
		default:
			throw new IllegalArgumentException("Unknown operator: " + operator);
		}
		String instructions = visitChildren(ctx) + "\n" + result + " onTrue" + compareNum + "\n" + "ldc 0\n"
				+ "goto onFalse" + compareNum + "\n" + "onTrue" + compareNum + ":\n" + "ldc 1\n" + "onFalse"
				+ compareNum + ":";
		jvmStack.pop();
		jvmStack.pop();
		jvmStack.push(DataType.INT);
		return instructions;
	}

	@Override
	public String visitAnd(AndContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		int andNum = andCounter;
		andCounter++;
		String instructions = left + "\n" + "ifeq onAndFalse" + andNum + "\n" + right + "\n" + "ifeq onAndFalse"
				+ andNum + "\n" + "ldc 1\n" + "goto andEnd" + andNum + "\n" + "onAndFalse" + andNum + ":\n" + "ldc 0\n"
				+ "andEnd" + andNum + ":";
		jvmStack.pop();
		jvmStack.pop();
		jvmStack.push(DataType.INT);
		return instructions;
	}

	@Override
	public String visitOr(OrContext ctx) {
		String left = visit(ctx.left);
		String right = visit(ctx.right);
		int orNum = orCounter;
		andCounter++;

		String instructions = left + "\n" + "ifne onOrTrue" + orNum + "\n" + right + "\n" + "ifne onOrTrue" + orNum
				+ "\n" + "ldc 0\n" + "goto orEnd" + orNum + "\n" + "onOrTrue" + orNum + ":\n" + "ldc 1\n" + "orEnd"
				+ orNum + ":";
		jvmStack.pop();
		jvmStack.pop();
		jvmStack.push(DataType.INT);
		return instructions;
	}

	@Override
	public String visitTypeArrayField(TypeArrayFieldContext ctx) {
		if (main || statics.containsKey(ctx.typeName.getText())) {
			int storageId = statics.get(ctx.typeName.getText()).getStorageId();
			int objectId = statics.get(ctx.typeName.getText()).getTypeAdress();
			int i = (new ArrayList<TypeModel>(types.values())).get(objectId).getAddress(ctx.varName.getText());
			String type = (new ArrayList<TypeModel>(types.values())).get(objectId).getVars().get(i).getJvmType();
			String result = "getstatic " + header + "/n" + storageId + " L" + typeHeader + objectId + ";\n"
					+ "getfield " + typeHeader + statics.get(ctx.typeName.getText()).getTypeAdress() + "/tn" + i + " "
					+ type + "\n";
			jvmStack.push(DataType.OBJREF);
			jvmStack.pop();
			jvmStack.push((new ArrayList<TypeModel>(types.values())).get(objectId).getVars().get(i));
			return result;
		} else {
			int storageId = variables.get(ctx.typeName.getText()).getStorageId();
			int objectId = variables.get(ctx.typeName.getText()).getTypeAdress();
			int i = (new ArrayList<TypeModel>(types.values())).get(objectId).getAddress(ctx.varName.getText());
			String type = (new ArrayList<TypeModel>(types.values())).get(objectId).getVars().get(i).getJvmType();
			String loadCommand = "aload " + storageId;
			String result = loadCommand;
			result += "\n" + "getfield " + typeHeader + variables.get(ctx.typeName.getText()).getTypeAdress() + "/tn"
					+ i + " " + type + "\n";
			jvmStack.push(DataType.OBJREF);
			jvmStack.pop();
			jvmStack.push((new ArrayList<TypeModel>(types.values())).get(objectId).getVars().get(i));
			return result;
		}
	}

	@Override
	public String visitTypeElement(TypeElementContext ctx) {
		if (main || statics.containsKey(ctx.typeName.getText())) {
			int storageId = statics.get(ctx.typeName.getText()).getStorageId();
			int objectId = statics.get(ctx.typeName.getText()).getTypeAdress();
			int i = (new ArrayList<TypeModel>(types.values())).get(objectId).getAddress(ctx.varName.getText());
			String type = (new ArrayList<TypeModel>(types.values())).get(objectId).getVars().get(i).getJvmType();
			String result = "getstatic " + header + "/n" + storageId + " L" + typeHeader + objectId + ";\n"
					+ "getfield " + typeHeader + statics.get(ctx.typeName.getText()).getTypeAdress() + "/tn" + i + " "
					+ type + "\n";
			jvmStack.push(DataType.OBJREF);
			jvmStack.pop();
			jvmStack.push((new ArrayList<TypeModel>(types.values())).get(objectId).getVars().get(i));
			return result;
		} else {
			int storageId = variables.get(ctx.typeName.getText()).getStorageId();
			int objectId = variables.get(ctx.typeName.getText()).getTypeAdress();
			int i = (new ArrayList<TypeModel>(types.values())).get(objectId).getAddress(ctx.varName.getText());
			String type = (new ArrayList<TypeModel>(types.values())).get(objectId).getVars().get(i).getJvmType();
			String loadCommand = "aload " + storageId;
			String result = loadCommand;
			result += "\n" + "getfield " + typeHeader + variables.get(ctx.typeName.getText()).getTypeAdress() + "/tn"
					+ i + " " + type + "\n";
			jvmStack.push(DataType.OBJREF);
			jvmStack.pop();
			jvmStack.push((new ArrayList<TypeModel>(types.values())).get(objectId).getVars().get(i));
			return result;
		}
	}

	@Override
	public String visitArrayElement(ArrayElementContext ctx) {
		if (main || statics.containsKey(ctx.varName.getText())) {
			StorageModel model;
			if (main) {
				model = requireStorageModel(ctx.varName);
			} else {
				model = requireStaticStorageModel(ctx.varName);
			}
			int arrayIndex = model.getStorageId();
			String loadCommand = "iaload";
			DataType primitive = DataType.INT;
			switch (model.getType()) {
			case IARRAY:
				break;
			case SARRAY:
				loadCommand = "aaload";
				primitive = DataType.STRING;
				break;
			default:
				break;
			}
			jvmStack.push(DataType.INT);
			String result = "getstatic " + header + "/n" + arrayIndex + " [" + primitive.getJvmType() + '\n'
					+ visit(ctx.index) + '\n' + loadCommand;
			jvmStack.pop();
			jvmStack.pop();
			jvmStack.push(primitive);
			return result;

		} else {
			StorageModel model = requireStorageModel(ctx.varName);
			int arrayIndex = model.getStorageId();
			String loadCommand = "iaload";
			DataType primitive = DataType.INT;
			switch (model.getType()) {
			case IARRAY:
				break;
			case SARRAY:
				loadCommand = "aaload";
				primitive = DataType.STRING;
				break;
			default:
				break;
			}
			jvmStack.push(DataType.INT);
			String result = "aload " + arrayIndex + '\n' + visit(ctx.index) + '\n' + loadCommand;
			jvmStack.pop();
			jvmStack.pop();
			jvmStack.push(primitive);
			return result;
		}

	}

	@Override
	public String visitNumber(NumberContext ctx) {
		jvmStack.push(DataType.INT);
		return "ldc " + ctx.number.getText();
	}

	@Override
	public String visitBoolean(BooleanContext ctx) {
		jvmStack.push(DataType.INT);
		if (ctx.bool.getText().equals("true")) {
			return "ldc 1";
		} else {
			return "ldc 0";
		}
	}

	@Override
	public String visitString(StringContext ctx) {
		jvmStack.push(DataType.STRING);
		return "ldc " + ctx.txt.getText();
	}

	@Override
	public String visitVarDeclaration(VarDeclarationContext ctx) {
		if (main) {
			String instructions = "";
			StorageModel model = statics.get(ctx.varName.getText());
			lookingAtStorageCommand = "putstatic " + header + "/n" + model.getStorageId();
			lookingAtLoadCommand = "getstatic " + header + "/n" + model.getStorageId();
			DataType type = DataType.INT;
			String storeCommand = "putstatic " + header + "/n";
			switch (ctx.type.getText()) {
			case "int[]":
				type = DataType.IARRAY;
				break;
			case "string[]":
				type = DataType.SARRAY;
				break;
			case "int":
				type = DataType.INT;
				break;
			case "string":
				type = DataType.STRING;
				break;
			default:
				storeCommand = "";
				type = DataType.OBJREF;
				break;
			}
			String typeDec;
			if (type == DataType.OBJREF) {
				typeDec = "L" + typeHeader + types.get(ctx.type.getText()).getId() + ';';
				variables.put(ctx.varName.getText(),
						new StorageModel(variables.size(), type, types.get(ctx.type.getText()).getId()));
			} else {
				typeDec = type.getJvmType();
				variables.put(ctx.varName.getText(), new StorageModel(variables.size(), type));
			}
			staticVars += ".field public static n" + requireVariableIndex(ctx.varName) + " " + typeDec + '\n';
			if (ctx.expr != null) {
				if (type == DataType.OBJREF) {
					instructions = visit(ctx.expr) + '\n';
				} else {
					instructions = visit(ctx.expr) + "\n" + storeCommand + requireVariableIndex(ctx.varName) + " "
							+ typeDec;
				}
				jvmStack.pop();
				return instructions;
			}
			return instructions;
		} else {
			if (variables.containsKey(ctx.varName.getText())) {
				throw new VariableAlreadyDefinedException(ctx.varName);
			}
			String instructions = "";
			DataType type = DataType.INT;
			String storeCommand = "istore";
			switch (ctx.type.getText()) {
			case "int[]":
				type = DataType.IARRAY;
				storeCommand = "astore";
				break;
			case "string[]":
				type = DataType.SARRAY;
				storeCommand = "astore";
				break;
			case "int":
				type = DataType.INT;
				break;
			case "string":
				type = DataType.STRING;
				storeCommand = "astore";
				break;
			default:
				type = DataType.OBJREF;
				storeCommand = "astore";
				break;
			}
			if (type == DataType.OBJREF) {
				variables.put(ctx.varName.getText(),
						new StorageModel(variables.size(), type, types.get(ctx.type.getText()).getId()));
			} else {
				variables.put(ctx.varName.getText(), new StorageModel(variables.size(), type));
			}
			StorageModel model = variables.get(ctx.varName.getText());
			switch (ctx.type.getText()) {
			case "int[]":
				type = DataType.IARRAY;
				storeCommand = "astore";
				lookingAtStorageCommand = "astore " + model.getStorageId();
				lookingAtLoadCommand = "aload " + model.getStorageId();
				break;
			case "string[]":
				type = DataType.SARRAY;
				storeCommand = "astore";
				lookingAtStorageCommand = "astore " + model.getStorageId();
				lookingAtLoadCommand = "aload " + model.getStorageId();
				break;
			case "int":
				type = DataType.INT;
				lookingAtStorageCommand = "istore " + model.getStorageId();
				lookingAtLoadCommand = "iload " + model.getStorageId();
				break;
			case "string":
				type = DataType.STRING;
				storeCommand = "astore";
				lookingAtStorageCommand = "astore " + model.getStorageId();
				lookingAtLoadCommand = "aload " + model.getStorageId();
				break;
			default:
				type = DataType.OBJREF;
				lookingAtStorageCommand = "astore " + model.getStorageId();
				lookingAtLoadCommand = "aload " + model.getStorageId();
				break;
			}
			if (ctx.expr != null) {
				instructions = visit(ctx.expr) + "\n";
				if (main || type != DataType.OBJREF) {
					instructions += storeCommand + " " + requireVariableIndex(ctx.varName);
				}
				jvmStack.pop();
				return instructions;
			}
			return instructions;
		}
	}

	@Override
	public String visitTypeFieldAssignment(TypeFieldAssignmentContext ctx) {
		StorageModel model;
		int objId;
		if (main || statics.containsKey(ctx.varName.getText())) {
			objId = statics.get(ctx.varName.getText()).getTypeAdress();
			model = requireStaticStorageModel(ctx.varName);
			lookingAtStorageCommand = "putstatic " + header + "/n" + model.getStorageId();
			lookingAtLoadCommand = "getstatic " + header + "/n" + model.getStorageId();
		} else {
			objId = variables.get(ctx.varName).getTypeAdress();
			model = requireStorageModel(ctx.varName);
			lookingAtLoadCommand = "aload " + model.getStorageId();
			lookingAtStorageCommand = "astore " + model.getStorageId();
			if (types.get(ctx.varName.getText()).getVars()
					.get(types.get(ctx.varName.getText()).getAddress(ctx.typeVarName.getText())) == DataType.INT) {
				lookingAtLoadCommand = "iload " + model.getStorageId();
				lookingAtStorageCommand = "istore " + model.getStorageId();
			}
		}
		String get = lookingAtLoadCommand;
		if (main) {
			get += " L" + typeHeader + objId + ";";
		}
		get += '\n';
		String expression = visit(ctx.expr) + '\n';
		int typeVarIndex = (new ArrayList<TypeModel>(types.values())).get(objId).getAddress(ctx.typeVarName.getText());
		String put = "putfield " + typeHeader + objId + "/tn" + typeVarIndex + " "
				+ (new ArrayList<TypeModel>(types.values())).get(objId).getVars().get(typeVarIndex).getJvmType() + "\n";
		String result = get + expression + put;
		jvmStack.pop();
		return result;
	}

	/*
	 * 
	 * if (main || statics.containsKey(ctx.varName.getText())) { StorageModel
	 * model; if(main) { model = requireStorageModel(ctx.varName); } else {
	 * model = requireStaticStorageModel(ctx.varName); } int arrayIndex =
	 * model.getStorageId(); String loadCommand = "iaload"; DataType primitive =
	 * DataType.INT; switch (model.getType()) { case IARRAY: break; case SARRAY:
	 * loadCommand = "aaload"; primitive = DataType.STRING; break; default:
	 * break; } jvmStack.push(DataType.INT); String result = "getstatic " +
	 * header + "/n" + arrayIndex + " [" + primitive.getJvmType() + '\n' +
	 * visit(ctx.index) + '\n' + loadCommand; jvmStack.pop(); jvmStack.pop();
	 * jvmStack.push(primitive); return result;
	 * 
	 * } else { StorageModel model = requireStorageModel(ctx.varName); int
	 * arrayIndex = model.getStorageId(); String loadCommand = "iaload";
	 * DataType primitive = DataType.INT; switch (model.getType()) { case
	 * IARRAY: break; case SARRAY: loadCommand = "aaload"; primitive =
	 * DataType.STRING; break; default: break; } jvmStack.push(DataType.INT);
	 * String result = "aload " + arrayIndex + '\n' + visit(ctx.index) + '\n' +
	 * loadCommand; jvmStack.pop(); jvmStack.pop(); jvmStack.push(primitive);
	 * return result; } //TODO TODO TODO //array ist gar nicht schlecht, nur
	 * muss das aload ersetzt werden.
	 * 
	 * if (main || statics.containsKey(ctx.varName.getText())) { StorageModel
	 * model; if(main) { model = requireStorageModel(ctx.varName); } else {
	 * model = requireStaticStorageModel(ctx.varName); }
	 * jvmStack.push(model.getType()); return "getstatic " + header + "/n" +
	 * model.getStorageId() + " " + model.getType().getJvmType(); } else {
	 * StorageModel model = requireStorageModel(ctx.varName);
	 * jvmStack.push(model.getType()); String loadCommand = "iload"; switch
	 * (model.getType()) { case IARRAY: loadCommand = "aload"; break; case
	 * SARRAY: loadCommand = "aload"; break; case INT: break; case STRING:
	 * loadCommand = "aload"; break; default: break; } return loadCommand + " "
	 * + requireVariableIndex(ctx.varName); } }
	 */
	public String visitAssignment(AssignmentContext ctx) {
		if (ctx.expr == null) {
			return visitChildren(ctx);
		} else {
			if (main || statics.containsKey(ctx.varName.getText())) {
				StorageModel model;
				if (main) {
					model = requireStorageModel(ctx.varName);
				} else {
					model = requireStaticStorageModel(ctx.varName);
				}
				lookingAtStorageCommand = "putstatic " + header + "/n" + model.getStorageId();
				lookingAtLoadCommand = "getstatic " + header + "/n" + model.getStorageId();
				String instructions = visit(ctx.expr) + '\n';
				String targetIndex = Integer.toString(model.getStorageId());
				String result = "";

				switch (model.getType()) {
				case INT:
					result = instructions + "putstatic " + header + "/n" + targetIndex + " I\n";
					jvmStack.pop();
					break;
				case STRING:
					result = instructions + "putstatic " + header + "/n" + targetIndex + " Ljava/lang/String;\n";
					jvmStack.pop();
					break;
				case IARRAY:
					if (ctx.index == null) {
						result = visit(ctx.expr) + "\n" + "putstatic " + header + "/n"
								+ requireVariableIndex(ctx.varName) + " " + DataType.IARRAY.getJvmType();
					} else {
						String index = visit(ctx.index) + '\n';
						result = "getstatic " + header + "/n" + targetIndex + " [I\n" + index + instructions
								+ "iastore\n";
						jvmStack.push(DataType.INT);
						jvmStack.pop();
						jvmStack.pop();
					}
					break;
				case SARRAY:
					if (ctx.index == null) {
						result = visit(ctx.expr) + "\n" + "putstatic " + header + "/n"
								+ requireVariableIndex(ctx.varName) + " " + DataType.SARRAY.getJvmType();
					} else {
						String index = visit(ctx.index) + '\n';
						result = "getstatic " + header + "/n" + targetIndex + " [Ljava/lang/String;\n" + index
								+ instructions + "aastore\n";
						jvmStack.push(DataType.INT);
						jvmStack.pop();
						jvmStack.pop();
					}
					break;
				default:
					break;
				}

				return result;
			} else {
				StorageModel model = requireStorageModel(ctx.varName);
				String instructions = visit(ctx.expr) + '\n';
				String targetIndex = Integer.toString(model.getStorageId());
				String result = "";

				switch (model.getType()) {
				case INT:
					result = instructions + "istore " + targetIndex + '\n';
					lookingAtStorageCommand = "istore " + model.getStorageId();
					lookingAtLoadCommand = "iload " + model.getStorageId();
					jvmStack.pop();
					break;
				case STRING:
					result = instructions + "astore " + targetIndex + '\n';
					lookingAtStorageCommand = "astore " + model.getStorageId();
					lookingAtLoadCommand = "aload " + model.getStorageId();
					jvmStack.pop();
					break;
				case IARRAY:
					String index = visit(ctx.index) + '\n';
					result = "aload " + targetIndex + '\n' + index + instructions + "iastore\n";
					lookingAtStorageCommand = "astore " + model.getStorageId();
					lookingAtLoadCommand = "aload " + model.getStorageId();
					jvmStack.push(DataType.INT);
					jvmStack.pop();
					jvmStack.pop();
					break;
				case SARRAY:
					index = visit(ctx.index) + '\n';
					result = "aload " + targetIndex + '\n' + index + instructions + "aastore\n";
					lookingAtStorageCommand = "astore " + model.getStorageId();
					lookingAtLoadCommand = "aload " + model.getStorageId();
					jvmStack.push(DataType.INT);
					jvmStack.pop();
					jvmStack.pop();
					break;
				default:
					lookingAtStorageCommand = "astore " + model.getStorageId();
					lookingAtLoadCommand = "aload " + model.getStorageId();
					break;
				}

				return result;
			}
		}
	}

	@Override
	public String visitBranch(BranchContext ctx) {
		String conditionInstructions = visit(ctx.condition);
		jvmStack.pop();
		String onTrueInstructions = visit(ctx.onTrue);
		if (onTrueInstructions == null) {
			onTrueInstructions = "";
		}
		String onFalseInstructions = "";
		if (ctx.onFalse != null) {
			onFalseInstructions = visit(ctx.onFalse);
			if (onFalseInstructions == null) {
				onFalseInstructions = "";
			}
		}
		int branchNum = branchCounter;
		branchCounter++;

		return conditionInstructions + "\n" + "ifne ifTrue" + branchNum + "\n" + onFalseInstructions + "\n"
				+ "goto endIf" + branchNum + "\n" + "ifTrue" + branchNum + ":\n" + onTrueInstructions + "\n" + "endIf"
				+ branchNum + ":\n";
	}

	@Override
	public String visitLoop(LoopContext ctx) {
		String conditionInstructions = visit(ctx.condition);
		jvmStack.pop();
		String body = visit(ctx.body);
		if (body == null) {
			body = "";
		}
		int loopNum = loopCounter;
		loopCounter++;

		return "loopStart" + loopNum + ":\n" + conditionInstructions + "\n" + "ifeq endLoop" + loopNum + "\n" + body
				+ "\n" + "goto loopStart" + loopNum + "\n" + "endLoop" + loopNum + ":\n";
	}

	@Override
	public String visitVariable(VariableContext ctx) {
		if (main || statics.containsKey(ctx.varName.getText())) {
			StorageModel model;
			if (main) {
				model = requireStorageModel(ctx.varName);
			} else {
				model = requireStaticStorageModel(ctx.varName);
			}
			jvmStack.push(model.getType());
			return "getstatic " + header + "/n" + model.getStorageId() + " " + model.getType().getJvmType();
		} else {
			StorageModel model = requireStorageModel(ctx.varName);
			jvmStack.push(model.getType());
			String loadCommand = "iload";
			switch (model.getType()) {
			case IARRAY:
				loadCommand = "aload";
				break;
			case SARRAY:
				loadCommand = "aload";
				break;
			case INT:
				break;
			case STRING:
				loadCommand = "aload";
				break;
			default:
				break;
			}
			return loadCommand + " " + requireVariableIndex(ctx.varName);
		}
	}

	@Override
	public String visitConstructorCall(ConstructorCallContext ctx) {
		if (ctx.size != null) {
			String argumentInstructions = visit(ctx.size);
			String newArrayCommand = "newarray";
			String typeSpecial = "int";
			jvmStack.pop();
			DataType type = DataType.IARRAY;
			switch (ctx.type.getText()) {
			case "int":
				break;
			case "string":
				type = DataType.SARRAY;
				newArrayCommand = "anewarray";
				typeSpecial = "java/lang/String";
				break;
			default:
				break;
			}
			jvmStack.push(type);
			return argumentInstructions + '\n' + newArrayCommand + " " + typeSpecial + '\n';
		} else {
			int objId = types.get(ctx.ident.getText()).getId();
			lookingAtObjectId = objId;
			String result = "new " + typeHeader + objId + "\n" + "dup\n" + "invokespecial " + typeHeader + objId
					+ "/<init>()V\n" + lookingAtStorageCommand;
			if (main) {
				result += " " + "L" + typeHeader + objId + ';';
			}
			result += "\n";
			result += visit(ctx.arguments);
			jvmStack.push(DataType.OBJREF);
			return result;
		}
	}

	@Override
	public String visitAssignmentList(AssignmentListContext ctx) {
		String result = "";
		for (int i = 0; i < ctx.assignments.size(); i++) {
			String expression = visit(ctx.assignments.get(i)) + '\n';
			result += lookingAtLoadCommand;
			if (main) {
				result += " " + "L" + typeHeader + lookingAtObjectId + ";";
			}
			result += '\n';
			result += expression;
			String type = (new ArrayList<TypeModel>(types.values())).get(lookingAtObjectId).getVars().get(i)
					.getJvmType();
			result += "putfield " + typeHeader + lookingAtObjectId + "/tn" + i + " " + type + '\n';
		}
		return result;
	}

	@Override
	public String visitSystemCall(SystemCallContext ctx) {
		int numberOfParameters = ctx.arguments.expressions.size();
		String argumentsInstructions = visit(ctx.arguments) + '\n';
		String routine = ctx.funcName.getText();
		String addr = "";
		DataType type;
		switch (routine) {
		case "toString":
			addr = "invokestatic java/lang/Integer.toString(I)Ljava/lang/String;";
			type = DataType.STRING;
			break;
		case "toInt":
			addr = "invokestatic java/lang/Integer.parseInt(Ljava/lang/String;)I";
			type = DataType.INT;
			break;
		case "append":
			String[] split = argumentsInstructions.split("\n");
			addr = "new java/lang/StringBuffer\n" + "dup\n" + "invokespecial java/lang/StringBuffer/<init>()V\n"
					+ split[0] + '\n'
					+ "invokevirtual java/lang/StringBuffer/append(Ljava/lang/String;)Ljava/lang/StringBuffer;\n"
					+ split[1] + '\n'
					+ "invokevirtual java/lang/StringBuffer/append(Ljava/lang/String;)Ljava/lang/StringBuffer;\n"
					+ "invokevirtual java/lang/StringBuffer/toString()Ljava/lang/String;";
			type = DataType.STRING;
			argumentsInstructions = "";
			break;
		case "length":
			type = DataType.INT;
			addr = "arraylength";
			break;
		default:
			throw new SystemFunctionNotFoundException(ctx);
		}
		String instructions = "";
		if (argumentsInstructions != null) {
			instructions += argumentsInstructions;
		}
		instructions += addr;
		for (int i = 0; i < numberOfParameters; i++) {
			jvmStack.pop();
		}
		jvmStack.push(type);
		return instructions;
	}

	@Override
	public String visitFunctionCall(FunctionCallContext ctx) {
		int numberOfParameters = ctx.arguments.expressions.size();
		if (!definedFunctions.contains(ctx.funcName.getText(), numberOfParameters)) {
			throw new UndefinedFunctionException(ctx);
		} else {
			DataType[] params = definedFunctions.get(ctx.funcName.getText(), numberOfParameters).getParams();
			DataType type = definedFunctions.get(ctx.funcName.getText(), numberOfParameters).getType();
			String instructions = "";
			String argumentsInstructions = visit(ctx.arguments);
			if (argumentsInstructions != null) {
				instructions += argumentsInstructions + '\n';
			}
			instructions += "invokestatic " + header + "/" + ctx.funcName.getText() + "(";
			for (DataType paramType : params) {
				instructions += paramType.getJvmType();
			}
			instructions += ")" + type.getJvmType();
			for (int i = 0; i < numberOfParameters; i++) {
				jvmStack.pop();
			}
			jvmStack.push(type);
			return instructions;
		}
	}

	//TODO make type
	@Override
	public String visitImportFunctionCall(ImportFunctionCallContext ctx) {
		int numberOfParameters = ctx.arguments.expressions.size();
		DataType[] params = new DataType[numberOfParameters];
		DataType type = DataType.INT;
		switch (ctx.ident.getText()) {
		case "int":
			break;
		case "string":
			type = DataType.STRING;
			break;
		case "string[]":
			type = DataType.SARRAY;
			break;
		case "int[]":
			type = DataType.IARRAY;
			break;
		default:
			break;
		}
		String instructions = "";
		String argumentsInstructions = "";
		for(int i = 0; i < numberOfParameters; i++) {
			argumentsInstructions += visit(ctx.arguments.expressions.get(i)) + '\n';
			params[i] = jvmStack.peek();
		}
		String paramTypes = "";
		for (DataType dtype: params) {
			paramTypes += dtype.getJvmType();
		}
		if (argumentsInstructions != null) {
			instructions += argumentsInstructions + '\n';
		}
		instructions += "invokestatic " + importedFiles.get(ctx.importDir.getText()).getPath().substring(parentDir.getAbsolutePath().length() + 1) + "/" + ctx.funcName.getText() + "(";
		instructions += paramTypes + ")" + type.getJvmType();
		for (int i = 0; i < numberOfParameters; i++) {
			jvmStack.pop();
		}
		jvmStack.push(type);
		return instructions;
	}

	@Override
	public String visitFunctionDefinition(FunctionDefinitionContext ctx) {
		main = false;
		variables = new HashMap<String, StorageModel>();
		JvmStack oldJvmStack = jvmStack;
		jvmStack = new JvmStack();
		visit(ctx.params);
		String statementInstructions = visit(ctx.statements);
		String result = ".method public static " + ctx.funcName.getText() + "(";
		int numberOfParameters = ctx.params.declarations.size();
		DataType[] params = definedFunctions.get(ctx.funcName.getText(), numberOfParameters).getParams();
		DataType type = DataType.INT;
		String returnType = "ireturn";
		switch (ctx.type.getText()) {
		case "int":
			break;
		case "string":
			type = DataType.STRING;
			returnType = "areturn";
			break;
		default:
			break;
		}
		for (DataType paramType : params) {
			result += paramType.getJvmType();
		}
		result += ")" + type.getJvmType() + "\n" + ".limit locals 100\n" + ".limit stack 100\n"
				+ (statementInstructions == null ? "" : statementInstructions + "\n") + visit(ctx.returnValue) + "\n"
				+ returnType + "\n" + ".end method\n";
		jvmStack.pop();
		variables = new HashMap<>();
		jvmStack = oldJvmStack;
		main = true;
		return result;
	}

	@Override
	public String visitTypeDeclaration(TypeDeclarationContext ctx) {
		String vars = "";
		List<DataType> typeVariables = types.get(ctx.typeName.getText()).getVars();
		int i = 0;
		for (DataType type : typeVariables) {
			vars += ".field public tn" + i + " " + type.getJvmType() + '\n';
			i++;
		}
		int index = types.get(ctx.typeName.getText()).getId();
		return ".class " + typeHeader + index + '\n' + ".super java/lang/Object\n" + "\n" + vars
				+ ".method public <init>()V\n" + "aload_0\n" + "invokespecial java/lang/Object/<init>()V\n" + "return\n"
				+ ".end method\n";
	}

	@Override
	public String visitImportList(ImportListContext ctx) {
		for (int i = 0; i < ctx.importedFiles.size(); i++) {
			String rawAddress = ctx.importedFiles.get(i).getText();
			File file;
			if (rawAddress.startsWith(".")) {
				rawAddress = rawAddress.substring(1, rawAddress.length());
				rawAddress = rawAddress.replaceAll("\\.", "/");
				file = new File(currentDir, rawAddress);
			} else {
				rawAddress = rawAddress.replaceAll("\\.", "/");
				file = new File(parentDir, rawAddress);
			}
			importedFiles.put(file.getName(), file);
		}
		return "";
	}

	/**
	 * recursively visits every token, until the program has been parsed.
	 * returns the result as a string.
	 */
	@Override
	public String visitProgram(ProgramContext ctx) {
		int numberOfImportCalls = ctx.imports.size();

		for (int i = 0; i < numberOfImportCalls; i++) {
			visit(ctx.getChild(i));
		}

		String mainCode = "";
		String functions = "";
		String extraClasses = "";
		for (int i = numberOfImportCalls; i < ctx.getChildCount() - 1; i++) {
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if (child instanceof MainStatementContext) {
				mainCode += instructions + "\n";
			} else if (child instanceof ClassDeclarationContext) {
				extraClasses += "\n*" + instructions + '\n';
			} else {
				functions += instructions + "\n";
			}
		}

		return ".class public " + header + "\n" + ".super java/lang/Object\n" + "\n" + staticVars + '\n' + functions
				+ "\n" + ".method public static main([Ljava/lang/String;)V\n" + ".limit stack 100\n"
				+ ".limit locals 100\n" + "\n" + mainCode + "\n" + "return\n" + "\n" + ".end method" + extraClasses;
	}

	private int requireVariableIndex(Token varNameToken) {
		StorageModel varModel = variables.get(varNameToken.getText());
		if (varModel == null) {
			throw new UndeclaredVariableException(varNameToken);
		} else {
			return varModel.getStorageId();
		}
	}

	private StorageModel requireStorageModel(Token varNameToken) {
		StorageModel varModel = variables.get(varNameToken.getText());
		if (varModel == null) {
			throw new UndeclaredVariableException(varNameToken);
		} else {
			return varModel;
		}
	}

	private StorageModel requireStaticStorageModel(Token varNameToken) {
		StorageModel varModel = statics.get(varNameToken.getText());
		if (varModel == null) {
			throw new UndeclaredVariableException(varNameToken);
		} else {
			return varModel;
		}
	}

	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if (aggregate == null) {
			return nextResult;
		}
		if (nextResult == null) {
			return aggregate;
		}
		return aggregate + "\n" + nextResult;
	}
}
