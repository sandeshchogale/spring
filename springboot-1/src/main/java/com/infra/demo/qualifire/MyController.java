package com.infra.demo.qualifire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// Step 0
	// Create a simple spring boot application - add @RestController and
	// @RequestMapping

	// Step 1 - this would fail as there are two car's
	// @Autowired
	// private static Car car;

	// Step 2-
	// @Autowired
	// @Qualifier("tataCar")
	// private Car car;

	// Step 3
	// @Autowired
	// private Car tataCar;

	// Step 4
	// Add @Primary in Component classes like TataCar
	@Autowired
	private Car car;

	@RequestMapping("/car")
	public String getCar() {
		return car.drive();

		// For step3
		// return tataCar.drive();
	}

}
