package tasktimer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

/**
 * Created by bubblebitoey on 5/5/59.
 */
public class Task3 implements Runnable {

	public void run() {
		// initialize: open the words file as InputStream
				BufferedReader br = null;
				try {
					br = new BufferedReader(new InputStreamReader(Dictionary.getWordAsStream()));
				} catch (Exception ex) {
					out.println("Could not open dictionary: " + ex.getMessage());
					return;
				}

				out.println("Starting task: read words using BufferedReader and Stream");
				long starttime = System.nanoTime();

				long totalsize = 0;
				long count = 0;
				// This code uses Java's IntStream.average() method.
				// But there is no way to also get the count of items.
				// averageLength = br.lines().mapToInt( (word) -> word.length() )
				//                         .average().getAsDouble();
				// So instead we write out own IntConsumer to count and average the stream,
				// and use our IntConsumer to "consume" the stream.
				TaskTimer.IntCounter counter = new TaskTimer.IntCounter();
				br.lines().mapToInt(word -> word.length()).forEach(counter);
				// close the input
				try {
					br.close();
				} catch (IOException ex) { /* ignore it */ }
				out.printf("Average length of %,d words is %.2f\n", counter.getCount(), counter.average());

				long stoptime = System.nanoTime();
				out.printf("Elapsed time is %f sec\n", (stoptime - starttime) * 1.0E-9);
	}

	public String toString() {
		return "Starting task: read words using BufferedReader and Stream";
	}
}
