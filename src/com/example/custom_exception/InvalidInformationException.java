package com.example.custom_exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidInformationException extends RuntimeException {
	
	/**
	 * 
	 */
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
