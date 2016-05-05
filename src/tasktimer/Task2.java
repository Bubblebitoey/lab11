package tasktimer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

/**
 * Created by bubblebitoey on 5/5/59.
 */
public class Task2 implements Runnable {
	private BufferedReader br;


	/**
		 * Process all the words in a file (one word per line) using BufferedReader
		 * and the readLine() method.  readLine() returns null when there is no more input.
		 * Display summary statistics and elapsed time.
		 */
	public Task2() {
		try {
			br = new BufferedReader(new InputStreamReader(Dictionary.getWordAsStream()));
		} catch (Exception ex) {
			out.println("Could not open dictionary: " + ex.getMessage());
		}

	}

	public void run() {
		try {

			int count = 0;
			long totalsize = 0;
			String word = null;
			while ((word = br.readLine()) != null) {
				totalsize += word.length();
				count++;
			}
			double averageLength = ((double) totalsize) / (count > 0 ? count: 1);
			out.printf("Average length of %,d words is %.2f\n", count, averageLength);
		} catch (IOException ioe) {
			out.println(ioe);
			return;
		} finally {
			try {
				br.close();
			} catch (Exception ex) { /* ignore it */ }
		}
	}

	public String toString() {
		return "Starting task: read words using BufferedReader.readLine() with a loop";
	}

}
