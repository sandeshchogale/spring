package com.infra.annotation.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean
	public Department getDepartment(){
		return new Department();
	}
}
