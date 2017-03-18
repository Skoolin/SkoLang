package de.letsbuildacompiler.compiler;

public class CustomDataType {
	private DataType type;
	private int CustomTypeId;
	
	public CustomDataType(DataType type, int CustomTypeId) {
		this.type = type;
		this.CustomTypeId = CustomTypeId;
	}
	
	public DataType getType() {
		return type;
	}
	
	public int getCustomTypeId() {
		return CustomTypeId;
	}
}
