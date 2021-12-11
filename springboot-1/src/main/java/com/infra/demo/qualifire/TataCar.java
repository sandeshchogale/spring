package com.infra.demo.qualifire;

import org.springframework.stereotype.Component;

@Component("TataCar")
public class TataCar implements Car{

	@Override
	public String drive() {
		return "Drive Tata Car";	
	}
}
