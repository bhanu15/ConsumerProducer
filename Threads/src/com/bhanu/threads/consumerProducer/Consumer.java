package com.bhanu.threads.consumerProducer;

public class Consumer implements Runnable {

	Thread thread;
	BallStack ballStack;

	public Consumer(String name, BallStack ballStack) {
		this.ballStack = ballStack;
		thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		while (true) {
			System.out.println(ballStack);
			ballStack.remove();
			
		}
	}
}
