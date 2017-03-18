package de.letsbuildacompiler.compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

import de.letsbuildacompiler.exceptions.FunctionAlreadyDefinedException;
import de.letsbuildacompiler.exceptions.VariableAlreadyDefinedException;
import de.letsbuildacompiler.parser.DemoBaseVisitor;
import de.letsbuildacompiler.parser.DemoParser.ClassDeclarationContext;
import de.letsbuildacompiler.parser.DemoParser.FunctionDefinitionContext;
import de.letsbuildacompiler.parser.DemoParser.MainStatementContext;
import de.letsbuildacompiler.parser.DemoParser.ProgramContext;
import de.letsbuildacompiler.parser.DemoParser.TypeDeclarationContext;
import de.letsbuildacompiler.parser.DemoParser.VarDeclarationContext;

public class FunctionDefinitionFinder {
	
	/**
	 * parses over the whole code and remembers all functions. returns these as a FunctionList.
	 * @param tree
	 * @return a list of all functions in the Program
	 */
	public static FunctionList findFunctions(ParseTree tree) {
		final FunctionList definedFunctions = new FunctionList();
		definedFunctions.add("toString", new DataType[] { DataType.INT }, DataType.STRING);
		definedFunctions.add("toInt", new DataType[] { DataType.STRING }, DataType.INT);
		definedFunctions.add("write", new DataType[] { DataType.INT }, DataType.VOID);
		definedFunctions.add("out", new DataType[] { DataType.INT }, DataType.VOID);
		definedFunctions.add("write", new DataType[] { DataType.STRING }, DataType.VOID);
		definedFunctions.add("out", new DataType[] { DataType.STRING }, DataType.VOID);
		definedFunctions.add("append", new DataType[] { DataType.STRING, DataType.STRING }, DataType.STRING);
		definedFunctions.add("length", new DataType[] {DataType.IARRAY}, DataType.INT);
		definedFunctions.add("length", new DataType[] {DataType.SARRAY}, DataType.INT);
		
		new DemoBaseVisitor<Void>() {
			@Override
			
			public Void visitFunctionDefinition(FunctionDefinitionContext ctx) {
				String functionName = ctx.funcName.getText();
				int parameterCount = ctx.params.declarations.size();
				DataType[] params = new DataType[parameterCount];
				for(int i = 0; i < parameterCount; i++) {
					DataType paramType = DataType.INT;
					switch (ctx.params.declarations.get(i).type.getText()) {
					case "int":
						break;
					case "string":
						paramType = DataType.STRING;
						break;
					case "string[]":
						paramType = DataType.SARRAY;
						break;
					case "int[]":
						paramType = DataType.IARRAY;
						break;
					default:
						break;
					}
					params[i] = paramType;
				}
				DataType type = DataType.INT;
				switch (ctx.type.getText()) {
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
				if (definedFunctions.contains(functionName, parameterCount)) {
					throw new FunctionAlreadyDefinedException(ctx.funcName);
				}
				definedFunctions.add(functionName, params, type);
				return null;
			}
		}.visit(tree);
		return definedFunctions;
	}
	
	/**
	 * returns all types defined in the program as a HashMap<String, TypeModel>. 
	 * @param tree
	 * @return list of all types
	 */
	public static LinkedHashMap<String, TypeModel> findTypes(ParseTree tree) {
		final LinkedHashMap<String, TypeModel> types = new LinkedHashMap<>();
		
		
		new DemoBaseVisitor<Void>() {
			int storageId = 0;
			
			@Override
			public Void visitProgram(ProgramContext ctx) {
				
				for(ParseTree child: ctx.children) {
					if(child instanceof ClassDeclarationContext) {
						visit(child);
					}
				}
				
				return null;
			};
			
			public Void visitTypeDeclaration(TypeDeclarationContext ctx) {
				
				List<DataType> consts = new ArrayList<>();
				Map<String, Integer> varNames = new HashMap<>();
				
				for (int i = 0; i < ctx.declarations.declarations.size(); i++) {
					DataType type = DataType.INT;
					switch(ctx.declarations.declarations.get(i).type.getText()) {
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
					consts.add(type);
					varNames.put(ctx.declarations.declarations.get(i).varName.getText(), i);
				}
				
				types.put(ctx.typeName.getText(), new TypeModel(storageId, consts, varNames));
				
				storageId++;
				return null;
			};
			
		}.visit(tree);
		return types;
	}
	
	/**
	 * returns all static variables. takes in all types to link variables of custom type with their type id.
	 * @param tree
	 * @param types
	 * @return a list of all static variables
	 */
	public static Map<String, StorageModel> findStatics(ParseTree tree, LinkedHashMap<String, TypeModel> types) {
		final Map<String, StorageModel> statics = new HashMap<>();
		
		
		new DemoBaseVisitor<Void>() {
			int storageId = 0;
			
			@Override
			public Void visitProgram(ProgramContext ctx) {
				
				for(ParseTree child: ctx.children) {
					if(child instanceof MainStatementContext) {
						visit(child);
					}
				}
				
				return null;
			};
			
			@Override		
			public Void visitVarDeclaration(VarDeclarationContext ctx) {
				DataType type = DataType.INT;
				switch(ctx.type.getText()) {
				case "int":
					break;
				case "string":
					type = DataType.STRING;
					break;
				case "int[]":
					type = DataType.IARRAY;
					break;
				case "string[]":
					type = DataType.SARRAY;
					break;
				default:
					type = DataType.OBJREF;
					break;
				}
				if (statics.containsKey(ctx.varName.getText())) {
					throw new VariableAlreadyDefinedException(ctx.varName);
				}
				if(type == DataType.OBJREF) {
					statics.put(ctx.varName.getText(), new StorageModel(storageId, type, types.get(ctx.type.getText()).getId()));
				} else {
					statics.put(ctx.varName.getText(), new StorageModel(storageId, type));
				}
				storageId++;
				return null;
			}
		}.visit(tree);
		return statics;
	}
}
