
public class Stack 
{
	private static int []arr;
	private static int top=0;
	
	public Stack()
	{
		arr=new int[5];
		top=-1;
	}
	
	public void push(int value)
	{
		if(top<arr.length-1)
		{
			top++;
			arr[top]=value;
		}
		else
		{
			if(top == arr.length-1)
			System.out.println("Stack is overflow");
			}
	}
	
	public int pop()
	{
		if(top != -1)
		{
			int value=0;
			value=arr[top];
			top--;
			return value;
		}
		else
		{
			if(top==-1)
				System.out.println("Stack is empty");
		}
		return 0;
	}
	
	public String toString()
	{
		String str =new String();
		for(int i=top; i>=0; i--)
			{
			str= str+ arr[i] + ", ";
			}
		return str;
	}
}




