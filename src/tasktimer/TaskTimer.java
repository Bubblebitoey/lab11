package tasktimer;

import static java.lang.System.out;

import java.util.Scanner;
import java.io.*;
import java.util.function.IntConsumer;
import java.util.function.Consumer;
import java.util.concurrent.atomic.*;  // hack, using AtomicInteger as accumulator

/**
 * Time how long it takes to perform some tasks
 * using different programming constructs.
 * <p>
 * TODO Improve this code by restructuring it to eliminate duplicate code.
 */
public class TaskTimer {
	private static String DICTIONARY = "wordlist.txt";

	/**
	 * Process all the words in a file using Scanner to read and parse input.
	 * Display summary statistics and elapsed time.
	 */



	/**
	 * Process all the words in a file (one word per line) using BufferedReader
	 * and the readLine() method.  readLine() returns null when there is no more input.
	 * Display summary statistics and elapsed time.
	 */



	/**
	 * Process all the words in a file (one word per line) using BufferedReader
	 * and the lines() method which creates a Stream of Strings (one item per line).
	 * Then use the stream to compute summary statistics.
	 * In a lambda you cannot access a local variable unless it is final,
	 * so (as a cludge) we use an attribute for the count.
	 * When this method is rewritten as a Runnable, it can be a non-static attribute
	 * of the runnable.
	 * Display summary statistics and elapsed time.
	 */


	/**
	 * Define a customer Consumer class that computes <b>both</b> the average
	 * and count of values.
	 * An IntConsumer is a special Consumer interface the has an 'int' parameter
	 * in accept().
	 */
	static class IntCounter implements IntConsumer {
		// count the values
		public int count = 0;
		// total of the values
		private long total = 0;

		/**
		 * accept consumes an int. In this method, count the value and add it to total.
		 */
		public void accept(int value) {
			count++;
			total += value;
		}

		/**
		 * Get the average of all the values consumed.
		 */
		public double average() {
			return (count > 0) ? ((double) total) / count: 0.0;
		}

		public int getCount() {
			return count;
		}
	}

	/**
	 * Process all the words in a file (one word per line) using BufferedReader
	 * and the lines() method which creates a Stream of Strings (one item per line).
	 * Then use the stream to compute summary statistics.
	 * This is same as task3, except we use a Collector instead of Consumer.
	 */



	// Limit number of words read.  Otherwise, the next task could be very sloooow.
	static final int MAXCOUNT = 50_000;

	/**
	 * Append all the words from the dictionary to a String.
	 * This shows why you should be careful about using "string1"+"string2".
	 */



	/**
	 * Append all the words from the dictionary to a StringBuilder.
	 * Compare how long this takes to appending to String.
	 */



	/**
	 * Run all the tasks.
	 */
	public static void main(String[] args) {
		Task1 task1 = new Task1();
		task1.run();
		Task2 task2 = new Task2();
		task2.run();
		Task3 task3 = new Task3();
		task3.run();
		Task4 task4 = new Task4();
		task4.run();
		Task5 task5 = new Task5();
		task5.run();
		Task6 task6 = new Task6();
		task6.run();
	}

}
