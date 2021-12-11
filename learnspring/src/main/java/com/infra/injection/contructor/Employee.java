package com.infra.injection.contructor;

public class Employee {
	private int id;
	private String name;

	//Constructors
	public Employee() {
		System.out.println("default constructor called");
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println(id + " " + name);
	}

}
