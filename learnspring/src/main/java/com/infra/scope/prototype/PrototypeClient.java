package com.infra.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeClient {

	public static void main(String[] args) {

		// Load the Spring XML configuration
		// file into IoC container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("prototype.xml");

		Prototype p1 = (Prototype) applicationContext.getBean("p");

		// Set the name
		p1.setName("Prototype");
		System.out.println("Hello object (hello1) Your name is: " + p1.getName());

		// Get another "HelloWorld" bean object
		// and call getName() method
		Prototype p2 = (Prototype) applicationContext.getBean("p");

		System.out.println("Hello object (hello2) Your name is: " + p2.getName());

		// Now compare the references to see
		// whether they are pointing to the
		// same object or different object
		System.out.println("'Geeks1' and 'Geeks2'" + "are referring " + "to the same object: " + (p1 == p2));

		// Print the address of both
		// object Geeks1 and Geeks2
		System.out.println("Address of object p1: " + p1);
		System.out.println("Address of object p2: " + p2);
	}

}