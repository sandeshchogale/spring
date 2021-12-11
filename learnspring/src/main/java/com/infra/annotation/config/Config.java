package com.infra.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean //Same as @Bean(name="employee")
	public Employee getEmployee() {
		return new Employee();
	}
	
}
