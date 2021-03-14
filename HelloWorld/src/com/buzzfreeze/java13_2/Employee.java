package com.buzzfreeze.java13_2;



public class Employee {

	public String firstname;
	public String lastname;
	private int salary;
	public static String planet = "Earth";

	public String position;

	public static void main(String[] args) {
//		3.2 สร้าง instance
		Employee em1 = new Employee("Krisada", "Chalermsook", 10000, "CEO");
		Employee em2 = new Employee("john", "wick", 10000, "developer");
		test();
		em1.hello();
//		3.3 เรียก checkPosition
		em1.checkPosition();



		
	}
	
	public static void test() {
		System.out.println("this is static method");
	}

	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position = positionInput;
	}

	public void hello() {
		System.out.println("Hello " + this.firstname);
	}
	public void helloFriend(String firstname) {
		System.out.println("I am " + this.firstname + " Iwant to meet yout " + firstname);
	}

	public int getSalary() {
		return salary;
	}

	public void checkPosition() {
		System.out.println("My Position is " + position);
	}
	
	public String getFullName(String fName, String lName) {
//		System.out.println(fName +" " + position);
		return fName + " " +lName;
	}

}
