package edu.cofc.csci230;

import java.util.EmptyStackException;

/**
 * Last in First Out (LIFO) Stack
 * @param <AnyType>
 */
public interface Stack<AnyType> {
	
	/**
	 * Pushes an item onto the top of the stack.
	 * 
	 * @param t the item to be pushed onto this stack.
	 */
	public void push( AnyType t );
	
	/**
	 * Removes the object at the top of the stack and returns the 
	 * item
	 * .
	 * @return The item at the top of this stack
	 * @throws EmptyStackException - if this stack is empty.
	 */
	public AnyType pop() throws EmptyStackException;
	
	/**
	 * Looks at the item at the top of the stack without removing it 
	 * from the stack.
	 * 
	 * @return the item at the top of this stack
	 * @throws EmptyStackException  - if this stack is empty.
	 */
	public AnyType peek() throws EmptyStackException;

} // end Stack interface description
