package com.example.custom_exception;

public class TestException {
	
	/**
	 * 1. Have you used Customized Exception?
	 * a. yes, most frequently we have to use customized exception.
	 * 
	 * 2. What all things you will be doing in it?
	 * a. Whenever we want to write `Customized Exception`, then you have write
	 * 	  a separate class, first of all, you have to decide whether you make this
	 *    custom exception a `checked exception` or `unchecked exception`.
	 *    
	 *    If it is `unchecked exception`, then you write a class, by extending `Runtime Exception`,
	 *    and if it is `Checked Exception`, then you write a exception class by extending `Exception`.
	 *    
	 *    Next, depending on your requirement, if you want to customize the error message(description of the error),
	 *    then you write the constructor, define some instance variable, and write the argumented constructor,
	 *    call the superclass constructor with a string message as a parameter, so you can add the description of the error.
	 *    
	 *    
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		
	}
}
