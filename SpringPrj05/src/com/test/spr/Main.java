/*======================================
 * 	Main.java
 *  - main() �޼ҵ尡 ���Ե� �׽�Ʈ Ŭ����
 * =====================================*/
package com.test.spr;

public class Main 
{
	public static void main(String[] args) 
	{
		// �� ���� ������ �� �� �ִ� ��ü �غ�
		// �������̽� ���� = new �������̽�����Ŭ����();
		Calculator cal = new CalculatorImpl();
		//List list = new ArrayList();
				
		// �� ���� ���࿡ ���� �׽�Ʈ
		int add = cal.add(10,20);
		System.out.println(add);
		
		int sub = cal.sub(10,20);
		System.out.println(sub);
		
		int multi = cal.multi(10,20);
		System.out.println(multi);

		int div = cal.div(10,20);
		System.out.println(div);
	}
}


/*
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl add
����: ó�� �ð� ���� ����------------------
10 + 20 = 30
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl add
����: ó�� �ð� ���� ����------------------
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl add
����: ����ð� : 44/1000��
30
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl sub
����: ó�� �ð� ���� ����------------------
10 - 20 = -10
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl sub
����: ó�� �ð� ���� ����------------------
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl sub
����: ����ð� : 1/1000��
-10
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl multi
����: ó�� �ð� ���� ����------------------
10 * 20 = 200
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl multi
����: ó�� �ð� ���� ����------------------
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl multi
����: ����ð� : 1/1000��
200
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl div
����: ó�� �ð� ���� ����------------------
10 / 20 = 0
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl div
����: ó�� �ð� ���� ����------------------
6�� 14, 2021 10:40:28 ���� com.test.spr.CalculatorImpl div
����: ����ð� : 2/1000��
0
 */