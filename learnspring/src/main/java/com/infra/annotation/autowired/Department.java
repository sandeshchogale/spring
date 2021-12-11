package com.infra.annotation.autowired;

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
