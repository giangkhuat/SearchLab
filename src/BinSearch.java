
public class BinSearch {
	/**
	 * Search for val in values, return the index of an instance of val.
	 *
	 * @param val
	 *   An integer we're searching for
	 * @param values
	 *   A sorted array of integers
	 * @result
	 *   index, an integer
	 * @throws Exception
	 *   If there is no i s.t. values[i] == val
	 * @pre
	 *   values is sorted in increasing order.  That is, values[i] <
	 *   values[i+1] for all reasonable i.
	 * @post
	 *   values[index] == val
	 */
	public static int binarySearch (int i, int[] vals, int lb, int ub) throws Exception {
	  int mid;
		if (lb > ub) {
			return - 1;
		} else {
			mid = (lb + ub) /2;
			if (vals[mid] == i) {
				return mid;
			} else if (vals[mid]  <= i) {
				return binarySearch(i, vals, mid + 1, ub);
			} else {
				return binarySearch(i, vals, lb, mid -1);
			}
		}
	} // binarySearch
	
	public static int search(int i, int[] vals) throws Exception {
		return binarySearch(i, vals, 0, vals.length - 1);
	}
	
	public static void main (String[] args) throws Exception {
		int[] arr = {3, 6, 8, 10, 12};
		System.out.println("Element 10 in arr ? " + BinSearch.search(10, arr));
	}

}
