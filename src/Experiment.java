import java.util.ArrayList;
import java.util.Arrays;

public class Experiment {
	public static void main(String[] args) throws Exception {
		String[] tmp = new String[] { "alpha", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel", "india",
				"juliett", "kilo", "lima", "mike", "november", "oscar", "papa", "quebec", "romeo", "sierra", "tango",
				"uniform", "victor", "whiskey", "xray", "yankee", "zulu" };
		ArrayList<String> strings = new ArrayList<String>(Arrays.asList(tmp));
		// (s) -> s.length() == 6, strings) this says that for every element s in string
		// check its length if it is == 6
		// it does not work if we do 
		//String ex1b = Utils.search((s) -> s.length() == 6, tmp);
		//System.out.println(ex1b);
		int[] tmp1 =  new int[] {1, 2, 3, 4, 5, 6};
		System.out.println(Utils.binarySearch (1, tmp1));
	}
}
