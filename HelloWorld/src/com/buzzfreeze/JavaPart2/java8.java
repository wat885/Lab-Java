package com.buzzfreeze.JavaPart2;

public class java8 {
	public static void main(String[] args) {
//		Lab 12 ���˹� String �繴ѧ�
		//1
		int sum = 0;
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		for (int row = 0; row < twoD_Array.length; row++) {
			for (int element = 0; element < twoD_Array[row].length; element++) {
				if(element+1 == twoD_Array[row].length) {

					sum = twoD_Array[row][element] + sum;
					System.out.println("last row "+ row + " = " + twoD_Array[row][element]);
				}
//				System.out.println("element = "+ element);
//				System.out.println("row = "+  twoD_Array[row].length);
				
//				System.out.println(twoD_Array[row][element]);
			}
		}
		System.out.println("����ش���¢ͧ�����Ǻǡ�ѹ  = "+sum);
		
		
//		twoD_Array[0][2] = twoD_Array[0][2] +1;
//		System.out.println(twoD_Array[0][2]);
		
	}
}
