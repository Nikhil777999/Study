
public class BST 
{
	Node root;
	
	public BST()
	{
		this.root=null;
	}
	
	public void insert(int data)
	{
		if(root == null)
		{
			Node newNode = new Node(data);
			root=newNode;
		}
		else
		{
			Node newNode = new Node(data);
			Node it=root;
			
			while(true)
			{
				if(data < it.data)
				{
					if(it.left == null)
					{
						it.left=newNode;
						break;
					}
					else
					{
						it=it.left;
					}
				}
				else if(data > it.data)
				{
					if(it.right == null)
					{
						it.right=newNode;
						break;
					}
					else
					{
						it=it.right;
					}
				}
				else
				{
					break;
				}
			}
		}
	}
	
	public void preOrder()
	{
		System.out.print("Preorder => ");
		printPreOrder(root);
		System.out.println();
	}

	private void printPreOrder(Node it) 
	{
		if(it != null)
		{
			System.out.print(it.data+", ");
			printPreOrder(it.left);
			printPreOrder(it.right);
		}
	}
	
	public void inOrder()
	{
		System.out.print("Inorder => ");
		printInOrder(root);
		System.out.println();
	}

	private void printInOrder(Node it) 
	{
		if(it != null)
		{
			printInOrder(it.left);
			System.out.print(it.data+", ");
			printInOrder(it.right);
		}
	}
	
	
	public void postOrder()
	{
		System.out.print("Postorder => ");
		printPostOrder(root);
		System.out.println();
	}

	private void printPostOrder(Node it) 
	{
		if(it != null)
		{
			printPostOrder(it.left);
			printPostOrder(it.right);
			System.out.print(it.data+", ");
		}
	}
	
	public void smallest()
	{
		printSmallest(root);
	}
	private void printSmallest(Node it)
	{
		while(true)
		{
			if(it.left == null)
			{
				System.out.println("smallest :"+it.data);
				break;
			}
			it=it.left;
		}
	}
	
	public void largest()
	{
		printLargest(root);
	}
	private void printLargest(Node it)
	{
		while(true)
		{
			if(it.right == null)
			{
				System.out.println("Largest :"+it.data);
				break;
			}
			it=it.right;
		}
	}
}
