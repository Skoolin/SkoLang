package de.letsbuildacompiler.compiler;

import java.util.ArrayList;
import java.util.Collection;

public class FunctionList {
	private Collection<FunctionDefinition> definitions;
	
	public FunctionList() {
		definitions = new ArrayList<FunctionDefinition>();
	}
	
	public boolean contains(String functionName, StorageModel[] params) {
		for(FunctionDefinition definition: definitions) {
			StorageModel[] old = definition.getParams();
			if (old.length == params.length && functionName.equals(definition.getFunctionName())) {
				if(old.length == 0 && params.length == 0) {
					return true;
				}
				boolean match = true;
				for (int i = 0; i < old.length; i++) {
					if(old[i].getType() != params[i].getType()) {
						match = false;
						break;
					}
				}
				if(match) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int length() {
		return definitions.size();
	}
	
	public void add(String functionName, StorageModel[] params, StorageModel type) {
		definitions.add(new FunctionDefinition(functionName, params, type));
	}
	
	public FunctionDefinition get(String functionName, int parameterCount) {
		for(FunctionDefinition definition: definitions) {			
			if (definition.getFunctionName().equals(functionName) && definition.getParameterCount() == parameterCount) {
				return definition;
			}
		}
		return null;
	}
}
