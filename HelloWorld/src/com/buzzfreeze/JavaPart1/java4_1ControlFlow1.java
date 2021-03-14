package com.buzzfreeze.JavaPart1;

public class java4_1ControlFlow1 {

	public static void main(String[] args) {

//		Lab 4
		// 1 ประกาศตัวแปร score = อะไรก็ได้ a.ถ้า score >= 80 ให้ print ว่า Goodb.ถ้า score >= 50 แต่น้อยกว่า 80 ให้ print ว่า normal c.ถ้า score < 50 ให้ print ว่า fail
		int score = 50;
		if (score >= 80) {
			System.out.println("Good");
		} else if (score >= 50 && score < 80) {
			System.out.println("normal");
		} else if (score < 50) {
			System.out.println("fail");
		}

		// 2 จากข้อ 1 ให้ประกาศตัวแปร boolean ว่า isHandSome เพิ่มเข้ามาเป็นค่าอะไรก็ได้a.แก้โจทย์จาก ข้อ 2 ถ้าเกิด isHandSome = true แล้ว ไม่ว่าจะได้ score เท่าไหร่ ก็จะ print Good ตลอด
		boolean isHandsome = true;
		if (isHandsome == true) {
			System.out.println("Good");
		} else {
			if (score >= 80) {
				System.out.println("Good");
			} else if (score >= 50 && score < 80) {
				System.out.println("normal");
			} else if (score < 50) {
				System.out.println("fail");
			}
		}

	}
}
