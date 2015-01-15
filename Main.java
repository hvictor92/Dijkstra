import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static ArrayList<Vertex> vertices;
	static ArrayList<Edge> edges;
	
	static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args) 
	{
		Edge.openFile();
		edges = (Edge.readFile());
		Vertex.openFile();
		vertices = (Vertex.readFile());
		
		AdjListGraph adjGraph = new AdjListGraph(vertices, edges);
		//System.out.println(edges.get(0).getVertex1().getLabel());
		commandPrompt(adjGraph);
		

	}
	
	public static void commandPrompt(AdjListGraph alg)
	{
		System.out.println("Please enter your starting point:");
		Vertex v1= new Vertex(kbd.next());
		System.out.println("Please enter your end point:");
		Vertex v2=new Vertex(kbd.next());
        
		System.out.println("Path: {"+alg.path(v1, v2)+"}"+" the cost: "+ alg.findCost(v1, v2));
		
	}

}
