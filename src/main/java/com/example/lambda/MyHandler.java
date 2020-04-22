package com.example.lambda;

import java.util.function.Function;
import org.springframework.stereotype.Component;

/**
 * Handler for Lambda Function
 * @author Rodrigo Moncada
 */
@Component
public class MyHandler implements Function<Request,Response> {

	@Override
	public Response apply(Request req) {
		Response resp = new Response();
		resp.setResult(req.getUsername());
		
		return resp;
	}
	
}