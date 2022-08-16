
public class myClass {
	
	static int input []=new int[] {10,21,70,70,23,70,43};
	
	public static void main(String[] args) {
		
		
		int r=myClass.count(70);
		System.out.println("no. of student :"+r);
		print();
	}
	
	public static void print()
	{
		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i]+", ");
		}
		
	}
	
	public static int count(int key)
	{
			int low, high, cnt, mid;
			low = 0;
			high = input.length-1;
			mid = (low+high)/2;
			cnt = 0;
			while((input [mid] !=key)&&(low<=high))
			{
				if (key < input[mid])
				{
					high= mid - 1;
				}
			else
				{
					low = mid + 1;
					mid=(low + high)/2;
				}
			}
			if (input [mid]==key)
				{
						cnt=cnt+1;
						low = mid - 1;
			while(input[low]==key)
					{
					cnt=cnt+1;
					low=low-1;
					}
						high=mid+1;
						while(input[high]==key)
					{
					cnt=cnt+1;
					high=high+1;
					}
				}
			return cnt;
}
}
