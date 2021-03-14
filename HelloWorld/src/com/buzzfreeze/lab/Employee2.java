package com.buzzfreeze.lab;

public class Employee2 {
	public String firstname;
	public String lastname;
	private int salary;

	public Employee2() {
		this.firstname = "Anonymous";
		this.lastname = "Anonymous";
		this.salary = 9000; // default
	}

	public Employee2(String firstnameInput, String lastnameInput) {
		this();
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		
	}

	public Employee2(String firstnameInput, String lastnameInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
	}

	public int getSalary() {
		return salary;
	}
}
