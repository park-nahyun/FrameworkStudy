/*======================================
 * 	Main.java
 *  - main() 메소드가 포함된 테스트 클래스
 * =====================================*/
package com.test.spr;

import java.lang.reflect.Proxy;

public class Main 
{
	public static void main(String[] args) 
	{
		// 주 업무 실행을 할 수 있는 객체 준비
		// 인터페이스 변수 = new 인터페이스구현클래스();
		// 정미패밀리 타입의 정미를 만들겠다.
		Calculator cal = new CalculatorImpl();
		//List list = new ArrayList();
		
		/*
		// 주 업무 실행에 대한 테스트
		int add = cal.add(10,20);
		System.out.println(add);
		
		int sub = cal.sub(10,20);
		System.out.println(sub);
		
		int multi = cal.multi(10,20);
		System.out.println(multi);

		int div = cal.div(10,20);
		System.out.println(div);
		*/
		
		// 주 업무 실행에 대한 테스트(AOP 기법 적용 후)
		// Proxy.newProxyInstance(loader, interfaces, h);
		Calculator proxy = (Calculator)Proxy.newProxyInstance(
				cal.getClass().getClassLoader()
				, cal.getClass().getInterfaces()	// 인터페이스는 상속과 달리 여러 개 물려 받을 수 있으므로 여러 개 전달 가능
				, new CalculatorProxy(cal));
		// Proxy.newProxyInstance(주 업무 실행하는 클래스에 대한 정보 전달 정미의 설계도..
		//						 , 주 업무 실행 클래스의 인터페이스에 대한 정보 전달(쩡미 패밀리)
		//						 , 보조 업무 실행 클래스에 대한 정보 전달 가영이);
		// 정미-가영 싱크로 확인 위해 둘 다 넘김
		// 결과 값은 object.. 정미인 척 할 수 있는 오브젝트
		
		int add = proxy.add(10, 20);
		System.out.println(add);

		int sub = proxy.sub(10, 20);
		System.out.println(sub);
		
		int multi = proxy.multi(10, 20);
		System.out.println(multi);
		
		int div = proxy.div(10, 20);
		System.out.println(div);
		
	}
}


