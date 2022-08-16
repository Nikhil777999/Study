
public class Queue 
{
private static int []arr;
private static int F,R;

public Queue()
{
	arr=new int[5];
	R=F=-1;
}

public  void insert(int value)
{	
	if( R < arr.length-1)
	{
	R++;
	arr[R]=value;
	if(F==-1)
		F++;
	}
	else
	System.out.println("Queue is Full");
}

public  int remove()
{
	int value=0;
	if(F != -1)
	{
		value=arr[F];
		
		if(F != R)
		{
			F++;
		}
		else
			F=R=-1;
	}
	else
		System.out.println("Queue is Empty");
	return value;
}

public String toString()
{
	String str = "";
	if(F == -1)
		str = "Queue is Empty!";
	else
	{
		for(int i=F; i<=R; i++)
		{
			str += arr[i] + ", ";
		}
	}
	
	return str;

}
}
