/*=========================================
 * Main.java
 * - main() 메소드가 포함된 테스트 클래스
 ==========================================*/

package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		/*
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
		*/
		
		// ※ 스프링 프레임워크에서는
		//    객체 생성 과정 및 DI(의존 객체 주입)에 대한 설정은
		//    스프링 환경 설정 파일로 대체된다. (→ applicationContext.xml)
		
		// 스프링 프레임워크에서 『applicationContext.xml』 파일을 읽어서
		// 생성 및 관리할 객체에 대한 정보를 얻어야 한다.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // 클래스 패스를 xml 어플 통해 
		// 스프링컨테이너한테.. 야 여기에.. 필요한 객체 정보(작업지시서) 넣어둘테니까 니가 직접 꺼내서 읽고 알아서 해^^ 라고 하는 것
		
		// 『getBean()』 메소드를 이용하여 사용자가 원하는 객체를 얻는다.
		// 메소드 인자값으로 id 속성값을 지정하게 된다.
		// applicationContext 로부터 읽어들여서 구성된 context로부터 bean을 얻어오겠다.
		// RecordView view = (RecordView)context.getBean("view"); 	// bean id .. 객체로 가져옴.. 다운캐스팅 필요
		
		// 스프링 3.0 이후 버전부터 사용 가능한 코드(두 번째 인자로 캐스팅해야하는 클래스 정보 넘겨서 그렇게 해라~ 하고 시키는 것)
		RecordView view = (RecordView)context.getBean("view", RecordViewImpl.class); 		// recordViewImpl 객체
		
		view.input();
		view.output();
		
		// 우리가 객체를 만들지 않고 스프링 컨테이너 안에서 스프링컨테이너가 만들어서 스컨이 스컨에 주입함.
		// 우린 만들어진 걸 받는 정도..
	}
}
