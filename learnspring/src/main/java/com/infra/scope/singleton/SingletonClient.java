package com.infra.scope.singleton;

//Influenced by Geeks of Geeks

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonClient {

	public static void main(String[] args)
	{
		// Load the Spring XML configuration
		// file into IoC container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"singleton.xml");

		// Get the "HelloWorld" bean object
		// and call getName() method
		Singleton mys = (Singleton)applicationContext.getBean("mySingleton");

		// Set the name
		mys.setName("Singleton");
		System.out.println("Welcome - Your name is: "+ mys.getName());

		// Get another "HelloWorld" bean object
		// and call getName() method
		Singleton mys1 = (Singleton)applicationContext.getBean("mySingleton");
		System.out.println("Welcome - Your name is: "+ mys1.getName());//Same instance

		// Now compare the references to see
		// whether they are pointing to the
		// same object or different object
		System.out.println(mys== mys1);
	}
}
