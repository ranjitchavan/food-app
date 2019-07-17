package com.lazy.foodapp.exception;

public class LoginFailedException extends RuntimeException{

	public LoginFailedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginFailedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public LoginFailedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LoginFailedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public LoginFailedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginFailedException []";
	}

	
}
