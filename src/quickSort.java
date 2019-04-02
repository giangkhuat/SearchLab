
public class quickSort {
	
	private static int partition(int[] arr, int lo, int hi, int pivotIndex) {
		
		int pivot = arr[pivotIndex];
		
		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[hi];
		arr[hi] = temp;
		
		int left = lo;
		int right = hi - 1;
		
		while (left < right) {
			if (arr[left] > pivot) {
				int temp1 = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
			}
			else {
				left++;
			}
			if (arr[right] < pivot) {
				int temp2 = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
			}
			else {
				right--;
			}	
		} // while loop
		
		int temp3 = pivot;
		arr[hi] = arr[left];
		arr[left] = temp3;
		
		return left;
	
		
	} //partition

} //class
