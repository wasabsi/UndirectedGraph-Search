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
 * capacity resize (grow and shrink) operations. 
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
	 * @return the head of the queue
	 * @throws NoSuchElementException - if this queue is empty
	 */
	public AnyType remove() throws NoSuchElementException {
		
	
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
		
	
		return list.get(0);
		
		
		
	} // end peek() method
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
	
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

