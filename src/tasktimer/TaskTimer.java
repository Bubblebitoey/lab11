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
	/**
	 *
	 * @param task it mean task that we had separated.
	 */

	public static void execAndPrint(Runnable task) {

		task.toString();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		task.run();
		stopWatch.stop();
		System.out.print("Elapsed time: " + stopWatch.getElapsed());
	}
}
