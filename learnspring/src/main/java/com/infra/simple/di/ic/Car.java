package com.infra.simple.di.ic;

public class Car {

	//Dependency Injection and Inversion of control
	public Car(Driver d) {
		d.setCar(this);
	}

	public void move() {
		System.out.println("Car is moving");
	}

	public static void main(String args[]) {
		Car c = new Car(new Driver());
		c.move();
	}
}
