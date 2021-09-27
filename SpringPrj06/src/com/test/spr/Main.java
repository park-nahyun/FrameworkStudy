/*======================================
 * 	Main.java
 *  - main() �޼ҵ尡 ���Ե� �׽�Ʈ Ŭ����
 * =====================================*/
package com.test.spr;

import java.lang.reflect.Proxy;

public class Main 
{
	public static void main(String[] args) 
	{
		// �� ���� ������ �� �� �ִ� ��ü �غ�
		// �������̽� ���� = new �������̽�����Ŭ����();
		// �����йи� Ÿ���� ���̸� ����ڴ�.
		Calculator cal = new CalculatorImpl();
		//List list = new ArrayList();
		
		/*
		// �� ���� ���࿡ ���� �׽�Ʈ
		int add = cal.add(10,20);
		System.out.println(add);
		
		int sub = cal.sub(10,20);
		System.out.println(sub);
		
		int multi = cal.multi(10,20);
		System.out.println(multi);

		int div = cal.div(10,20);
		System.out.println(div);
		*/
		
		// �� ���� ���࿡ ���� �׽�Ʈ(AOP ��� ���� ��)
		// Proxy.newProxyInstance(loader, interfaces, h);
		Calculator proxy = (Calculator)Proxy.newProxyInstance(
				cal.getClass().getClassLoader()
				, cal.getClass().getInterfaces()	// �������̽��� ��Ӱ� �޸� ���� �� ���� ���� �� �����Ƿ� ���� �� ���� ����
				, new CalculatorProxy(cal));
		// Proxy.newProxyInstance(�� ���� �����ϴ� Ŭ������ ���� ���� ���� ������ ���赵..
		//						 , �� ���� ���� Ŭ������ �������̽��� ���� ���� ����(�Ĺ� �йи�)
		//						 , ���� ���� ���� Ŭ������ ���� ���� ���� ������);
		// ����-���� ��ũ�� Ȯ�� ���� �� �� �ѱ�
		// ��� ���� object.. ������ ô �� �� �ִ� ������Ʈ
		
		int add = proxy.add(10, 20);
		System.out.println(add);

		int sub = proxy.sub(10, 20);
		System.out.println(sub);
		
		int multi = proxy.multi(10, 20);
		System.out.println(multi);
		
		int div = proxy.div(10, 20);
		System.out.println(div);
		
	}
}


