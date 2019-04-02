import java.util.Comparator;

// taken from Sam's lab https://www.cs.grinnell.edu/~rebelsky/Courses/CSC207/2019S/02/labs/array-based-queues.html
public class StringComparator implements Comparator<? super T> {
  public int compare(String str1, String str2) {
    // Efficiency hack: If two strings occupy the same memory
    // they are equal.
    if (str1 == str2) { return 0; }
    // Safety check: If either string is null, compareTo may fail,
    // so we make sure neither is null.  We treat null as "smaller"
    // than any other string.
    if (str1 == null) { return -1; }
    if (str2 == null) { return 1; }
    // Finally, we can use the built-in `compareTo` method.
    return str1.compareTo(str2);
  } // compare(String, STring)
} // StringComparator
