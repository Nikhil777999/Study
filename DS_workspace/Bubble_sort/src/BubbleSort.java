
public class BubbleSort {

	public static void main(String[] args)
	{
		
		int []arr = new int[] {7,8,6,6,689,9,-1,2,0};
		bubble(arr);
		print(arr);
	}

	public static void print(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	public static void bubble(int []arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j =1; j < arr.length-i; j++) 
			{
				if(arr[j] < arr[j-1] )
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
}
