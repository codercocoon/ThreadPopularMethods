package com.codercocoon.ThreadExamples;

/**
 * This class presents how to implement a thread by extending the Thread class,
 * and using sleep method.
 * 
 * @author contact@codercocoon.com
 *
 */
public class ThreadByExtension extends Thread {

	public ThreadByExtension(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Running " + getName());
		try {
			// Using sleep method.
			sleep(1000);
		} catch (InterruptedException e) {
			// ...Do something to handle the exception.
			System.out.println(getName() + " is interrupted");
		}
	}
}
