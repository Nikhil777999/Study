public class Node 
{	
	Student data;
	Node next;
	
	public Node()
	{
		this.data=null;
		this.next=null;
	}
	public Node(Student data)
	{
		this.data=data;
		this.next=null;
	}
	public Node(Student data,Node next)
	{
		this.data=data;
		this.next=next;
	}
	public Node(Node next)
	{
		this.data=null;
		this.next=next;
	}
	public String toString()
	{
		String str=("Data :["+data+"]");
		return str;
	}
}
