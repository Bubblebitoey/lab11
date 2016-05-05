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

	public void execAndPrint(Runnable task) {

	}




	/**
	 * Process all the words in a file (one word per line) using BufferedReader
	 * and the lines() method which creates a Stream of Strings (one item per line).
	 * Then use the stream to compute summary statistics.
	 * This is same as task3, except we use a Collector instead of Consumer.
	 */


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
