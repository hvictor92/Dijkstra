import java.util.ArrayList;

/**
 * Abstract implementation of a graph. Must be extended to create a particular
 * kind of graph.
 */
public abstract class AbstractGraph implements Graph {

	// Graph representation - lists of vertices and edges
	protected static ArrayList<Vertex> vertices;
	protected static ArrayList<Edge> edges;

	/**
	 * Construct a new abstract graph
	 * 
	 * @param vertices
	 *            the initial set of vertices in the graph
	 * @param edges
	 *            the initial set of edges in the graph
	 */
	AbstractGraph(ArrayList<Vertex> vertices, ArrayList<Edge> edges) {
		this.vertices = vertices;
		this.edges = edges;
	}

	/**
	 * Return the vertices in this graph
	 * 
	 * @return the set of vertices in this graph
	 */
	public ArrayList<Vertex> vertices() {
		return vertices;
	}

	/**
	 * Return the edges in this graph
	 * 
	 * @return the set of edges in this graph
	 */
	public ArrayList<Edge> edges() {
		return edges;
	}

}