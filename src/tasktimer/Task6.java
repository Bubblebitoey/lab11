package tasktimer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

/**
 * Created by bubblebitoey on 5/5/59.
 */
public class Task6 implements Runnable {
	// Limit number of words read.  Otherwise, the next task could be very sloooow.
	static final int MAXCOUNT = 50_000;
	private BufferedReader br;

	/**
		 * Append all the words from the dictionary to a StringBuilder.
		 * Compare how long this takes to appending to String.
		 */

	public Task6() {
		try {
			br = new BufferedReader(new InputStreamReader(Dictionary.getWordAsStream()));
		} catch (Exception ex) {
			out.println("Could not open dictionary: " + ex.getMessage());
		}

	}


	public void run() {
		StringBuilder result = new StringBuilder();
		String word = null;
		int count = 0;
		try {
			while ((word = br.readLine()) != null && count < MAXCOUNT) {
				result.append(word);
				count++;
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		System.out.printf("Done appending %d words to StringBuilder.\n", count);
	}

	public String toString() {
		return "Starting task: append " + MAXCOUNT + " words to a StringBuilder";
	}
}
