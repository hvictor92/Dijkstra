import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Edge 
{
	static Scanner x;
	
	public static void openFile()
	{
	  try
	   {
		 x = new Scanner (new File("edges.txt"));
	   }
	  catch (Exception e)
	   {
		System.out.println("could not find file");
	   }
	}
	
	public static ArrayList<Edge> readFile()
	{
		String line = x.nextLine();
		ArrayList<Edge> edges = new ArrayList<Edge>();
		   while(x.hasNext())
		   {
			  
			 String c1 = Character.toString(line.charAt(0));
			 String c2 = Character.toString(line.charAt(2));
			 char c3 = line.charAt(4);
			 
			  vertex1 = new Vertex(c1);
			  vertex2 = new Vertex(c2);
			  weight = Character.digit(c3, 10);
			  //System.out.println(vertex1.getLabel()+" "+vertex2.getLabel()+" "+weight);
			  if(weight == 1)
			  {
				  weight = (weight*10);
			  }				  
			  			  
				   line = x.nextLine();
				   Edge e = new Edge(vertex1, vertex2, weight);
				  System.out.println(e.getVertex1().getLabel()+" "+e.getVertex2().getLabel()+" "+e.getWeight());
				   if(e!=null)
				   {
					   if(edges == null)
					   {
						   ArrayList<Edge> edge = new ArrayList<Edge>();
						   edge.add(e);
						   edges= edge;
					   }
					   else
					   edges.add(e);
				   }				   
			 }			 				  			  
			  
			  return edges;		 		   
	   }

	// instance variables
	public static Vertex vertex1; // vertices at either end of this edge
	public static Vertex vertex2;
	public static double weight; // distance between vertices (weight)

	public Edge(Vertex v1, Vertex v2, double wt) 
	{
		vertex1 = v1;
		vertex2 = v2;
		weight = wt;
	}
	
	public Vertex getVertex1()
	{
		return vertex1;
	}
	public Vertex getVertex2()
	{
		return vertex2;
	}
	public double getWeight()
	{
		return weight;
	}


	public Vertex opposite(Vertex v) 
	{
		 if(this.getVertex1() == v)
		 {
			 return this.getVertex2();
		 }
		 else
			 return this.getVertex1();		
	}
	
	

}
