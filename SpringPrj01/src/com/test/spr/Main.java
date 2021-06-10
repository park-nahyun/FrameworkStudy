/*=========================================
 * Main.java
 * - main() 메소드가 포함된 테스트 클래스
 ==========================================*/

package com.test.spr;

public class Main
{
	public static void main(String[] args)
	{
		// [스프링(컨테이너)이 처리하고 관리하게 될 영역]
		// -------------------------------------------------------------------------------------------
		// ① RecordImpl1(Record) 객체 생성 과정
		Record rec1 = new RecordImpl1();			//-- dependancy (레코드뷰 입장에서의 의존 객체)
		
		// ② RecordImpl2(Record) 객체 생성 과정	//-- dependancy (레코드뷰 입장에서의 의존 객체)
		Record rec2 = new RecordImpl2();
		
		// RecordViewImpl(RecordView) 객체 생성 과정
		//-- Record 객체(의존 객체 - RecordImpl1 or RecordImpl2) 를 필요로 함
		RecordView view = new RecordViewImpl();
		
		// 의존 객체 주입
		//-- 의존 객체 주입 방법을 사용하게 되면
		//   느슨한 결합을 구성할 수 있게 되고(유연성 향상)
		//   한 쪽의 변동 상황이 다른 쪽에 영향을 덜 줄 수 있게 된다.
		// 인터페이스 없이 클래스로만 이 작업을 했다면... RecordImpl1 rec1 = new RecordImpl1(); 이런식으로
		// RecordImpl1'만' 만들 수 있게 되었을 것.. veiw.setRecord(rec1) 이것만 가능했을 것.
		
		
		// view.setRecord(rec1);			//-- setter injection
											//   (setter를 통한 주입)
		
		view.setRecord(rec2);
		
		// 메인에서만 다루면 프로그램을 다르게 구현할 수 있음. 굳이 다른 파일들을  건드리지 않아도!!!
		// 단점 : 어쨌든 main과.. 클래스 영역이 바꿔지고 있음..
		// 과거에는 따로 추출할 수 없었는데.. 스프링에서는 rec2만 바꿔 넣으면 됨
		
		// ------------------------------------------------------------------------------------------
		
		view.input();
		view.output();
	}
}
