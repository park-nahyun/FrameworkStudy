/*========================================
   CalculatorImpl.java
   - Calculator �������̽��� �����ϴ� Ŭ����.
   - �� ������ ����� Ŭ����
========================================*/

package com.test.spr;

public class CalculatorImpl implements Calculator
{
	// �� ����(core concern) ������ ���� �޼ҵ� ����
	
	@Override
	public int add(int x, int y)
	{
		int result = 0;
		
		result = x + y;
		System.out.printf("%d + %d = %d%n", x, y, result);
		
		return result;
	}

	@Override
	public int sub(int x, int y)
	{
		int result = 0;
		
		result = x - y;
		System.out.printf("%d - %d = %d%n", x, y, result);
		
		return result;
	}

	@Override
	public int multi(int x, int y)
	{
		int result = 0;
		
		result = x * y;
		System.out.printf("%d * %d = %d%n", x, y, result);
		
		return result;
	}

	@Override
	public int div(int x, int y)
	{
		int result = 0;
		
		result = x / y;
		System.out.printf("%d / %d = %d%n", x, y, result);
		
		return result;
	}

	
}