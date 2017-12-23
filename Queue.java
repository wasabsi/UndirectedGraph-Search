package edu.cofc.csci230;

import java.util.NoSuchElementException;

/**
 * First In First Out (FIFO) Queue
 * @param <AnyType>
 */
public interface Queue<AnyType> {
	
	/**
	 * Inserts the specified element at the end the queue.
	 * 
	 * @param t element to add
	 * @throws NullPointerException- if the specified element is null (queue does not permit null elements)
	 */
	public void add( AnyType t ) throws NullPointerException;
	
	/**
	 * Retrieves and removes the head of the queue.
	 * 
	 * @return the head of the queue
	 * @throws NoSuchElementException - if this queue is empty
	 */
	public AnyType remove() throws NoSuchElementException;
	
	/**
	 * Retrieves, but does not remove, the head of the queue, or 
	 * returns null if the queue is empty.
	 * 
	 * @return the head of this queue, or null if the queue is empty
	 */
	public AnyType peek();

} // end Queue interface description
