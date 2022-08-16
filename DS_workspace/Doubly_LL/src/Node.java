public class Node 
{	
	Node perv;
	int data;
	Node next;
	
	public Node()
	{
		this.perv=null;
		this.data=0;
		this.next=null;
	}
	public Node(int data)
	{
		this.perv=null;
		this.data=data;
		this.next=null;
	}
	public Node(Node perv,int data,Node next)
	{
		this.perv=perv;
		this.data=data;
		this.next=next;
	}
	public Node(Node perv,Node next)
	{
		this.perv=perv;
		this.data=0;
		this.next=next;
	}
	public String toString()
	{
		String str=("Data :["+data+"]");
		return str;
	}
}
