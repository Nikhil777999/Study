
public class Main
{
	public static void main(String[] args) 
	{
		Queue q1 = new Queue(5);
		q1.insert(10);
		q1.insert(20);
		q1.insert(40);
		q1.remove();
		q1.insert(50);
		System.out.println(q1);
		mod();
	}
	
	public static void mod()
	{
		int x=5;
		for(int i=0;i<=x;i++)
		{
			int y= i%x;
			System.out.println(y);
		}
	}
	
}
