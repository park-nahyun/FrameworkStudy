/*======================================
 * 	Main.java
 *  - main() 메소드가 포함된 테스트 클래스
 * =====================================*/
package com.test.spr;

import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main 
{
	public static void main(String[] args) 
	{
		// 주 업무 실행에 대한 테스트(Spring AOP 기법 적용 후)
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		// Calculator = new CalculatorImpl(); 이거 대신에
		Calculator cal = context.getBean("proxy", Calculator.class);
		// xml 파일에 있는 id proxy 를 데려와서.. class 로딩해서.. 객체 생성 알아서 해서..
		// aspect 아이디로 calaspect 객체도 알아서 생성...
		// 컨테이너가 알아서 하고 메인은 가져다 쓰기만 함.
		int add = cal.add(10, 20);
		System.out.println(add);
		
		int sub = cal.sub(10, 20);
		System.out.println(sub);
		
		int multi = cal.multi(10, 20);
		System.out.println(multi);
		
		int div = cal.div(10, 20);
		System.out.println(div);
		
	}
}


