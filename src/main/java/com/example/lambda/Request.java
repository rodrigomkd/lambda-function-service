package com.example.lambda;

import java.io.Serializable;

/**
 * Request class for Lambda Function
 * @author Rodrigo Moncada
 */
public class Request implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9130442303204717824L;

	private String username;
	
	public Request() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}