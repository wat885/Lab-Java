package com.buzzfreeze.java14;

public class Programmer extends Employee {

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}
	
	public void createWebsite(String template, String titleName){
		System.out.println("createWebsite");
	}
	
	public void installWindows(String version, String productKey){
		System.out.println("installWindows");
	}
	
	public static void main(String[] args) {

		Programmer dang = new Programmer("Dang", "Red", 6000, "Programer");

		dang.hello();
		System.out.println(dang.getSalary());
		dang.createWebsite(planet, planet);


	}

}
