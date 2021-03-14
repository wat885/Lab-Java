package com.buzzfreeze.java12;

public class CEO extends Employee {

	public CEO(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() * 2;
	}

	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}

	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}

}
