package de.letsbuildacompiler.compiler;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 * @author skolin
 * 
 * is a stack of DataTypes, which shows, which DataType is currently on top of the JVM stack and will therefore be taken in by the next function call.
 */
public class JvmStack {
	private Deque<StorageModel> typesOnStack = new LinkedList<>();
	private int maxStackSize = 0;
	
	/**
	 * pushes the type on top of stack
	 * @param type
	 */
	public void push(StorageModel type) {
		if(type.getType() != DataType.VOID) {
			typesOnStack.push(type);	
		}
		if(typesOnStack.size() > maxStackSize) {
			maxStackSize++;
		}
	}

	/**
	 * @return the DaType on top of stack
	 */
	public StorageModel pop() {
		return typesOnStack.pop();
	}
	
	public StorageModel peek() {
		return typesOnStack.peek();
	}
	
	public int getMaxStackSize() {
		return maxStackSize + 1;
	}
}
