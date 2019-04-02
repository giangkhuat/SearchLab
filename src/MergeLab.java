import java.util.ArrayList;
import java.util.Comparator;

public class MergeLab {
	/**
	 * Merge the values from positions [lo..mid) and [mid..hi) back into
	 * the same part of the array.
	 *
	 * Preconditions: Each subarray is sorted accorting to comparator.
	 */
	static <T> void merge(ArrayList<T> vals, int lo, int mid, int hi, Comparator<? super T> comparator) {
	   ArrayList<T> tempArray = new ArrayList<T>();
	   int i = lo, j = mid;
	   int k = 0;
	   while (i < mid && j < hi) {
		   T leftElmt = vals.get(i);
		   T rightElmt = vals.get(j);
		   if ( comparator.compare(leftElmt, rightElmt) <= 0) {
			   tempArray.set(k, leftElmt);
			   i++;
		   }
		   else {
			   tempArray.set(k, rightElmt);
			   j++;
		   }
		   k++;
	   }
	   // break out of the loop, at least one i or j reaches mid or high
	   if (i == mid) {
		   while (j < hi) {
			   tempArray.set(k, vals.get(j));
			   j++;
			   k++;
		   }		   
	   }
	   else if (j > hi) {
		   // check the right side [mid - high]
	      while (i < mid) {
	    	  tempArray.set(k, vals.get(i));
	    	  k++;
	    	  i++;
	      }
	   }
	   
	}
	
	public <T> void  mergeSortHelper( ArrayList<T> sortArray, int lo, int hi, Comparator<T> comparator) {
		// Base case
		if ((hi - lo <= 1)) {
			return;
		}
		else {
			int mid = (lo + hi) /2 ;
			mergeSortHelper( sortArray, lo, mid, comparator) ;
			mergeSortHelper(sortArray, mid, hi, comparator);
			merge(sortArray, lo, mid, hi, comparator);
		}
		
	}
	public static <T> void mergeSort(ArrayList<T> vals, Comparator<? super T> comparator) {
	
	}

	

}
