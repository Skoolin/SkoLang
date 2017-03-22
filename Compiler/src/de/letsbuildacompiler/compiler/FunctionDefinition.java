package de.letsbuildacompiler.compiler;

public class FunctionDefinition {
	private String functionName;
	private StorageModel[] params;
	private StorageModel type;

	public FunctionDefinition(String functionName, StorageModel[] params, StorageModel type) {
		this.functionName = functionName;
		this.params = params;
		this.type = type;
	}
	
	public StorageModel getType() {
		return type;
	}

	public String getFunctionName() {
		return functionName;
	}

	public int getParameterCount() {
		return params.length;
	}
	
	public StorageModel[] getParams() {
		return params;
	}
}