package com.greatlearning.lab1.model;

public class Employee {

	public String firstName;
	public String lastName;

	

	public Employee(String fname, String lname) {
		this.firstName = fname;
     	this.lastName = lname;
	}

	public String getName()
	{    
		String emailID = firstName+lastName;
		//System.out.println("Name is : "+emailID);
		return emailID.toLowerCase();
	}

}
