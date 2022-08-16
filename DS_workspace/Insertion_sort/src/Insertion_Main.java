
public class Insertion_Main {

	public static void main(String[] args) 
	{
		int []brr =new int[]{7,8,6,3,9,10};
		insertionSort(brr);
		display(brr);
	}
	
	
	private static void display(int[] brr) 
	{
		System.out.print("Insertion Sort :[");
		for (int i = 0; i < brr.length; i++) 
		{
			System.out.print(brr[i]);
			System.out.print(",");
		}
		System.out.print("]");
	}

	public static void insertionSort(int []arr)
	{
		for (int i = 1; i < arr.length; i++) 
		{
			int j=i;
			while(j>0)
			{
				if(arr[j] <= arr[j-1])
					{
						int temp=arr[j];
						arr[j]=arr[j-1];
						arr[j-1]=temp;
						j--;
					}
				else
					{
						break;
					}
			}
		}
	}
}
