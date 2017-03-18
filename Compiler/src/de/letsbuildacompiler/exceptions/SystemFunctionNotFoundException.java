package de.letsbuildacompiler.exceptions;

import org.antlr.v4.runtime.Token;

import de.letsbuildacompiler.parser.DemoParser.SystemCallContext;

public class SystemFunctionNotFoundException extends CompileException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String functionName;
	private int numberOfParams;
	
	public SystemFunctionNotFoundException(SystemCallContext ctx) {
		super(ctx.funcName);
		Token token = ctx.funcName;
		functionName = token.getText();
		numberOfParams = ctx.arguments.expressions.size();
	}
	
	@Override
	public String getMessage() {
		return line + ":" +column + " system function not found: <" + functionName + "(" + numberOfParams + ")>";
	}
}
