/*=========================================
 * RecordImpl1.java 	// 갈아끼우는 부품
 * - 클래스
 * - Record 인터페이스를 구현하는 클래스
 ==========================================*/

// 레코드를 imple~ 즉 타입이 레코드 타입

/*
 * 나현 implements 사람
 * {
 * }
 * 
 * 아별 implements 사람
 * {
 * }
 * 
 * 사람 ob1 = new 사람(); (X) 사람이 인터페이스니까
 * 사람 ob1 = new 나현(); (O) 나현인 사람 타입^^ Main 참조~!
 * */

package com.test.spr;

public class RecordImpl1 implements Record
{
	// 주요 속성 구성
	private int kor, eng, mat;

	@Override
	public void setKor(int kor)
	{
		this.kor = kor;
		
	}

	@Override
	public int getKor()
	{
		return kor;
	}

	@Override
	public void setEng(int eng)
	{
		this.eng = eng;
		
	}

	@Override
	public int getEng()
	{
		return eng;
	}

	@Override
	public void setMat(int mat)
	{
		this.mat = mat;
		
	}

	@Override
	public int getMat()
	{
		return mat;
	}

	@Override
	public int getTotal()
	{
		int result = 0;
		result = this.getKor() + this.getEng() + this.getMat();
		
		return result;
	}

	@Override
	public double getAvg()
	{
		double result = 0;
		result = this.getTotal()/3.0;
		
		return result;
	}
	
	
}
