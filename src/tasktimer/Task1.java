package tasktimer;

import java.util.*;

import static java.lang.System.out;

/**
 * Created by bubblebitoey on 5/5/59.
 */
public class Task1 implements Runnable {

	private Scanner in;

	public Task1() {
		in = new Scanner(Dictionary.getWordAsStream());
	}

	public void run() {
		// perform the task
		int count = 0;
		long totalsize = 0;
		while (in.hasNext()) {
			String word = in.next();
			totalsize += word.length();
			count++;
		}

		double averageLength = ((double) totalsize) / (count > 0 ? count: 1);
		out.printf("Average length of %,d words is %.2f\n", count, averageLength);
	}

	public String toString() {
		return "Starting task: read words using Scanner and a while loop";
	}
}
