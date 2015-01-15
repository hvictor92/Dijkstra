import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Vertex 
{	
  private String label;   // label attached to this vertex
  
  static Scanner y = null;
  public Vertex(String label) 
  {
    this.label = label;
  }
  
  public static void openFile()
	{
	  try
	   {
		 y = new Scanner (new File("vertex.txt"));
	   }
	  catch (Exception e)
	   {
		System.out.println("could not find file");
	   }
	}
	public static ArrayList<Vertex> readFile()
	   {
		String line = y.nextLine();
		ArrayList<Vertex> vertices = new ArrayList<Vertex>();
		   while(y.hasNext())
		   {
			 
			 String c1 = Character.toString(line.charAt(0));
			 		 		
			  Vertex v = new Vertex(c1);
			 line = y.next();
			 
			 if(v!=null)
			   {
				   if(vertices == null)
				   {
					   ArrayList<Vertex> vertex = new ArrayList<Vertex>();
					   vertex.add(v);
					   vertices = vertex;
				   }
				   else
					 vertices.add(v);
			   }
		   }
		   return vertices;
	   }
 
  public String getLabel() 
  {
    return label;
  }
}