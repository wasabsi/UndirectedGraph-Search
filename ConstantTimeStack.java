package edu.cofc.csci230;

import java.util.EmptyStackException;

/**
 * A LIFO stack that has constant time complexity O(1) for
 * all three stack interface methods (i.e., push, pop, and 
 * peek).
 * 
 * This data structure was discussed in class along with the 
 * operations, please review your notes.
 * 
 * @author CSCI 230: Data Structures and Algorithms Fall 2017
 *
 * @param <AnyType>
 */
public class ConstantTimeStack<AnyType extends Comparable<AnyType>> implements Stack<AnyType> {
	
	/**
	 * private instance variables
	 */
	private SinglyLinkedList<AnyType> list = new SinglyLinkedList<AnyType>();

	/**
	 * Pushes an item onto the top of this stack in constant 
	 * time O(1)
	 * 
	 * @param t the item to be pushed onto this stack.
	 */
	public void push(AnyType t) {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your push solution must be a constant 
         * time O(1) operation
         * 
         */
		list.add(0,t);
		
		
		
	} // end push() method

	/**
	 * Removes the object at the top of this stack and return the 
	 * item in constant time O(1)
	 * .
	 * @return The item at the top of this stack
	 * @throws EmptyStackException - if this stack is empty.
	 */
	public AnyType pop() throws EmptyStackException {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your pop solution must be a constant 
         * time O(1) operation
         * 
         */
		
		return list.remove(0);
		//size-1
		
		
		
	} // end pop() method

	/**
	 * Looks at the item at the top of this stack without removing it 
	 * from the stack in constant time O(1)
	 * 
	 * @return the item at the top of this stack
	 * @throws EmptyStackException  - if this stack is empty.
	 */
	public AnyType peek() throws EmptyStackException {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your peek solution must be a constant 
         * time O(1) operation
         * 
         */
		
		if (list.size()==0){
			throw new EmptyStackException();
			
		}else{
			return list.get(0);
		}
		
		
		
	} // end peek() method
	
	/**
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {
		
		/**
         * -------------------------------------------
         * TODO: You put your test cases here
         * 
         */
		ConstantTimeStack<Integer> test = new ConstantTimeStack<Integer>();
		test.push(3);
		
		test.push(9);
		test.push(-1);
		test.push(9);
		test.pop();
		test.pop();
		test.pop();
		test.pop();
		test.push(8);
		//test.pop();
		
		
		
		System.out.println(test.peek());
		
	} // end main method
	
} // end ConstantTimeStack class definition
