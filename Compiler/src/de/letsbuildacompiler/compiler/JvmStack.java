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
	private Deque<DataType> typesOnStack = new LinkedList<>();
	
	/**
	 * pushes the type on top of stack
	 * @param type
	 */
	public void push(DataType type) {
		typesOnStack.push(type);
	}

	/**
	 * @return the DaType on top of stack
	 */
	public DataType pop() {
		return typesOnStack.pop();
	}
}
