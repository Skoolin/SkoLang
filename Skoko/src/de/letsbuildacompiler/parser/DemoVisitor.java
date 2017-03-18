// Generated from Demo.g4 by ANTLR 4.6
package de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DemoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(DemoParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(DemoParser.MainStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProgPartFunctionDefinition}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgPartFunctionDefinition(DemoParser.ProgPartFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclaration}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DemoParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DemoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(DemoParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(DemoParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DemoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DemoParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCallExpression}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpression(DemoParser.FuncCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(DemoParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeElement}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeElement(DemoParser.TypeElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constructor}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(DemoParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(DemoParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DemoParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SystemFunctions}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemFunctions(DemoParser.SystemFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(DemoParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DemoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(DemoParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeArrayField}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArrayField(DemoParser.TypeArrayFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(DemoParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(DemoParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(DemoParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayElement}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(DemoParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(DemoParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(DemoParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(DemoParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DemoParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#typeFieldAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFieldAssignment(DemoParser.TypeFieldAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(DemoParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DemoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(DemoParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(DemoParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#typeParameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterDeclaration(DemoParser.TypeParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(DemoParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(DemoParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#systemCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemCall(DemoParser.SystemCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DemoParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DemoParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#constructorCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(DemoParser.ConstructorCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(DemoParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(DemoParser.PrimitiveContext ctx);
}