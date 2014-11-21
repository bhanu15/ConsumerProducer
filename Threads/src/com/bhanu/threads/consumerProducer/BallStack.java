package com.bhanu.threads.consumerProducer;

import java.util.EmptyStackException;
import java.util.Stack;
public class BallStack extends Stack {

	int size ;
	int currentSize =0;
	
	public BallStack(int size){
		this.size = size;
	}
	
	synchronized public void add(Ball ball) {
		if(currentSize <size){
			super.add(ball);
			currentSize++;
		}else{
			notify();
			try {
				wait();
			} catch (InterruptedException interruptedException) {
				System.out.println(interruptedException);
			}
		}
	}
	
	synchronized public void remove() {
		if(currentSize >0){
			currentSize--;
			super.remove(currentSize);
			
		}else{
			notify();
			try {
				wait();
			} catch (InterruptedException interruptedException) {
				System.out.println(interruptedException);
			}
		}
	}

}
