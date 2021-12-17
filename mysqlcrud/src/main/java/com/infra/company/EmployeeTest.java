package com.infra.company;

import org.springframework.stereotype.Component;

@Component
public class EmployeeTest {
	private int id=123;
	private String name = "sandesh";
	private Double salary = 111.0;

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public void getEmpDetails() {
		System.out.println("Employee id= " + id + " name= "  + name + " salary= " + salary );
	}
	

}
