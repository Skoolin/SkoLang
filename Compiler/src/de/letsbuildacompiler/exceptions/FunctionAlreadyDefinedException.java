package de.letsbuildacompiler.exceptions;

import org.antlr.v4.runtime.Token;

public class FunctionAlreadyDefinedException extends CompileException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String functionName;
	
	public FunctionAlreadyDefinedException(Token functionNameToken) {
		super(functionNameToken);
		this.functionName = functionNameToken.getText();
	}

	@Override
	public String getMessage() {
		return line + ":" +column + " already declared function <" + functionName + "()>";
	}
	
}
