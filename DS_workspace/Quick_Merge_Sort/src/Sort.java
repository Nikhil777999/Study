
public class Sort 
{
	public static void quickSort(int []arr,int l,int h)
	{
		if(l<h)
		{
			int pi=partition(arr,l,h);
			quickSort(arr,l,pi-1);
			quickSort(arr, pi+1, h);
		}
	}
	
	public static void print(int []arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	private static int partition(int[] arr, int l, int h) 
	{
		int i=l-1;
		int j=l;
		int p=h;
		
		while(j!=p)
		{
			if(arr[j]<arr[p])
			{
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			j++;
		}
		i++;
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		
		return i;
	}

	
	
	public static void MergeSort(int []arr,int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			MergeSort(arr, l, m);
			MergeSort(arr,m+1 ,r);
			Merge(arr,l,m,r);
		}
	}
	
	private static void Merge(int[] crr, int l, int m, int r) 
	{
		//l=0, m=2, r=5
		int s1=((m-l)+1);//s1=3
		int s2=(r-(m+1)+1);//s2=3
		
		int []arr=new int[s1];
		int []brr=new int[s2];
		
		for (int i = 0; i < arr.length; i++) 
		{	
			arr[i]=crr[l+i];
		}
		
		for (int i = 0; i < brr.length; i++) 
		{	
			brr[i]=crr[m+1+i];
		}
		
		int i=0,k=l,j=0;
		
		while(i<arr.length && j<brr.length)
		{
			if(arr[i]<=brr[j])
			{
				crr[k]=arr[i];
				k++;
				i++;
			}
			else
			{
				crr[k]=brr[j];
				k++;
				j++;
			}
		}
		if(i == arr.length)
		{
			while(j < brr.length)
			{
			crr[k]=brr[j];
			k++;
			j++;
			}
		}
		else
		{
			while(i < arr.length)
			{
				crr[k]=arr[i];
				k++;
				i++;
			}
		}
	}
}
