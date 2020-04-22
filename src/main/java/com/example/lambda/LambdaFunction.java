package com.example.lambda;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

/**
 * Spring Boot Request Handler for Lambda Function
 * @author Rodrigo Moncada
 */
public class LambdaFunction extends SpringBootRequestHandler<Request,Response>{

}