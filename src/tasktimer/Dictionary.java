package tasktimer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * Created by bubblebitoey on 5/5/59.
 */
public class Dictionary {

	private static String DICTIONARY = "wordlist.txt";

	public static InputStream getWordAsStream() {
		InputStream instream = TaskTimer.class.getClassLoader().getResourceAsStream(DICTIONARY);
		return instream;
	}
}
