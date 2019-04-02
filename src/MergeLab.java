import java.util.*;

public class MergeLab <T>{
	/**
	 * Merge the values from positions [lo..mid) and [mid..hi) back into
	 * the same part of the array.
	 *
	 * Preconditions: Each subarray is sorted accorting to comparator.
	 */
	static <T> void merge(ArrayList<T> vals, int lo, int mid, int hi, Comparator<? super T> comparator) {
	   ArrayList<T> tempArray = vals;
	   for (int i = 0 ; i < tempArray.size(); i++) {
		   System.out.println(" [" + i + " ]"  +tempArray.get(i));
		   
	   }
	   int i = lo, j = mid;
	   int k = 0;
	   while (i < mid && j < hi) {
		   //T leftElmt = vals.get(i);
		   T leftElmt = tempArray.get(i);
		   //T rightElmt = vals.get(j);
		   T rightElmt = tempArray.get(j);
		   if ( comparator.compare(leftElmt, rightElmt) <= 0) {
			   //tempArray.set(k, leftElmt);
			   vals.set(k, leftElmt);
			   i++;
		   }
		   else {
			   //tempArray.set(k, rightElmt);
			   vals.set(k,rightElmt);
			   j++;
		   }
		   k++;
	   }
	   // break out of the loop, at least one i or j reaches mid or high
	   if (i == mid) {
		   while (j < hi) {
			   //tempArray.set(k, vals.get(j));
			   vals.set(k,tempArray.get(j));
			   j++;
			   k++;
		   }		   
	   }
	   else if (j > hi) {
		   // check the right side [mid - high]
	      while (i < mid) {
	    	  //tempArray.set(k, vals.get(i));
	    	  vals.set(k,tempArray.get(i));
	    	  k++;
	    	  i++;
	      }
	   }
	   
	}
	
	public static <T> void  mergeSortHelper( ArrayList<T> sortArray, int lo, int hi, Comparator<T> comparator) {
		// Base case
		if ((hi - lo <= 1)) {
			System.out.println("base case");
			return;
		}
		else {
			int mid = (lo + hi) /2 ;
			System.out.println("mid = " + mid);
			mergeSortHelper( sortArray, lo, mid, comparator) ;
			mergeSortHelper(sortArray, mid + 1, hi, comparator);
			System.out.println("begin merge");
			merge(sortArray, lo, mid, hi, comparator);
		}
		
	}
	public static <T> void mergeSort(ArrayList<T> vals, Comparator<T> comparator) {
	     MergeLab.mergeSortHelper(vals, 0, vals.size(), comparator );
	}

	public static void main (String[] args) throws Exception {
	  ArrayList<String> str = new ArrayList<String>();
	  str.add("hello");
	  str.add("ggg");
	  str.add("aa");
	  str.add("bh");
	  StringComparator comp = new StringComparator();
	  MergeLab.mergeSort(str, comp);
	  for (int  i = 0; i < str.size(); i++) {
	    System.out.println(str.get(i));
	  }
	}

}
