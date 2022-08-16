public class Node 
{	
	Node left;
	int data;
	Node right;
	
	public Node()
	{
		this.left=null;
		this.data=0;
		this.right=null;
	}
	public Node(int data)
	{
		this.left=null;
		this.data=data;
		this.right=null;
	}
	public Node(Node perv,int data,Node next)
	{
		this.left=perv;
		this.data=data;
		this.right=next;
	}
	public Node(Node perv,Node next)
	{
		this.left=perv;
		this.data=0;
		this.right=next;
	}
	public String toString()
	{
		String str=(" "+data+",");
		return str;
	}
}
