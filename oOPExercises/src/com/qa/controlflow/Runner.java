package com.qa.controlflow;

import operators.OperatorsTask;

//class
public class Runner {

	// class scope  (members)
	
	//ATTRIBUTES
	public static String msg ="Hello this is an attribute!";
	
	
	// METHODS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This method was brought from other classes in another package - can be used to keep code cleaner & organized?
		OperatorsTask.startExercises();
			
		start();
		// This is the example from separate class - does not need to be imported due to being in the same package //
		Example.msg();
		
		
		System.out.println(msg);
		
		// Giving those returned parameters a value
		String result = message("String parameter ", 25);
		System.out.println(result);
	}
	
	public static void start() {
		
		System.out.println("This is my Starting Message;");
		System.out.println("This is my Starting Message;");
	}
	// Use of Parameters
	public static String message(String msg, int x) {
		return msg + x;
	}

}
