package com.buzzfreeze.java10_3;



public class Employee {

	public String firstname;
	public String lastname;
	private int salary;
	public static String planet = "Earth";
	// 1. ��С�ȵ���� position str �纵��˹�
	// 2. ���ҧ method public checkPosion print ���˹�
	// 3. ���ҧ�ա Employee ���� 1 ��
	// 4. ���ҧ method getFullName return FirstName ��͡Ѻ LastName
	public String position;

	public static void main(String[] args) {
//		Employee em1 = new Employee("Krisada", "Chalermsook", 10000, "CEO");
//		Employee em2 = new Employee("john", "wick", 10000, "developer");
//		test();
//		em1.hello();
//		em1.checkPosition();
//		System.out.println(em2.getFullName(em2.firstname, em2.lastname));

		Employee[] employees = new Employee[3];	
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("First name " +i, "last "+i ,1000+ i, "position "+i );
		}
		
		System.out.println(employees[1].firstname);
		System.out.println(employees[2].firstname);
		System.out.println(employees[1].salary);
		System.out.println(employees[0].position);
		
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
