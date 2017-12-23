package edu.cofc.csci230;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * Undirected and unweighted graph data structure.
 * 
 *
 * @param <AnyType>
 */
public class UndirectedGraph<AnyType extends Comparable<AnyType>> {

	/**
	 * Adjacency list data structure. Used in conjunction with
	 * adjacent_vertex_list in each Vertex class.
	 * 
	 * Note: Each vertex in the adjacency list must be unique, i.e. the list
	 * cannot contain two vertices that have the same value.
	 */
	private List<Vertex<AnyType>> vertex_adjacency_list = null;

	
	public UndirectedGraph() {

		vertex_adjacency_list = new ArrayList<Vertex<AnyType>>();

	} // end constructor

	/**
	 * Add an edge between two vertices
	 * 
	 * @param vertex_value_A
	 * @param vertex_value_B
	 * @return
	 * @throws VertexException
	 */
	public Boolean addEdge(AnyType vertex_value_A, AnyType vertex_value_B) throws VertexException {


		boolean vertex_A_exist = false;
		boolean vertex_B_exist = false;
		boolean vertex_A_and_B_exist = false;

		Vertex<AnyType> vertVal1 = null;
		Vertex<AnyType> vertVal2 = null;

		for (int i = 0; i < vertex_adjacency_list.size(); i++) { //Step 1
			// check for the existence of vertex A and B

			if (vertex_value_A.compareTo(vertex_adjacency_list.get(i).getValue()) == 0) {
				vertex_A_exist = true;
				vertVal1 = vertex_adjacency_list.get(i);
			} else if (vertex_value_B.compareTo(vertex_adjacency_list.get(i).getValue()) == 0) {
				vertex_B_exist = true;
				vertVal2 = vertex_adjacency_list.get(i);
			}
		}
		/*
		 * if ( vertex_A_exist && vertex_B_exist) { vertex_A_and_B_exist = true;
		 * } if(vertex_A_and_B_exist == false){
		 */
		//if the vertexes do not exist - add them to adjacency list
		if(vertVal1 == null){
			vertVal1 = new Vertex(vertex_value_A);
			vertex_adjacency_list.add(vertVal1);
		}
		if(vertVal2 == null){
			vertVal2 = new Vertex(vertex_value_B);
			vertex_adjacency_list.add(vertVal2);
		}
		
		for (int j = 0; j < vertVal1.numberOfAdjacentVertices(); j++) { //Step 2
			//Vertex<AnyType> vertexVal = vertVal1.getAdjacentVertex(j);
			if (vertVal2.compareTo(vertVal1.getAdjacentVertex(j)) == 0) {
				//vertVal1.addAdjacentVertex(vertexVal);
			//} else {
				return false;
			}
		}
		for (int j = 0; j < vertVal2.numberOfAdjacentVertices(); j++) {
			//Vertex<AnyType> vertexVal = vertVal2.getAdjacentVertex(j);
			if (vertVal1.compareTo(vertVal2.getAdjacentVertex(j)) == 0) {
				//vertVal2.addAdjacentVertex(vertexVal);
			//} else {
				return false;
			}
		}
		vertVal1.addAdjacentVertex(vertVal2);
		vertVal2.addAdjacentVertex(vertVal1);

		if(vertVal1 == null || vertVal2 == null || vertVal1.compareTo(vertVal2) == 0){ //Exception
			throw new VertexException("Vertex Not Applicable");
		}
		// }
		return true;

	}
		


	  // end addEdge() method

	/**
	 * 
	 * Remove the edge that connects two vertices
	 * 
	 * 
	 * @param vertex_value_A
	 * @param vertex_value_B
	 * @return
	 * @throws VertexException
	 */
	public Boolean removeEdge(AnyType vertex_value_A, AnyType vertex_value_B) throws VertexException {

		
		boolean vertex_A_exist = false;
		boolean vertex_B_exist = false;
		boolean vertex_A_and_B_exist = false;

		Vertex<AnyType> vertVal1 = null;
		Vertex<AnyType> vertVal2 = null;

		for (int i = 0; i < vertex_adjacency_list.size(); i++) { //Step 1
			// check for the existence of vertex A and B

			if (vertex_value_A.compareTo(vertex_adjacency_list.get(i).getValue()) == 0) {
				vertex_A_exist = true;
				vertVal1 = vertex_adjacency_list.get(i);
			} else if (vertex_value_B.compareTo(vertex_adjacency_list.get(i).getValue()) == 0) {
				vertex_B_exist = true;
				vertVal2 = vertex_adjacency_list.get(i);
			}
		}
		/*
		 * if ( vertex_A_exist && vertex_B_exist) { vertex_A_and_B_exist = true;
		 * } if(vertex_A_and_B_exist == false){
		 */
		
		if(vertVal1 == null){
			return false;
		}
		if(vertVal2 == null){
			return false;
		}
		for (int j = 0; j < vertVal1.numberOfAdjacentVertices(); j++) { //Step 2
			//Vertex<AnyType> vertexVal = vertVal1.getAdjacentVertex(j);
			if (vertVal2.compareTo(vertVal1.getAdjacentVertex(j)) == 0) {
				//vertVal1.addAdjacentVertex(vertexVal);
			//} else {
				vertVal1.removeAdjacentVertex(vertVal2);
			}
		}
		for (int j = 0; j < vertVal2.numberOfAdjacentVertices(); j++) {
			//Vertex<AnyType> vertexVal = vertVal2.getAdjacentVertex(j);
			if (vertVal1.compareTo(vertVal2.getAdjacentVertex(j)) == 0) {
				//vertVal2.addAdjacentVertex(vertexVal);
			//} else {
				vertVal2.removeAdjacentVertex(vertVal1);
			}
		}
		
		if(vertVal1 == null || vertVal2 == null || vertVal1.compareTo(vertVal2) == 0){ //exception
			throw new VertexException("Vertex Not Applicable");
		}
		

		// }
		return true;
	} // end removeEdge() method

	/**
	 * 
	 * Depth first search (DFS) using stack data structure. Specifically, the
	 * ConstantTimeStack class.
	 * 
	 * 
	 * @param start_vertex
	 * @return
	 * @throws VertexException
	 */
	public String depthFirstSearch(AnyType start_vertex) throws VertexException {

		StringBuffer buffer = new StringBuffer();



		return buffer.toString();

	} // end depthFirstSearch() method

	/**
	 * 
	 * Breadth first search (BFS) using queue data structure. Specifically, the
	 * SemiConstantTimeQueue class
	 * 
	 * Must be an iterative solution.
	 * 
	 * 
	 * @param start_vertex
	 * @return
	 * @throws VertexException
	 */
	public String breadthFirstSearch(AnyType start_vertex) throws VertexException {

		StringBuffer buffer = new StringBuffer();

		
		SemiConstantTimeQueue<Vertex<AnyType>> queue = new SemiConstantTimeQueue<Vertex<AnyType>>();
		
		Vertex<AnyType> temp = new Vertex<AnyType>(start_vertex);
		
		int tempIndex = temp.getAdjacentVertexIndex(temp);
		int counter = 1;
		//sets vertexes to not visited (value of -1)
		for (int i = 0; i < vertex_adjacency_list.size(); i++) {
			vertex_adjacency_list.get(i).setVisited(Vertex.NOT_VISITED);

		}

		temp.setVisited(counter);
		queue.add(temp);

		while (queue.peek() != null) {
			Vertex<AnyType> head = queue.peek();
			int tempHead = head.getAdjacentVertexIndex(head);
			queue.remove();
			
			//String format: <Vertex Value>:<Visited Count>\n
			buffer.append(head.getValue());
			buffer.append(" : ");
			buffer.append(head.getVisited());
			buffer.append("\n");

			for (int i = 1; i < vertex_adjacency_list.size(); i++) {
				if (vertex_adjacency_list.get(i).hasBeenVisited() == false) {
					counter++;
				
					vertex_adjacency_list.get(i).setVisited(counter);
					queue.add(vertex_adjacency_list.get(i));
				}
			}
		}

		return buffer.toString();

	} // end breadthFirstSearch() method

	/**
	 * 
	 */
	public void clear() {

		vertex_adjacency_list.clear();

	} // end clear()

	/**
	 * 
	 * For debugging purposes only
	 * 
	 */
	public void printAdjacencyList() {

		for (int i = 0; i < vertex_adjacency_list.size(); i++){
			
			vertex_adjacency_list.get(i).printVertex();
		}

} // end printGraph() method

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		
		UndirectedGraph<Integer> graph = new UndirectedGraph<Integer>();
		// UndirectedGraph graph = new UndirectedGraph();
		graph.addEdge( 1, 2 );
		graph.addEdge( 1, 3 );
		graph.addEdge( 1, 4 );
		graph.addEdge( 2, 3 );
		graph.addEdge( 2, 5 );
		graph.addEdge( 2, 6 );
		graph.addEdge( 2, 4 );
		//graph.addEdge(2,1);
		//graph.removeEdge(5, 2);
		graph.breadthFirstSearch(4);
		//graph.removeEdge(2, 3);
		//graph.removeEdge(5, 4); //exception?
		//graph.removeEdge(6, 2);
		graph.printAdjacencyList();

	} // end main() method

} // end UndirectedGraph class definition
