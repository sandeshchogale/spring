package com.infra.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String empId = "1";
	
	/*
	 * Instead of using factory.getBean - we can @Autowired
	 */
	
	@Autowired
	private Department dept;
	
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public void display() {
		System.out.println("Emp "+empId + " works in ");
		dept.show();
	}
}