
public class Stack 
{
	private Student []arr;
	private int top;
	
	public Stack()
	{
		arr=new Student[5];
		top=-1;
	}
	
	public void push(Student data)
	{
			if(this.top < this.arr.length-1)
			{
				this.top++;
				this.arr[this.top]=data;
			}
			else
			{
				System.out.println("Stack is Overflow");
			}
	}
	
	public Student pop()
	{
		if(this.top ==-1)
		{
			System.out.println("Stack Is Underflow...");	
		}
		else
		{
			if(this.top != -1)
			{
				Student value=this.arr[this.top];
				this.arr[this.top]=null;
				this.top--;
				return value; 
			}
		}
		return null;
	}
	
	public String toString()
	{
		String str=" ";
		if(this.top == -1)
		{
			System.out.println("Stack Is Underflow.");	

		}
		else {
		for (int i=this.arr.length-1; i >= 0; i--) 
		{
			str =str+this.arr[i]+"\n ";
		}
		}
		return str;
	}
	
}
	
	

