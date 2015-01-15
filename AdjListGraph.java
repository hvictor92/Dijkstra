import java.util.ArrayList;

/**
 * Adjacency list implementation of a graph
 */
public class AdjListGraph extends AbstractGraph 
{
	ArrayList<Vertex> vertices;
    ArrayList<Edge> edges;
	
	public AdjListGraph(ArrayList<Vertex> vertices, ArrayList<Edge> edges) 
	{
		super(vertices, edges);
		this.vertices = vertices;
		this.edges = edges;
		
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Edge> incidentEdges(Vertex v) 
	{
		ArrayList<Edge> e = new ArrayList<Edge>();
		if(edges == null)
		{
			System.out.println("no edges");
			System.out.println(edges.get(1).getVertex1().getLabel());
		}
		else
		for(int i =0; i<edges.size(); i++)
		{
			if( v.getLabel().equals(edges.get(i).getVertex1().getLabel()) )
			{
				e.add(edges.get(i));								
			}
			/*if(v.getLabel().equals(edges.get(i).getVertex2().getLabel()))
			{
				e.add(edges.get(i));
			}*/
		}
		
		return e;
	}

	public boolean isAdjacent(Vertex v, Vertex w) 
	{
		for(int i =0; i<edges.size(); i++)
		{
			if( v.equals(edges.get(i).getVertex1()) )
			{
				if(edges.get(i).getVertex2() == w)
				{
					return true;
				}
			}
			if(v.equals(edges.get(i).getVertex2()))
			{
				if(edges.get(i).getVertex1() == w)
				{
					return true;
				}
			}
		}	
		return false;	
	}
	
	public double findCost(Vertex v, Vertex end)
	{
		int i =this.shortestPath(v);
		double cost= 0;
		if(end.getLabel().equals(edges.get(i).getVertex2().getLabel()))
		{
			cost= cost+ (edges.get(i).getWeight());
		}
		else
		{
			while(!this.isAdjacent(v, end))
			{
				v =edges.get(i).getVertex2();
				i =this.shortestPath(v);
				cost= cost+ (edges.get(i).getWeight());
			}			
		}
		return cost;
	}
	public int shortestPath(Vertex v)
	{
		double shortPath = 100;
		int position =0;
		for(int i = 0; i<edges.size(); i++)
		{
			double j = edges.get(i).getWeight();
			if(j < shortPath)
			{
				shortPath = j;
				position = i;
			}			
		}
		return position;
	}
	
	public void findPath(Vertex a, Vertex b)
	{
		double cost =0;
		if(this.isAdjacent(a,b))
		{
			cost = cost + this.findCost(a, b);
			System.out.println("Path: {"+a+", "+b+"}"+" the cost: "+ cost);
		}
		
		ArrayList<Edge> e = this.incidentEdges(a);
		for(int i = 0; i<e.size(); i++)
		{
			
		}
		
	}
	
	public String path(Vertex v, Vertex end)
	{
		int i =this.shortestPath(v);
		String order= v.getLabel();
		if(end.getLabel().equals(edges.get(i).getVertex2().getLabel()))
		{
			order += (edges.get(i).getVertex2().getLabel());
		}
		else
		{
			while(!this.isAdjacent(v, end))
			{
				v =edges.get(i).getVertex2();
				i =this.shortestPath(v);
				this.path(v, end);
			}			
		}
		return order;
	}

}