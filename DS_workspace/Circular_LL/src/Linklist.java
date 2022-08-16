

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
		if(head==null)
		{
			Node newNode = new Node(data);
			head=newNode;
			head.next=head;
		}
		else if(head==head.next)
		{
			Node newNode = new Node(data);
			head.next=newNode;
			newNode.next=head;
			head=head.next;
		}
		else
		{
			Node newNode = new Node(data);
			Node it=head;
			while(it.next!=head)
			{
				it=it.next;
			}
			it.next=newNode;
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void append(int data)
	{
		if(head==null)
		{
			Node newNode = new Node(data);
			head=newNode;
			head.next=head;
		}
		else if(head==head.next)
		{
			Node newNode = new Node(data);
			head.next=newNode;
			newNode.next=head;
		}
		else
		{
			Node newNode = new Node(data);
			Node it=head;
			while(it.next!=head)
			{
				it=it.next;
			}
			it.next=newNode;
			newNode.next=head;
		}
		
	}
	public void deleteFirst()
	{
		if(head==null)
		{
		System.out.println("List is Empty");
		}
		else if(head==head.next)
		{
			head.next=null;
			head=null;
		}
		else 
		{
			Node it=head;
			while(it.next!=head)
			{
				it=it.next;
			}
			it.next=head.next;
			head=head.next;
		}
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
		System.out.println("List is Empty");
		}
		else if(head==head.next)
		{
			head.next=null;
			head=null;
		}
		else 
		{
			Node it=head;
			while(it.next.next!=head)
			{
				it=it.next;
			}
			it.next.next=null;
			it.next=head;
		}
		
	}
	public int listlength()

	{	int noOfNode=1;
	
		Node it=head;
		if(head == null) return 0;
		else {
		while(it.next!=head)
		{
			noOfNode++;
			it=it.next;
		}
		
		return noOfNode;
		}
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
			newNode.next=it.next;
			it.next=newNode;
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
		else if(pos<noOfNode+1)
		{
			deleteLast();
		}
		else if(pos>1 && pos<noOfNode+1)
		{
			Node it=head;
			Node itn;
			for (int i = 1; i <pos-1; i++) 
			{
				it=it.next;
			}
			itn=it.next;
			it.next=it.next.next;
			itn.next=null;
			
		}
		else
		{
			System.out.println("Please Insert Valid Position!!!");
		}
	}
	

	public String toString()
	{
		String str="";
		if(head==null)
		{
			str=("CLL is Empty");
		}
		else 
		{
			str=str+head.data+", ";
			Node it=head.next;
			while(it!=head)
			{
				str+=(it.data+", ");
				it=it.next;
			}
		}
		return str;
	}
}
