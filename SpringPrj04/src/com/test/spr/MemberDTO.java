/*==============================
 * MemberDTO.java
 * - TBL_MEMBERLIST ���̺� ���ڵ� ����
==============================*/

package com.test.spr;

public class MemberDTO 
{
	// �ֿ� �Ӽ� ���� �� TBL_MEMBERLIST ���̺� ���ڵ� ����
	private String id, pw, name, tel, email;

	// getter/setter ����
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// ���� ���� ������ �� �⺻ ������(default) �� ����
}
