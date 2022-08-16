
public class BST_Main
{
	public static void main(String[] args) 
	{
		BST b1 = new BST();
		
		b1.insert(50);
		b1.insert(35);
		b1.insert(24);
		b1.insert(49);
		b1.insert(12);
		b1.insert(2);
		b1.insert(87);
		
//		b1.preOrder();
//		b1.inOrder();
//		b1.postOrder();
		b1.smallest();
		b1.largest();
	}

}
