package com.buzzfreeze.JavaPart1;

public class java4_5ContinueFor {
	public static void main(String[] args) {
//		Lab 9
//		1.���˹������ count �����Ѻ�Ѻ��ҹǹ�ͺ 
//		a.count ������鹷��0 ���仨����20 (��� 20 ����)
//		b.��� count �դ���� 11 ������continue ���� if �з�ҧҹ 
//		c.����ʴ���� 11 �����������ͺ���������ʹ㨤����觷������ʹ�ҹ��ҧ

		int count = 0;
		while (count <= 20) {
			count++;
			if (count == 11) {
				System.out.println(count);
				continue;
			}
			
		}
		
		
		
//		Lab 10
//		������ҧ�����ǹ loop 10 �ͺ���դ��������鹷��1 ���仨� 10 ����ʴ��ء���¡��鹤�� 2 ���������continue

		
		int i = 0;
		while (i < 10) {

			i++;
			if (i == 2) {
				continue;
			}
			System.out.println(i);
			
		}
		
		
		
		
		
		
		
	}
		
}


