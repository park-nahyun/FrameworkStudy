/*================
 * Record.java
 * - 인터페이스 
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
	
	// 인터페이스로 인스턴스 생성할 수 없다. 
	// 인터페이스는 추상클래스보다 추상화 정도가 훨씬 심하다.
	
}
