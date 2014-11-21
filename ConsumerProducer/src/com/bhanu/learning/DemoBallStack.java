package com.bhanu.learning;

public class DemoBallStack {
	public static void main(String[] args) {
		BallStack ballStack = new BallStack(5);
		for (int i = 0; i < 5; i++) {
			try {
				ballStack.add(new Ball(i));
			} catch (StackException stackException) {
				System.out.println(stackException);
			}
		}
		System.out.println(ballStack);

		for (int j = ballStack.maxSize - 1; j >= 0; j--) {
			System.out.println(ballStack);
			ballStack.removeBall(j);
			
		}

		System.out.println(ballStack);
	}
}
