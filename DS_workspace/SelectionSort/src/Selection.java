
public class Selection 
{
//	public static void selection(int []arr)
//	{
//		for(int p=0;p<arr.length;p++)
//		{
//			int i=p;
//		int x=arr[i];
//		 while(i<arr.length)
//		 {
//			 if(x>arr[i])
//			 {
//				 int temp=0;
//				 temp=arr[i];
//				 arr[i]=x;
//				 x=temp;
//			 }
//			 i++;
//		 }
//		 arr[p]=x;
//		}
//	}
	public static void print(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	public void selection(int []arr)
	{
		for (int p = 0; p < arr.length; p++) 
		{
			int i=p;
			int x=arr[i];
			while(x < arr.length)
			{
				if(x>arr[i])
				{
					int temp=arr[i];
					arr[i]=x;
					x=temp;
				}
				i++;
			}
			arr[p]=x;
		}
	}
}
