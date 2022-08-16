

public class Linklist 
{
	 Node head;
	 Node tail;
	
	public Linklist() 
	{
		this.head=null;
		this.tail=null;
	}
	
	public Linklist(Node head,Node tail) 
	{
		this.head=head;
		this.tail=tail;
	}
	
	public void insert(int data)
	{
		if(head==null)
		{
			Node newNode = new Node(data);
			head=tail=newNode;
		}
		else if(head!=null)
		{
			Node newNode = new Node(data);
			head.perv=newNode;
			newNode.next=head;
			head=newNode;		
		}
	}
	
	public void append(int data)
	{
		if(tail==null && head ==null)
		{
			Node newNode = new Node(data);
			head=tail=newNode;
		}
		else if(tail.next==null)
		{
			Node newNode = new Node(data);
			tail.next=newNode;
			newNode.perv=tail;
			tail=newNode;
		}
	}
	
	private int listlength()

	{	int noOfNode=0;
		Node it=head;
		while(it!=null)
		{
			noOfNode++;
			it=it.next;
		}
		return noOfNode;
	}
	
	public void addByPos(int data,int pos)
	{
		int noOfNode=listlength();
		
		if(pos==1)
		{
			insert(data);
		}
		else if(pos==noOfNode+1)
		{
			append(data);
		}
		else if(pos>1 && pos<noOfNode+1)
		{
			Node newNode = new Node(data);
			Node it=head;
			for (int i = 1; i <pos-1; i++) 
			{
				it=it.next;
			}
			it.perv.next=newNode;
			newNode.perv=it;
			it.perv=newNode;
			newNode.next=it;
		}
		else
		{
			System.out.println("Please Insert Valid Position!!!");
		}
	}
	
	
	public void deleteByPos(int pos)
	{
		int noOfNode=listlength();
		if(pos==1)
		{
			deleteFirst();
		}
		else if(pos>noOfNode)
		{
			deleteLast();
		}
		else if(pos>1 && pos<noOfNode)
		{
			Node it=head;
			for (int i = 1; i <pos; i++) 
			{
				it=it.next;
			}
			it.perv.next=it.next;
			it.next.perv=it.perv;
			it.perv=null;
			it.next=null;
		}
		else
		{
			System.out.println("Please Insert Valid Position!!!");
		}
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
		System.out.println("List is Empty");
		}
		else if(head.next==null && head.perv==null)
		{
			head=tail=null;
		}
		else if(head.perv==null && head.next!=null)
		{
			Node it=head;
			it.next.perv=null;
			head=head.next;
			it.next=null;
		}
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
		System.out.println("List is Empty");
		}
		else if(head.next==null && head.perv==null)
		{
			head=tail=null;
		}
		else if(tail.perv!=null && tail.next==null)
		{
			Node it=tail;
			it.perv.next=null;
			tail=tail.perv;
			it.perv=null;
			it=null;
		}
		
	}
	
	public String toString()
	{
		String str="";
		if(head==null)
		{
			str=("DLL is Empty");
		}
		else 
		{
			str+="List : ";
			Node it=head;
			while(it!=null)
			{
				str+=(it.data+",");
				it=it.next;
			}
		}
		return str;
	}
}
