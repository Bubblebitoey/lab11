package tasktimer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

/**
 * Created by bubblebitoey on 5/5/59.
 */
public class Task2 {

	public void run() {
				// initialize: open the words file as InputStream
				BufferedReader br = null;
				try {
					br = new BufferedReader(new InputStreamReader(Dictionary.getWordAsStream()));
				} catch (Exception ex) {
					out.println("Could not open dictionary: " + ex.getMessage());
					return;
				}
				out.println("Starting task: read words using BufferedReader.readLine() with a loop");
				long starttime = System.nanoTime();

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
				long stoptime = System.nanoTime();
				out.printf("Elapsed time is %f sec\n", (stoptime - starttime) * 1.0E-9);
			}

	}
