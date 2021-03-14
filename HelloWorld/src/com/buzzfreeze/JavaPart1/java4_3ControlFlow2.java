package com.buzzfreeze.JavaPart1;

public class java4_3ControlFlow2 {

	public static void main(String[] args) {
//		Lab 5
//		สร้างโปรแกรมตัดเกรดโดยที่a.เกรด A ถ้าคะแนน = 80b.เกรด B ถ้าคะแนน = 70 c.เกรด C ถ้าคะแนน = 60d.เกรด D ถ้าคะแนน = 50 e.เกรด F ถ้าคะแนน = 40f.เกรด E ถ้าคะแนนเป็นค่าอื่นๆ

		
		int grade = 20;
		switch (grade) {
		case 80:
			System.out.println("A");
			break;
		case 70:
			System.out.println("B");
			break;
		case 60:
			System.out.println("C");
			break;
		case 50:
			System.out.println("D");
			break;
		case 40:
			System.out.println("F");
			break;

		default:
			System.out.println("E");
		}
	}

}
