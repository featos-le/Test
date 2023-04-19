package com.example.provider.common;

import java.time.LocalDateTime;

public class ApiResponse {
	private final boolean status;
	private final String message;
	

	public ApiResponse(boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}
	
	public String getTimestamp() {
		return LocalDateTime.now().toString();
	}
	
}
