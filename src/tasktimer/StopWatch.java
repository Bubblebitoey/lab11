package tasktimer;

/**
 * Created by bubblebitoey on 5/5/59.
 */
public class StopWatch {
	private long starttime;
	private long stoptime;
	private boolean running;

	public void start() {
		starttime = System.nanoTime();
		running = true;
	}

	public void stop() {
		stoptime = System.nanoTime();
		running = false;
	}

	public Double getElapsed() {
		return (stoptime - starttime) * 1.0E-9;
	}

}
