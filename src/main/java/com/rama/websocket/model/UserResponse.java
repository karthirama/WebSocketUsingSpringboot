package com.rama.websocket.model;

public class UserResponse {
	
	private String content;

	
	public UserResponse(String content) {
		this.content = content;
	}
	
	public UserResponse() {
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
