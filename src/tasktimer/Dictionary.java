package tasktimer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * Created by bubblebitoey on 5/5/59.
 */
public class Dictionary {

	private static String DICTIONARY = "wordlist.txt";

	/**
		 * Process all the words in a file using Scanner to read and parse input.
		 * Display summary statistics and elapsed time.
		 */

	public static InputStream getWordAsStream() {
		InputStream instream = TaskTimer.class.getClassLoader().getResourceAsStream(DICTIONARY);
		return instream;
	}
}
