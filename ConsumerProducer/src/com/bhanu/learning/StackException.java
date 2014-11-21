package com.bhanu.learning;

public class StackException extends Exception  {

	String msg;
	public StackException(String msg){
		super();
		this.msg = msg;
	}
	
	public String toString(){
		return "This is custom exception "+msg;
	}
	
}
