package de.letsbuildacompiler.exceptions;

import org.antlr.v4.runtime.Token;

import de.letsbuildacompiler.compiler.DataType;
import de.letsbuildacompiler.parser.DemoParser.FunctionCallContext;

public class UndefinedFunctionException extends CompileException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String functionName;
	private DataType[] params;
	
	public UndefinedFunctionException(FunctionCallContext ctx, DataType[] params) {
		super(ctx.funcName);
		Token token = ctx.funcName;
		functionName = token.getText();
		this.params = params;
	}
	
	@Override
	public String getMessage() {
		String result = line + ":" +column + " undeclared function <" + functionName + "(";
		for(int i = 0; i < params.length - 1; i++) {
			result += params[i].toString() + ", ";
		}
		result += params[params.length-1].toString() + ")>";
		return result;
	}
}
