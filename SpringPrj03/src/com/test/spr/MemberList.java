/*=================================
 * MemberList.java
 * - DAO Ŭ������ �����ϴ� Ŭ����.
 * - �������� ����.
 * - print() �޼ҵ� ����.
==================================*/

package com.test.spr;

public class MemberList 
{
	// ó�� �����ϴ� Ŭ���� ����
	/*
	private OracleDAO dao;
	
	
	public MemberList()
	{
		// MemberList ���忡���� ���� ��ü OracleDAO
		dao = new OracleDAO();
	}
	
	// �� ������ �����
	//   ȯ�� ��ȭ�� ���ؼ� �ҽ� �ڵ� ��ü�� �������� �ʰ��
	//   �������� ���ϴ� ������ �ִ�. 
	
	*/
	// �� ��° �����ϴ� Ŭ���� ����
	private MssqlDAO dao;
	
	public MemberList()
	{
		// MemberList ���忡���� ���� ��ü MssqlDAO
		dao = new MssqlDAO();
	}
	
	
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
