/*===========================
 * 	CalculatorAspect.java
 *  - ���� ���� ���� Ŭ����
 *  - ���� ���� ����, �� ���� ȣ��.
 * ==========================*/
package com.test.spr;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

// �� Spring AOP Proxy Ŭ������ ����� ���ؼ�
//   MethodInterceptor �������̽��� �����ϴ� Ŭ������ �����Ѵ�.

public class CalculatorAspect implements MethodInterceptor
{

	// ���� ���� ���� �� �� ���� ȣ�� ���� �߰�
	@Override
	public Object invoke(MethodInvocation method) throws Throwable
	{
		// ���� ����(cross-cutting concern) ����
		//-- �ð� ����(Around Advice)
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("ó�� �ð� ���� ����-------------------------");
		
		// �� ����(core concern) ȣ�� �κ�~!!!
		Object result = method.proceed();
		
		sw.stop();
		log.info("ó�� �ð� ���� ����-------------------------");
		log.info(String.format("����ð� : %s/1000��", sw.getTotalTimeMillis()));
		
		return result;
	}

}
