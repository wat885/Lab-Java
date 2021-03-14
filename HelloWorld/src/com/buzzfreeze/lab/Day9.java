package com.buzzfreeze.lab;

public class Day9 {
	
	public static void main(String[] args) {
		System.out.println(Employee.planet); // Earth
		Employee.planet = "Mars";
		System.out.println(Employee.planet); // Mars
		Employee dang = new Employee("Dang","Red", 50,"tester");
		System.out.println(dang.planet); // Mars
		

		
	}

}
