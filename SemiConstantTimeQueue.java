package edu.cofc.csci230;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * A semi-constant time FIFO queue. The time complexity for 
 * the interface methods are:
 * ----------------------------------
 * 1) add: O(1) - not considering capacity resize operations
 * 2) remove: O(n) - not considering capacity resize operations
 * 3) peek: O(1)
 * 
 * Please note: the above time complexities do not factor in
 * capacity resize (grow and shrink) operations. Even though
 * capacity resize operations will occur, for this assignment 
 * you may assume the are negligible.
 * 
 * This data structure was discussed in class along with the 
 * operations, please review your notes.
 * 
 * @author CSCI 230: Data Structures and Algorithms Fall 2017
 *
 * @param <AnyType>
 */
public class SemiConstantTimeQueue<AnyType extends Comparable<AnyType>> implements Queue<AnyType> {
	
	/**
	 * private instance variables
	 */
	private ArrayList<AnyType> list = new ArrayList<AnyType>();


	/**
	 * Inserts the specified element at the end of the queue in 
	 * constant time O(1)
	 * 
	 * @param t element to add
	 * @throws NullPointerException- if the specified element is null 
	 *                               (queue does not permit null elements)
	 */
	public void add(AnyType t) throws NullPointerException {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your add solution must be a constant 
         * time O(1) operation (*** not considering capacity 
         * resize operations ***)
         * 
         */
		if(t == null){
			throw new NullPointerException();	
		}else{
			list.add(t);
		}
		
		
	} // end add() method

	/**
	 * Retrieves and removes the head of the queue in
	 * linear time O(n).
	 * 
	 * Hint: shift operations will make this a linear time
	 * operation.
	 * 
	 * @return the head of the queue
	 * @throws NoSuchElementException - if this queue is empty
	 */
	public AnyType remove() throws NoSuchElementException {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your push solution must be a linear 
         * time O(n) operation. See hint above.
         * 
         *
         */
		if (list.isEmpty()){
			throw new NoSuchElementException();
		}else{
			return list.remove(0);
		}
		
		
		
	} // end remove() method

	/**
	 * Retrieves, but does not remove, the head of the queue, 
	 * or returns null if this queue is empty.
	 * 
	 * @return the head of this queue, or null if this queue is empty
	 */
	public AnyType peek() {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your add solution must be a constant 
         * time O(1) operation 
         * 
         */
		return list.get(0);
		
		
		
	} // end peek() method
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
         * -------------------------------------------
         * TODO: You put your test cases here
         * 
         */
		SemiConstantTimeQueue<Integer> test = new SemiConstantTimeQueue<Integer>();
		test.add(3);
		test.add(4);
		test.add(6);
		test.remove();
		test.remove();
		
		test.remove();
		test.add(9);
		System.out.println(test.peek());
		

	} // end main() method

} // end SemiConstantTimeQueue class definition

