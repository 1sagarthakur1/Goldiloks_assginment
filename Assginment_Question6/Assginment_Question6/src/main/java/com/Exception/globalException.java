package com.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;


public class globalException {
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<String> notFoundExceptionHandler(NoHandlerFoundException nhfe, WebRequest req){
		return new ResponseEntity<String>(nhfe.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> allExceptionHandler(Exception e, WebRequest req){
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(TestException.class)
	public ResponseEntity<String> allExceptionHandler(TestException testException, WebRequest req){
		return new ResponseEntity<String>(testException.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
	
}
