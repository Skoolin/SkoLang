package de.letsbuildacompiler.compiler;

import java.util.List;
import java.util.Map;

/**
 * @author skolin
 *
 *  stores informations for a custom DataType.
 *  its vars are a list of DataTypes, wich are stored in such a dataType.
 */
public class TypeModel {
	/**
	 * the id of the Type.
	 */
	private int id;
	
	/**
	 * a list of all DataTypes in the right order
	 */
	private List<DataType> vars;
	
	/**
	 * a Map of DataType field names to their index in the List
	 */
	private Map<String, Integer> varNames;
	
	/**
	 * creates a new TypeModel with index id.
	 * @param id
	 * @param vars
	 * @param varNames
	 */
	public TypeModel(int id, List<DataType> vars, Map<String, Integer> varNames) {
		this.id = id;
		this.vars = vars;
		this.varNames = varNames;
	}
	
	/**
	 * @return the id of the dataType
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return list of DataType field types
	 */
	public List<DataType> getVars() {
		return vars;
	}
	
	/**
	 * returns the index of the field with the given name
	 * @param name
	 * @return field index
	 */
	public int getAddress(String name) {
		return varNames.get(name);
	}
}
