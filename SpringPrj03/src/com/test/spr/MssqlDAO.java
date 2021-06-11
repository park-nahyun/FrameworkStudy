/*=================================
 * MssqlDAO.java
 * - DAO 역할.
 * - OracleDAO 와 설정만 다르게 연결하도록 구성
==================================*/
// DAO 를 다르게 구성하고  xml 에서 각각 불러와서
// 내 걸 보는지 남의 걸 볼 수 있는지.. 테스트..

package com.test.spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MssqlDAO 
{
	public List<MemberDTO> list() throws ClassNotFoundException, SQLException
	{
		List<MemberDTO> result = new ArrayList<MemberDTO>();
		
		// 데이터베이스 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@211.238.142.161:1521:xe", "scott", "tiger");	// 남의 ip
		
		// 쿼리문 준비 및 실행(select)
		String sql = "SELECT ID, NAME, TEL, EMAIL FROM TBL_MEMBERLIST ORDER BY ID";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		// 결과 집합을 컬렉션에 추가
		while (rs.next())
		{
			MemberDTO dto = new MemberDTO();
			dto.setId(rs.getString("ID"));
			dto.setName(rs.getString("NAME"));
			dto.setTel(rs.getString("TEL"));
			dto.setEmail(rs.getString("EMAIL"));
			result.add(dto);
		}
		rs.close();
		stmt.close();
		
		// 데이터베이스 연결 종료
		if(!conn.isClosed())
			conn.close();
		
		return result;
	}
}
