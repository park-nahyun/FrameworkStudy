/*=================================================
 * RecordViewImpl.java
 * - Ŭ����
 * - RecordView �������̽��� �����ϴ� Ŭ������ ����
 ==================================================*/

package com.test.spr;

import java.util.Scanner;

public class RecordViewImpl implements RecordView
{	// ���ڵ带 �ʿ���ϴ� ���ڵ�並 implement

	// �ֿ� �Ӽ� ���� �� Ư�� Ŭ���� Ÿ���� �ƴ� ... �������̽� Ÿ��
	private Record record;
	
	@Override
	public void setRecord(Record record)
	{
		this.record = record;

	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� ���� �����Է�(���鱸��) : ");
		String kor = sc.next();
		String eng = sc.next();
		String mat = sc.next();
		
		record.setKor(Integer.parseInt(kor));
		record.setEng(Integer.parseInt(eng));
		record.setMat(Integer.parseInt(mat));
		
		sc.close();

	}

	@Override
	public void output()
	{
		System.out.println("   ����  ����  ����  ����  ���");
		System.out.printf("%6d %5d %5d %6d %6.1f%n"
					, record.getKor(), record.getEng(), record.getMat()
					, record.getTotal(), record.getAvg());
	}

}
