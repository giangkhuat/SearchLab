import java.util.Iterator;
import java.util.function.Predicate;

public class Utils {
	
	public static <T> T search(Predicate<? super T> pred, Iterable<T> values) throws Exception {
		Iterator<T> iteratorUtils = values.iterator();
		T val = null;
		// while it has next element
		// keep iterating and checking
		// if the 
		while (iteratorUtils.hasNext()) {
			val = iteratorUtils.next();
			if (pred.test(val)) {
				return val;
			}
		}
		throw new Exception("There is no element like that");
		}
	
	public static int binarySearch (int i, int[] vals) throws Exception {
		int lowb = 0;
		int upb = vals.length - 1;
		//int pos = vals.length;
		while (lowb < upb) {
			int midpoint = (lowb + upb)/2;
			if (vals[midpoint] == i) {
				return midpoint;
			}
			else if (vals[midpoint] > i) {
				upb = midpoint - 1;
			}
			else {
				lowb = midpoint + 1;
			}
		}
		  return -1; 
		}
}
