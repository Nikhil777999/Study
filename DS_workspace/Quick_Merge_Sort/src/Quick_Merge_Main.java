
public class Quick_Merge_Main {

	public static void main(String[] args)
	{
		int []arr =new int[]{14,28,64,1,6,22,5,2};
//		Sort.print(arr);
//		Sort.quickSort(arr, 0,arr.length-1);
//		Sort.print(arr);
//		
		Sort.print(arr);
		Sort.MergeSort(arr, 0, arr.length-1);
		Sort.print(arr);
	}

}
