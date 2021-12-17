package com.infra.logging.sl4j;


import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	public String getHelloMessage() {
		return "Hello World!!";
	}
}
