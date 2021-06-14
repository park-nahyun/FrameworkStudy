/*======================================
 * 	CalculatorProxy.java
 *  - 프록시 클래스.
 *  - 보조 업무 적용 및 주 업무 호출 과정.
 * =====================================*/

package com.test.spr;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

// ※ Proxy 클래스를 만드는 방법 중 비교적 쉽고 직관적인 방법은
//   InvocationHandler 인터페이스를 구현하는 클래스를 만드는 것이다.

public class CalculatorProxy implements InvocationHandler
{
	private Object target;
	
	// 생성자 정의
	public CalculatorProxy(Object target)
	{
		this.target = target;
	}

	// 보조 업무 적용 및 주 업무 호출 과정 추가
	// 가영이가 쓸 키트 (가영이, 정미내용, 정미 속성들)
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		// 보조 업무(cross-cutting concern) 설정
		//-- 시간 측정(Around advice)
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작-----------------------------");
		
		// 주 업무(core concern) 실행 내
		Object result = method.invoke(target, args);
		// (내가 따라해야하는 대상, 객체의 주변속성)
		
		sw.stop();
		log.info("처리 시간 측정 종료-----------------------------");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
											// long형 변환인데 문자로 수신해도 상관 ㄴ
		
		return result;
	}
	// 가영이는 이 키트를 쓰기만 하면 됨.. 즉 프록시 구조는 안뜯어볼것..
	
	
}
