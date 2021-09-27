/*========================================
   CalculatorAfterThrowing.java
   - After Throwing Advice ����
========================================*/

package com.test.spr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class CalculatorAfterThrowing implements ThrowsAdvice
{
	public void afterThrowing(IllegalArgumentException e)
	{
		Log log = LogFactory.getLog(this.getClass());
		log.info("After Throwing Advice ����-----------");
		log.info("�� ���� ���� �������� ���� �߻� �� ó���Ǵ� ���� ����");		
		log.info("-----------After Throwing Advice ����");		
	}
}
