package com.buzzfreeze.JavaPart2;

public class java7 {
	public static void main(String[] args) {
//		Lab 12 กําหนด String เป็นดังน
		String String1 = "You and Me";
		String String2 = " you and me ";

		// 1 ทดลองเปรียบเทียบ String 2 String ว่าเป็นค่าเดียวกันหรือไม่
		if (String1.equals(String2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");			// Not equal
		//2 ใช้คําสั่งค้นหาคําในString และแสดงคําที่ค้นหาบนหน้าจอ
		String check = "you";
		System.out.println(String2.contains(check));	// true
		//3 ช้คําสั่งหาความยาวของString นั้นและแสดงค่าความยาวString
		System.out.println(String2.length());			// 12
		//4 ใช้คําสั่งตัดข้อความหรือตัดString ตําแหน่งที่1-4 ออก
		System.out.println(String1.substring(1, 5));	// ou a
		//5 ใช้คําสั่งตัดช่องว่างของประโยค
		System.out.println(String2.trim());				// you and me
		//6 ใช้คําสั่งตัดช่องว่างของประโยค
		System.out.println(String2.toUpperCase());		//  YOU AND ME
		//7
		System.out.println(String2.trim().toUpperCase()); // YOU AND ME
	}
}
