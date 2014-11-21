package com.bhanu.threads;

import com.bhanu.learning.*;

public class Producer implements Runnable {

	Thread thread;
	BallStack ballStack;

	public Producer(BallStack ballStack, String name) {
		thread = new Thread(this, name);
		this.ballStack = ballStack;
		thread.start();

	}

	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread name is :" + threadName);
		for (int i = 0; i < 10; i++) {
			try {
				ballStack.add(new Ball(i));
				System.out.println("threadName"+threadName+ballStack);
			} catch (StackException stackException) {
				System.out.println(stackException);
				
			}
		}
	}

}
