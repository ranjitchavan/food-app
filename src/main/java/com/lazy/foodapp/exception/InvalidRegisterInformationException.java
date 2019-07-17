package com.lazy.foodapp.exception;

public class InvalidRegisterInformationException extends RuntimeException {

	public InvalidRegisterInformationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidRegisterInformationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidRegisterInformationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidRegisterInformationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidRegisterInformationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InvalidRegisterInformation []";
	}

	
}
