package de.letsbuildacompiler.exceptions;

import org.antlr.v4.runtime.Token;

public class WrongDataTypeException extends CompileException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String expression;

	public WrongDataTypeException(Token funcName) {
		super(funcName);
		this.expression = funcName.getText();
	}
	
	@Override
	public String getMessage() {
		return line + ":" +column + " wrong data type for <" + expression + "()>";
	}
}
