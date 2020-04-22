package com.example.lambda;

import java.io.Serializable;

/**
 * Response with the implementation to return in the Lambda Function
 * @author Rodrigo Moncada
 */
public class Response implements Serializable {

	private static final long serialVersionUID = 5935005125501182471L;
	private String result;

	public Response() {
		super();
	}

	public String getResult() {
		return "Hello " + result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}