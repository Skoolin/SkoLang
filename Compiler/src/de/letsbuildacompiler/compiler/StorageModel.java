package de.letsbuildacompiler.compiler;

/**
 * Contains Information about one variable.
 * careful: Only custom type Variables have a typeAddress
 * 
 * @author skolin
 * 
 */
public class StorageModel {
	
	private int storageId;
	private DataType type;
	
	/**
	 * the address of the type class file
	 */
	private int typeAddress;
	private String programName;
	
	public StorageModel(DataType type) {
		this.type = type;
	}
	
	public StorageModel(int storageId, DataType type) {
		this.storageId = storageId;
		this.type = type;
	}
	
	public StorageModel(int storageId, DataType type, int typeAddress) {
		this.storageId = storageId;
		this.type = type;
		this.typeAddress = typeAddress;
	}
	
	public StorageModel(DataType type, int typeAdress) {
		this.type = type;
		this.typeAddress = typeAdress;
	}
	
	public StorageModel(DataType type, int typeAddress, String programName) {
		this.type = type;
		this.typeAddress = typeAddress;
		this.programName = programName;
	}

	public int getTypeAdress() {
		return typeAddress;
	}

	public int getStorageId() {
		return storageId;
	}

	public String getProgramName() {
		return programName;
	}
	
	public DataType getType() {
		return type;
	}

	public boolean isArray() {
		switch (this.type) {
		case IARRAY:
		case FARRAY:
		case SARRAY:
			return true;
		default:
			return false;
		}
	}
	
	public String getJvmType() {
		if(type != DataType.OBJREF) {
			return type.getJvmType();
		} else {
			return "" + typeAddress;
		}
	}
	
	public static StorageModel getStorageModel(String type) {
		return new StorageModel(DataType.getType(type));
	}

}
