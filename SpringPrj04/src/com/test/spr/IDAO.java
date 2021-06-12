/*=================================
 * IDAO.java
 * - 인터페이스
==================================*/

package com.test.spr;

import java.sql.SQLException;
import java.util.List;

public interface IDAO 
{
	public List<MemberDTO> list() throws ClassNotFoundException, SQLException;
	
	// 오버라이딩 한 애가 예외처리 할 수 없으므로 여기서 해야함 (자바 복습)
}
