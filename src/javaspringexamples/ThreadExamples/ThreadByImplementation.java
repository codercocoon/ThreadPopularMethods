package javaspringexamples.ThreadExamples;

/**
 * This class presents how to implement a thread by implementing the Runnable
 * interface, and using sleep method.
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class ThreadByImplementation implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Running " + this.getClass().getName());
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// ...Do something to handle the exception.
			System.out.println(Thread.currentThread().getName() + " is interrupted");
		}

	}
}
