package com.buzzfreeze.JavaPart1;

public class java4_4WhileLoop {

	public static void main(String[] args) {
//		Lab 6
//		1.แสดงค่า i ในแต่ละรอบ โดยการประกาศตัวแปร i มาใช้ในการนับในเงื่อนไขของ 
//		while ถ้าหาก i น้อยกว่าหรือเท่ากับ 10 while ( i <= 10 ) แสดงค่า i ออกมา 
//		แต่ละรอบ ( i มีค่าเริ่มต้นเป็น1)
		int i = 0;
		while (i <= 10) {
			System.out.println("Counter" + i);
			i++;
		}

//		2.สร้างโปรแกรมหาผลรวมของตัวเลข 1 ถึง 10
		int sum = 0;
		for (int counter = 0; counter <= 10; counter++) {
			sum += counter;
		}
		System.out.println("sum = " + sum);

//		3.สร้างโปรแกรมหาค่าระหว่าง 1-100 ที่หาร12 ลงตัว
		i = 0;
		while (i <= 100) {
			if (i % 12 == 0) {
				System.out.println(i + "หาร 12 ลงตัว");
			}
			i++;
		}

//		4.ให้ประกาศ array ที่มีค่า[1,2,3,4,5] แล้วใช้ foreach ในการวน loop แล้ว print ค่าออกมาทั้งหมดLab 6. ท าพร้อมๆกัน While Loop

		int myArray[] = { 1, 2, 3, 4, 5 };
		for (int counter : myArray) {
			System.out.println("Counter :" + counter);
		}

//		Lab 7   (อ. โอ๊ค บอกไม่ต้องทำ do while)
//		1. print ค่าตัวเลข 20 โดยเริ่มจากมากไปน้อย
		int counter = 20;
		String str = "" ;
		do {
			str = str + " " + Integer.toString(counter);
			counter--;
		} while (counter >= 1);
		
		System.out.println(str);
//		2.เขียนโปรแกรมตรวจสอบตัวเลขว่าเป็นจํานวนคู่หรือจํานวนคี่โดยโปรแกรมจะทํางานในลูปเรื่อยๆถ้าหากเขายังคงกรอกเลขคู่แต่ถ้ากรอกเลขคี่จะเป็นการออกจากลูป

//		Lab 8
//		1.กําหนดตัวแปร count สําหรับนับจํานวนรอบ 
//		a.count เริ่มต้นที่0 และไปจบที่20 (รวม 20 ด้วย)
//		b.ถ้า count มีค่าเป็น 11 คําสั่งbreak ภายใน if จะทํางาน 
//		c.ให้แสดงค่า 11 และออกจาก loop โดยไม่ทําคําสั่งด้านล่างต่อ
		
		int count = 0;
		while (count <= 20) {
			if (count == 11) {
				System.out.println(count);
				break;
			}
			count++;
		}
		

		

//		for (int counter = 0; counter <= 10; counter++) {
//			System.out.println("Counter :" + counter);
//		}
//
//		int myArray[] = { 1, 2, 3, 4, 5 };
//		for (int counter : myArray) {
//			System.out.println("Counter :" + counter);
//		}
//
//		int counter = 0;
//		while (counter < 5) {
//			System.out.println("Counter" + counter);
//			counter++;
//		}

	}
}
