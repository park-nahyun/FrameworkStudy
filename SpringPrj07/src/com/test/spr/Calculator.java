/*===========================
 * 	Calculator.java
 *  - �������̽�
 * ==========================*/


package com.test.spr;

// �� ���������� AOP ����� �����ϱ� ���ؼ���
//   ��� ��ü�� �������̽��� �����ϰ� �־�� �Ѵ�.

public interface Calculator 
{
	// �� ����(core concern) ������ ���� �޼ҵ� ����
	//-- ����, ����, ����, ������
	public int add(int x, int y);
	public int sub(int x, int y);
	public int multi(int x, int y);
	public int div(int x, int y);
}
