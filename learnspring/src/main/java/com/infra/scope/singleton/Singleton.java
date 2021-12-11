package com.infra.scope.singleton;


public class Singleton {

	public String name;

	// Create a setter method to
	// set the value passed by user
	public void setName(String name)
	{
		this.name = name;
	}

	// Create a getter method so that
	// the user can get the set value
	public String getName()
	{
		return name;
	}
}

