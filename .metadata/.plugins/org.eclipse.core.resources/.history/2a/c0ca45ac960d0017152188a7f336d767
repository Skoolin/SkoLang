package de.letsbuildacompiler.compiler;

/**
 * 
 * useful for all kinds of stuff. examples: show items on stack tell jvm, which
 * DataType to use differentiate between primitive, array and custom type etc
 * 
 * @author skolin
 * 
 */
public enum DataType {
	INT("I", "int"), FLOAT("F", "float"), STRING("Ljava/lang/String;", "string"), VOID("V", "void"), IARRAY("[I",
			"int[]"), FARRAY("[F", "float[]"), SARRAY("[Ljava/lang/String;", "string[]"), OBJREF("", "");

	private final String jvmType;
	private final String toString;

	private DataType(String jvmType, String toString) {
		this.jvmType = jvmType;
		this.toString = toString;
	}

	/**
	 * @return the type, as it can be used by the JVM
	 */
	public String getJvmType() {
		return jvmType;
	}
	
	public String toString() {
		return toString;
	}
}
