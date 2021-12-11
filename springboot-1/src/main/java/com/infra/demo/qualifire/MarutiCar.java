package com.infra.demo.qualifire;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("marutiCar")
//Uncomment for Step4
@Primary
public class MarutiCar implements Car{

	@Override
	public String drive() {
		return "Drive Maruti Car";	
	}
}