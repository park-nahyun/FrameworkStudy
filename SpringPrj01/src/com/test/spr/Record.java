/*================
 * Record.java
 * - �������̽� 
 =================*/

package com.test.spr;

public interface Record
{
	public void setKor(int kor);
	public int getKor();
	
	public void setEng(int eng);
	public int getEng();
	
	public void setMat(int mat);
	public int getMat();
	
	public int getTotal();
	
	public double getAvg();
	
	// �������̽��� �ν��Ͻ� ������ �� ����. 
	// �������̽��� �߻�Ŭ�������� �߻�ȭ ������ �ξ� ���ϴ�.
	
}
