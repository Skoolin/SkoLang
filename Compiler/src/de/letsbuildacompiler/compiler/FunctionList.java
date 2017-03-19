package de.letsbuildacompiler.compiler;

import java.util.ArrayList;
import java.util.Collection;

public class FunctionList {
	private Collection<FunctionDefinition> definitions;
	
	public FunctionList() {
		definitions = new ArrayList<FunctionDefinition>();
	}
	
	public boolean contains(String functionName, DataType[] params) {
		for(FunctionDefinition definition: definitions) {			
			DataType[] old = definition.getParams();
			if (old.length == params.length) {
				for (int i = 0; i < old.length; i++) {
					boolean match = true;
					if(old[i] != params[i]) {
						match = false;
						break;
					}
					if(match) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public int length() {
		return definitions.size();
	}
	
	public void add(String functionName, DataType[] params, DataType type) {
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
