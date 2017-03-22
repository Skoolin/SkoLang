package de.letsbuildacompiler.exceptions;

import org.antlr.v4.runtime.Token;

import de.letsbuildacompiler.compiler.DataType;
import de.letsbuildacompiler.compiler.StorageModel;
import de.letsbuildacompiler.parser.DemoParser.FunctionCallContext;

public class UndefinedFunctionException extends CompileException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String functionName;
	private StorageModel[] params;
	
	public UndefinedFunctionException(FunctionCallContext ctx, StorageModel[] params2) {
		super(ctx.funcName);
		Token token = ctx.funcName;
		functionName = token.getText();
		this.params = params2;
	}
	
	@Override
	public String getMessage() {
		String result = line + ":" +column + " undeclared function <" + functionName + "(";
		for(int i = 0; i < params.length - 1; i++) {
			result += params[i].getType().toString() + ", ";
		}
		result += params[params.length-1].getType().toString() + ")>";
		return result;
	}
}
