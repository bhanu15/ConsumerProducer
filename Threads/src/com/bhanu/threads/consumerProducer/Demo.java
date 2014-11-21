package com.bhanu.threads.consumerProducer;

public class Demo {
	public static void main(String[] args) {
		BallStack ballStack = new BallStack(5);
		
		Producer producer = new Producer("Producer ", ballStack);
		Consumer consumer = new Consumer("Consumer ", ballStack);
	}
}
