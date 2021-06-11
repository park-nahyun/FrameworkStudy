/*=================================
 * MemberList.java
 * - DAO 클래스를 참조하는 클래스.
 * - 의존관계 설정.
 * - print() 메소드 구현.
==================================*/

package com.test.spr;

public class MemberList 
{
	// 처음 연결하는 클래스 정보
	/*
	private OracleDAO dao;
	
	
	public MemberList()
	{
		// MemberList 입장에서의 의존 객체 OracleDAO
		dao = new OracleDAO();
	}
	
	// ※ 현재의 방법은
	//   환경 변화에 대해서 소스 코드 자체를 수정하지 않고는
	//   적응하지 못하는 단점이 있다. 
	
	*/
	// 두 번째 연결하는 클래스 정보
	private MssqlDAO dao;
	
	public MemberList()
	{
		// MemberList 입장에서의 의존 객체 MssqlDAO
		dao = new MssqlDAO();
	}
	
	
	// print() 메소드 구현
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
