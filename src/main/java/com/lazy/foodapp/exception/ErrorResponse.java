package com.lazy.foodapp.exception;

import java.util.List;

public class ErrorResponse
{
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
  
    private String message;
    private List<String> details;
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", details=" + details + "]";
	}
 
    
    //getters and setters
}