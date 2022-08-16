package SLL;

public class Linklist 
{
	 Node head;
	
	public Linklist() 
	{
		this.head=null;
	}
	
	public Linklist(Node head) 
	{
		this.head=head;
	}
	
	public void insert(int data)
	{
		Node temp= new Node(data);
		if(head==null)
		{
			head=temp;
		}
		else 
		{
			temp.next =head;
			head=temp;
		}
	}
	
	public void append(int data)
	{
		Node Newnode= new Node(data);
		if(head==null)
		{
			head=Newnode;
		}
		else
		{
			Node it=head;
			while(it.next != null)
			{
				it=it.next;
			}
			it.next=Newnode;
			Newnode.next=null;
		}
	}
	
	public int listlength()

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
		else
		{
			if((pos>1) && (pos<=noOfNode))
			{
				Node newNode = new Node(data);
				Node it=head;
				for(int i=1;i<pos-1;i++)
				{
					it=it.next;
				}
				newNode.next=it.next;
				it.next=newNode;
			}
			else
			{
				System.out.println("Position is Invalid");
			}
		}
	}
	
	public void deleteByPos(int pos)

	{	
		int noOfNode=listlength();
		if(pos==1)
		{
			deleteFirst();
		}
		else if(pos==noOfNode)
		{
			deleteLast();
		}
		else
		{
			if((pos>1) && (pos<noOfNode))
			{
				
				Node it=head;
				for(int i=1;i<pos-1;i++)
				{
					it=it.next;
				}
					Node t=it.next;
					it.next=t.next;
					t.next=null;
			}
			else
			{
				System.out.println("Position is Invalid");
			}
		}
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("LL is Empty");
		}
		else
		{
			if(head.next==null)
			{
				head=null;
			}
			else
			{ 
				Node it = head;
				head=it.next;
				it.next=null;
			}
		}
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("LL is Empty");
		}
		else
		{
			if(head.next==null)
			{
				head=null;
			}
			else
			{ 	Node it;
				it=head;
				while(it.next.next!=null)
				{
					it=it.next;
				}
				it.next=null;
			}
		}
	}
	
	public String toString()
	{
		String str="";
		if(head==null)
		{
			str=("LL isEmpty");
		}
		else 
		{
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
