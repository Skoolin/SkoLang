package de.letsbuildacompiler.exceptions;

import org.antlr.v4.runtime.Token;

import de.letsbuildacompiler.parser.DemoParser.FunctionCallContext;

public class UndefinedFunctionException extends CompileException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String functionName;
	private int numberOfParams;
	
	public UndefinedFunctionException(FunctionCallContext ctx) {
		super(ctx.funcName);
		Token token = ctx.funcName;
		functionName = token.getText();
		numberOfParams = ctx.arguments.expressions.size();
	}
	
	@Override
	public String getMessage() {
		return line + ":" +column + " undeclared function <" + functionName + "(" + numberOfParams + ")>";
	}
}
