package com.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class globalException {
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MoreExceptionDetails> notFoundExceptionHandler(NoHandlerFoundException nhfe, WebRequest req){
		          MoreExceptionDetails moreExceptionDetails = new MoreExceptionDetails();
		          moreExceptionDetails.setLocalDateTime(LocalDateTime.now());
		          moreExceptionDetails.setMassage(nhfe.getMessage());
		return new ResponseEntity<MoreExceptionDetails>(moreExceptionDetails, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MoreExceptionDetails> allExceptionHandler(Exception e, WebRequest req){
		 MoreExceptionDetails moreExceptionDetails = new MoreExceptionDetails();
         moreExceptionDetails.setLocalDateTime(LocalDateTime.now());
         moreExceptionDetails.setMassage(e.getMessage());
		return new ResponseEntity<MoreExceptionDetails>(moreExceptionDetails, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MoreExceptionDetails> validationExceptionHandler(MethodArgumentNotValidException manve){
		MoreExceptionDetails moreExceptionDetails = new MoreExceptionDetails();
        moreExceptionDetails.setLocalDateTime(LocalDateTime.now());
        moreExceptionDetails.setMassage(manve.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<MoreExceptionDetails>(moreExceptionDetails, HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MoreExceptionDetails> allExceptionHandler(UserException testException, WebRequest req){
		MoreExceptionDetails moreExceptionDetails = new MoreExceptionDetails();
        moreExceptionDetails.setLocalDateTime(LocalDateTime.now());
        moreExceptionDetails.setMassage(testException.getMessage());
		return new ResponseEntity<MoreExceptionDetails>(moreExceptionDetails, HttpStatus.BAD_REQUEST);
	}
	
	
}
