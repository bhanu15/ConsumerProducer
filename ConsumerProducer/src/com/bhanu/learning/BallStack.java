package com.bhanu.learning;

import java.util.Stack;

public class BallStack extends Stack {

	public int maxSize = -1;
	public int currentSize = 0;
	boolean flag = false;

	public BallStack(int maxSize) {
		this.maxSize = maxSize;
	}

	synchronized public void add(Ball ball) throws StackException {
		if (currentSize < maxSize) {
			super.add(ball);
			currentSize++;
			System.out.println("add currentSize "+currentSize);
		} else {
			if (flag == false) {
				notify();
				flag = true;
			}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			throw new StackException("Ball Queue is filled");

		}
	}

	synchronized public void removeBall(int index) {
		if (currentSize  < 0 || index > maxSize-1) {
			if (flag == true) {
				notify();
				flag = false;
			}
			try {
				System.out.println("tt");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			
			System.out.println("remove currentSize "+currentSize+"index"+index);
			remove(index);
			currentSize--;
			
		}
	}

}
