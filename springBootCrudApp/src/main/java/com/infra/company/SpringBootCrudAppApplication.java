package com.infra.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudAppApplication.class, args);
		/*
		 * System.out.println("Hello World!!"); ConfigurableApplicationContext context =
		 * SpringApplication.run(SpringBootAppApplication.class, args); Employee emp =
		 * context.getBean(Employee.class); emp.getEmpDetails();
		 */
	}

}
