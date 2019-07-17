package com.lazy.foodapp.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomExceptionHandler extends RuntimeException {

	@ExceptionHandler(InvalidRegisterInformationException.class)
	public final ResponseEntity<ErrorResponse> handleInvalidRegisterInformation(InvalidRegisterInformationException ex,
			WebRequest request) {
		List<String> details = new ArrayList<>();
		details.add(ex.getLocalizedMessage());

		return new ResponseEntity<ErrorResponse>(new ErrorResponse(HttpStatus.BAD_REQUEST.toString(), details),
				HttpStatus.BAD_REQUEST);

	}
	@ExceptionHandler(LoginFailedException.class)
	public final ResponseEntity<ErrorResponse> handleLoginFailedException(LoginFailedException ex,WebRequest request){
		List<String> details = new ArrayList<>();
		details.add(ex.getLocalizedMessage());

		return new ResponseEntity<ErrorResponse>(new ErrorResponse(HttpStatus.UNAUTHORIZED.toString(), details),
				HttpStatus.UNAUTHORIZED);
	}

}
