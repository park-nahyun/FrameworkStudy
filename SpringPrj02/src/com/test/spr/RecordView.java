/*================
 * RecordView.java
 * - 인터페이스 
 =================*/

package com.test.spr;

public interface RecordView
{
	// setter() 메소드 선언
	public void setRecord(Record record);	// 레코드뷰 입장에서는 레코드를 필요로 함.. 즉 레코드는 의존객체
	
	// 입력 액션 전용 메소드 선언
	public void input();
	
	// 출력 액션 전용 메소드 선언
	public void output();
}
