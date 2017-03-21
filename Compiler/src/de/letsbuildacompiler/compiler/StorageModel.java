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
	
	public StorageModel(int storageId, DataType type) {
		this.storageId = storageId;
		this.type = type;
	}
	
	public StorageModel(int storageId, DataType type, int typeAddress) {
		this.storageId = storageId;
		this.type = type;
		this.typeAddress = typeAddress;
	}
	
	public int getTypeAdress() {
		return typeAddress;
	}

	public int getStorageId() {
		return storageId;
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

}
