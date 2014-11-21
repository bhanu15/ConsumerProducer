package com.bhanu.threads;

import com.bhanu.learning.Ball;
import com.bhanu.learning.BallStack;
import com.bhanu.learning.StackException;

public class Consumer implements Runnable {

	Thread thread;
	BallStack ballStack;

	public Consumer(BallStack ballStack, String name) {

		thread = new Thread(this, name);
		this.ballStack = ballStack;
		thread.start();
	}

	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(" Thread name is : " + threadName);
		for (int i = ballStack.maxSize ; i >= 0; i--) {
			try {
				ballStack.removeBall(i);
				System.out.println("threadName"+threadName+ballStack);

			} catch (IndexOutOfBoundsException  indexOutOfBoundsException) {
				System.out.println(indexOutOfBoundsException);
			}
		}

	}
}
