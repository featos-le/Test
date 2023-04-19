package com.example.provider.exception;

import com.example.provider.common.ApiResponse;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse> unhandledExceptions(Exception ex){
		String message = NestedExceptionUtils.getMostSpecificCause(ex).getMessage();
		
		ex.printStackTrace();
		
		return new ResponseEntity<ApiResponse>(new ApiResponse(false, message), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
