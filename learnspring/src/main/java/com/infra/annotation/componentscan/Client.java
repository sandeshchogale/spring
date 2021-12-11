package com.infra.annotation.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {


	public static void main(String[] args) {
		//Using a new AnnotationConfigApplicationContext
		//Pass the configuration class into it
		ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
		
		//No type cast required
		//We did not call the getEmployee method
		Employee e = factory.getBean(Employee.class);
		e.display();
	}
}
