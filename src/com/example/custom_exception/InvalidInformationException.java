package com.example.custom_exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * This  is a Java class for a custom exception named `InvalidInformationException`. 
 * This exception extends the `RuntimeException` class, which makes it an unchecked exception.
 *  
 * The class defines three constructors - one with no arguments, one with a message and a cause, 
 * and one with just a message. All constructors call the corresponding constructor of the 
 * superclass and initialize the `message` field with the given message. The `getMessage()` 
 * method returns the message stored in the `message` field.
 * 
 * The class also defines a private static final `LOG` field of type `Logger` from the SLF4J 
 * logging framework, which is used to log error messages when an instance of this exception 
 * is thrown. The `LOG` field is initialized with the `LoggerFactory` class, which is used 
 * to obtain a logger instance for the `InvalidInformationException` class.Overall, this 
 * class can be used to represent an exception that occurs when some invalid information 
 * is encountered in an application.
 * 
 * 
 * 
 * `LOG.error(message, LOG.isDebugEnabled() ? this : this.getMessage())` is a statement that 
 * logs an error message using a logger instance called `LOG`.
 * 
 * The `error()` method is a method of the logger that logs an error message.
 *  
 * The first parameter of the method is the message to be logged. The second parameter is 
 * an expression that is evaluated before the method is called. 
 * 
 * In this case, the second parameter is a ternary expression that checks whether the 
 * logger instance is in debug mode. If it is, the expression returns `this`, which refers 
 * to the current instance of the exception class. If the logger instance is not in debug mode, 
 * the expression returns `this.getMessage()`, which is the message string of the exception.
 * 
 * This statement logs the error message along with the exception details if the logger is 
 * in debug mode, and logs only the error message if the logger is not in debug mode.
 * 
 * */


/**
 * 
 * @author sudipto chakraborty
 * @since 02-may-2023 22:41 PM
 *
 */
public class InvalidInformationException extends RuntimeException {
	
	private static final long serialVersionUID = 6057630318293717938L;
	private static final Logger LOG = LoggerFactory.getLogger(InvalidInformationException.class);
	private final String message;
	
	public InvalidInformationException() {
		this.message = "Exception occured in InvalidInformationException";
		LOG.error(message, LOG.isDebugEnabled() ? this : this.getMessage());
	}
	
	public InvalidInformationException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
		LOG.error(message, LOG.isDebugEnabled() ? cause : cause.getMessage());
	}
	
	public InvalidInformationException(String message) {
		super(message);
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
