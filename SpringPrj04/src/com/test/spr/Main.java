/*=================================
 * Main.java
 * - main() �޼ҵ带 �����ϴ� �׽�Ʈ Ŭ����
==================================*/

package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		// MemberList memberList = new MemberList();
		//-- ��ü ���� ������ �������� ����ϰ� �ǹǷ�
		//   �ν��Ͻ� ���� ������ ��� �����Ѵ�.
		
		// ������ ȯ�� ���� ������ ��applicationContext.xml������
		// MemberList ��ü�� ���´�.
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MemberList memberList = context.getBean("member", MemberList.class);
		memberList.print();
	}
}
