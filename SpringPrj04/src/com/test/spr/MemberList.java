package com.test.spr;
/*=================================
 * MemberList.java
 * - DAO Ŭ������ �����ϴ� Ŭ����.
 * - �������� ����.
 * - print() �޼ҵ� ����.
==================================*/



public class MemberList 
{
	// ������ IoC/DI ���� ����
	// ��� ���� �߰��ϴ� �������� ������ Ÿ���� �������̽� ����~!!!
	
	private IDAO dao;

	// setter �޼ҵ� �߰�(������ �ʿ� ����. �״�� ���)
	public void setDao(IDAO dao)
	{
		this.dao = dao;
	}
	// ���⼭ ���� set �ƳĿ� ���� �θ��� �޼ҵ尡 �޶���


	// print() �޼ҵ� ����
	public void print()
	{
		try 
		{
			for (MemberDTO dto : dao.list())
			{
				System.out.printf("%10s %4s %15s %15s%n"
						, dto.getId(), dto.getName()
						, dto.getTel(), dto.getEmail());
			}
			
		} catch (Exception e) 
		{
			System.out.println(e.toString());
		}
	}
}
