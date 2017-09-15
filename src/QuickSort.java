
public class QuickSort {

	public static void main(String[] args) {

		int[] arr = {54,26,93,17,77,31,44,55,20};
		
		quickSort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
	}

	// Considering first element of array as pivot.
	public static void quickSort(int[] arr, int left, int right){
		
		if(left < right){			
			int partition = partition(arr, left, right);
			
			quickSort(arr, left, partition-1);
			quickSort(arr, partition+1, right);
			
		}
	}
	
	private static int partition(int[] arr, int left, int right){
		
		int pivot = left;
		
		left++;
		
		while(left<right){
			if(arr[left]<arr[pivot])
				left++;
			
			if(arr[right]>arr[pivot])
				right--;
			
			else if(arr[right]<arr[pivot] && arr[left]>arr[right] && left<right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
			}
		}
		
		if(arr[pivot]>arr[left]){
			int temp = arr[pivot];
			arr[pivot] = arr[left];
			arr[left] = temp;
		}
		
		return left;
		
	}
}
