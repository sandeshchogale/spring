package com.infra.annotation.componentscan;

import org.springframework.stereotype.Component;

@Component
public class Department {

	private String dept = "IT";

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void show() {
		System.out.println("Department "+ dept);
	}
	
}
