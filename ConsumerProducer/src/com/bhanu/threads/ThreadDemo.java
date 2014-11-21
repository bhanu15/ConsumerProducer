package com.bhanu.threads;

import com.bhanu.learning.BallStack;

public class ThreadDemo {

	public static void main(String[] args) {
		BallStack ballStack = new BallStack(5);
		Consumer consumer = new Consumer(ballStack, "Consumer");
		Producer producer = new Producer(ballStack, "Producer");
		try {
			consumer.thread.join();
			producer.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ballStack);
		
	}
}
