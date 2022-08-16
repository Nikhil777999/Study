
public class BinarySearchTree 
{
	public static void main(String[] args) 
	{
		
	}
	
	int height(Node r_ref)
	{
		int h_left, h_right;
		if(r_ref == null)
			return 0;
		
		h_left =height(r_ref.left);
		h_right=height(r_ref.right);
		if(h_left > h_right)
			return 1 + h_left;
		else
			return 1 + h_right;
		
	}
}
