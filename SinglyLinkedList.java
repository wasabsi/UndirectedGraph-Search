package edu.cofc.csci230;


/**
 * Singly LinkedList Data Structure
 * 
 * @author CSCI 230: Data Structures and Algorithms Fall 2017
 *
 * @param <AnyType>s
 */
public class SinglyLinkedList<AnyType extends Comparable<AnyType>> implements List<AnyType> {
    
    // instance variables
    private Node<AnyType> headNode = null;
    private int size = 0;
    
    /**
     * Appends the specified element to the end of this list.
     * 
     * @param t
     */
    public void add( AnyType t) {
        
        addNode( new Node<AnyType>(t) );
        
    } // end add() method
    
    /**
     * implementation for public add(AnyType t) method
     * 
     * @param t
     */
    private void addNode(Node<AnyType> t) {
        
        if ( isEmpty() ) headNode = t;
        else getNode( size-1 ).setNextNode( t );
        
        size++;
        
    } // end addNote() method
    
    
    /**
     * Inserts the specified element at the specified position in this list.
     * 
     * @param index
     * @param t
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, AnyType t) throws IndexOutOfBoundsException {
        
        addNode( index, new Node<AnyType>(t) );
        
    } // end add() method
    
    /*
     * 
     * Implementation for public add(int index, AnyType t) method
     * 
     */
    private void addNode(int index, Node<AnyType> t) throws IndexOutOfBoundsException {
        
        if ( index == 0 ) {
            
            t.setNextNode( headNode );
            headNode = t;
            size++;
            
        } else if ( index == size ) {
            
            addNode( t );
            
        } else {
            
            t.setNextNode( getNode( index ) );
            getNode( index - 1 ).setNextNode( t );
            size++;
            
        }
        
    } // end addNode() method
    
    /**
     * Replaces the element at the specified position in this list with the specified element.
     * 
     * @param index
     * @param t
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, AnyType t) throws IndexOutOfBoundsException {
        
        setNode( index, new Node<AnyType>(t) );
        
    } // end set() method
    
    /**
     * 
     * @param index
     * @param t
     * @throws IndexOutOfBoundsException
     */
    private void setNode( int index, Node<AnyType> t )  throws IndexOutOfBoundsException {
        
            getNode( index ).setData( t.getData() );
        
    } // end setNode() method
    
    
    /**
     * Removes the element at the specified position in this list.
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    public AnyType remove( int index ) throws IndexOutOfBoundsException {
        
        return removeNode( index ).getData();
        
    } // end remove() method
    
    /**
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    private Node<AnyType> removeNode( int index ) throws IndexOutOfBoundsException {
        
        Node<AnyType> node = getNode( index );
        
        if ( index == 0 ) {
            
            headNode = node.getNextNode();
            
        } else {
            
            getNode( index - 1 ).setNextNode( node.getNextNode() );
            
        }
        
        size--;
        
        return node;
        
    } // end removeNode() method
    
    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    public AnyType get( int index ) throws IndexOutOfBoundsException {
        
        return getNode( index ).getData();
        
    } // end get() method
    
    /**
     * Implementation for get(int index) method
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    private Node<AnyType> getNode(int index) throws IndexOutOfBoundsException {
        
        if ( index < 0 || index >= size ) {
            
            System.out.printf( "index = %d, size = %d\n", index, size );
            
            throw new IndexOutOfBoundsException();
            
        }
        
        Node<AnyType> node = headNode;
        
        for ( int i=1; i<=index; i++ ) {
            
            node = node.getNextNode();
            
        }
        
        return node;
        
    } // end get() method
    
    /**
     * Returns the number of elements in this list. 
     * 
     * @return
     */
    public int size() {
        
        return size;
        
    } // end size() method
    
    /**
     * Returns true if this list contains no elements.
     * 
     * @return
     */
    public Boolean isEmpty() {
        
        return ( size == 0 ) ? true : false;
        
    } // end isEmpty() method
    
    
    /**
     * Removes all of the elements from this list.
     * 
     */
    public void clear() {
        
        headNode = null;
        size=0;
        
    } // end clear method
    
    /**
     * swap two elements in a list at index 
     * position i and j.
     * 
     * For example, 
     *  if A = 1->2->3->4->5 and swap( 1, 3 ) is executed
     *  then A = 1->4->3->2->5
     *
     * @param i
     * @param j
     * @throws IndexOutOfBoundsException
     */
    public void swap( int i, int j )  throws IndexOutOfBoundsException {
        
        /**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
    	if(i < 0 || i >= size() || j < 0 || j > size() || j == i ){
    		throw new IndexOutOfBoundsException();
    	}else{
    		AnyType iData = getNode(i).getData();
    		AnyType jData = getNode(j).getData();
    		getNode(i).setData(jData);
    		getNode(j).setData(iData);
    	}
    	
        
        
        
    } // end swap() method
    
    
    /**
     * For debugging purposes :)
     * 
     * 
     */
    public String toString() {
        
        StringBuffer buffer = new StringBuffer();
        
        buffer.append( String.format( "Size=%d, A = [ ", size ) );
        
        if ( !isEmpty() ) {
            
            for ( int i=0; i<size-1; i++ ) {
                buffer.append( String.format( "%d, ", get(i) ) );    
            }
            
            buffer.append( String.format( "%d ]", get(size-1 ) ) );
            
        } else {
            
            buffer.append( "] " );
        }
        
        return buffer.toString();
        
    } // end toString()
    
    
    /**
     * 
     * @param args
     */
    public static void main( String[] args ) {
                
        // -------------------------------------
        // Put your test cases here
        // -------------------------------------
    	SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
    	
       
//    	for (int i = 0; i< 30; i++){
//    		list.add(i%18);
//    	}
    	
    	
    	//Utils.selectionSort(list);
    	//Utils.insertionSort(list);
    	//Utils.bubbleSort(list);
    	
    	list.add(0,1);
    	list.add(1,5);
    	list.add(2,4);
    	//list.swap(0,1);
    	//list.swap(1,1);
    	//list.swap(0,3);
    	
    	
    	
    	System.out.println(list);

                
    } // end main() method
    
} // end SinglyLinkedList class definition