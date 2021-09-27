/*======================================
 * 	Main.java
 *  - main() �޼ҵ尡 ���Ե� �׽�Ʈ Ŭ����
 * =====================================*/
package com.test.spr;

import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main 
{
	public static void main(String[] args) 
	{
		// �� ���� ���࿡ ���� �׽�Ʈ(Spring AOP ��� ���� ��)
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		// Calculator = new CalculatorImpl(); �̰� ��ſ�
		Calculator cal = context.getBean("proxy", Calculator.class);
		// xml ���Ͽ� �ִ� id proxy �� �����ͼ�.. class �ε��ؼ�.. ��ü ���� �˾Ƽ� �ؼ�..
		// aspect ���̵�� calaspect ��ü�� �˾Ƽ� ����...
		// �����̳ʰ� �˾Ƽ� �ϰ� ������ ������ ���⸸ ��.
		int add = cal.add(10, 20);
		System.out.println(add);
		
		int sub = cal.sub(10, 20);
		System.out.println(sub);
		
		int multi = cal.multi(10, 20);
		System.out.println(multi);
		
		int div = cal.div(10, 20);
		System.out.println(div);
		
	}
}


