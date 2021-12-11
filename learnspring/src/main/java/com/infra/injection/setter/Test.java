package com.infra.injection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("setter.xml");
		Employee emp = (Employee) context.getBean("emp");
		emp.display();
	}
}
