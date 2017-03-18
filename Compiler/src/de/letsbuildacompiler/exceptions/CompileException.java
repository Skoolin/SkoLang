package de.letsbuildacompiler.exceptions;

import org.antlr.v4.runtime.Token;

public class CompileException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int line;
	protected int column;
	
	public CompileException(Token token) {
		line = token.getLine();
		column = token.getCharPositionInLine();
	}
}