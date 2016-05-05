package tasktimer;

import java.util.*;

import static java.lang.System.out;

/**
 * Created by bubblebitoey on 5/5/59.
 */
public class Task1 implements Runnable {

	public void run() {

		// initialize: open the words file as InputStream
					Scanner in = new Scanner(Dictionary.getWordAsStream());
					out.println("Starting task: read words using Scanner and a while loop");
					long starttime = System.nanoTime();
					// perform the task
					int count = 0;
					long totalsize = 0;
					while (in.hasNext()) {
						String word = in.next();
						totalsize += word.length();
						count++;
					}
					double averageLength = ((double) totalsize) / (count > 0 ? count: 1);
					long stoptime = System.nanoTime();
					out.printf("Average length of %,d words is %.2f\n", count, averageLength);
					out.printf("Elapsed time is %f sec\n", (stoptime - starttime) * 1.0E-9);
	}
}
