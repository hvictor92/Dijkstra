import java.util.ArrayList;

/**
 * Interface specifying a graph
 */
public interface Graph {

	/**
	 * Return the list of vertices of this graph
	 * 
	 * @return the vertices as an ArrayList
	 */
	public ArrayList<Vertex> vertices();

	/**
	 * Return the list of edges of this graph
	 * 
	 * @return list of edges
	 */
	public ArrayList<Edge> edges();

	/**
	 * Return a list of edges incident to (i.e. emanating from) a given vertex
	 * v. i.e., the set of all edges v->w
	 * 
	 * @param v
	 *            one of the vertices in the graph
	 * @return a list of edges incident to v in the graph
	 */
	public ArrayList<Edge> incidentEdges(Vertex v);

	/**
	 * Test whether two vertices are adjacent in the graph
	 * 
	 * @param v
	 *            one vertex
	 * @param w
	 *            another vertex
	 * @return true if there is an edge from v to w in the graph, false
	 *         otherwise
	 */
	public boolean isAdjacent(Vertex v, Vertex w);
}