package com.bhanu.threads.consumerProducer;

public class Producer implements Runnable {

	public Thread thread;
	public BallStack ballStack;

	public Producer(String name, BallStack ballStack) {
		this.ballStack = ballStack;
		thread = new Thread(this, name);
		thread.start();

	}

	public void run() {
		for(int i=0;true;i++) {
			System.out.println(ballStack);
			ballStack.add(new Ball(ballStack.currentSize));
		}
	}
}
