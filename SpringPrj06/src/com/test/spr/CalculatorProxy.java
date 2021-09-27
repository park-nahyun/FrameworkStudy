/*======================================
 * 	CalculatorProxy.java
 *  - ���Ͻ� Ŭ����.
 *  - ���� ���� ���� �� �� ���� ȣ�� ����.
 * =====================================*/

package com.test.spr;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

// �� Proxy Ŭ������ ����� ��� �� ���� ���� �������� �����
//   InvocationHandler �������̽��� �����ϴ� Ŭ������ ����� ���̴�.

public class CalculatorProxy implements InvocationHandler
{
	private Object target;
	
	// ������ ����
	public CalculatorProxy(Object target)
	{
		this.target = target;
	}

	// ���� ���� ���� �� �� ���� ȣ�� ���� �߰�
	// �����̰� �� ŰƮ (������, ���̳���, ���� �Ӽ���)
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		// ���� ����(cross-cutting concern) ����
		//-- �ð� ����(Around advice)
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("ó�� �ð� ���� ����-----------------------------");
		
		// �� ����(core concern) ���� ��
		Object result = method.invoke(target, args);
		// (���� �����ؾ��ϴ� ���, ��ü�� �ֺ��Ӽ�)
		
		sw.stop();
		log.info("ó�� �ð� ���� ����-----------------------------");
		log.info(String.format("����ð� : %s/1000��", sw.getTotalTimeMillis()));
											// long�� ��ȯ�ε� ���ڷ� �����ص� ��� ��
		
		return result;
	}
	// �����̴� �� ŰƮ�� ���⸸ �ϸ� ��.. �� ���Ͻ� ������ �ȶ���..
	
	
}
