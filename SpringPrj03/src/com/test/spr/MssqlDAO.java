/*=================================
 * MssqlDAO.java
 * - DAO ����.
 * - OracleDAO �� ������ �ٸ��� �����ϵ��� ����
==================================*/
// DAO �� �ٸ��� �����ϰ�  xml ���� ���� �ҷ��ͼ�
// �� �� ������ ���� �� �� �� �ִ���.. �׽�Ʈ..

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
		
		// �����ͺ��̽� ����
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@211.238.142.161:1521:xe", "scott", "tiger");	// ���� ip
		
		// ������ �غ� �� ����(select)
		String sql = "SELECT ID, NAME, TEL, EMAIL FROM TBL_MEMBERLIST ORDER BY ID";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		// ��� ������ �÷��ǿ� �߰�
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
		
		// �����ͺ��̽� ���� ����
		if(!conn.isClosed())
			conn.close();
		
		return result;
	}
}
