/*======================================
 * 	Main.java
 *  - main() 메소드가 포함된 테스트 클래스
 * =====================================*/
package com.test.spr;

public class Main 
{
	public static void main(String[] args) 
	{
		// 주 업무 실행을 할 수 있는 객체 준비
		// 인터페이스 변수 = new 인터페이스구현클래스();
		Calculator cal = new CalculatorImpl();
		//List list = new ArrayList();
				
		// 주 업무 실행에 대한 테스트
		int add = cal.add(10,20);
		System.out.println(add);
		
		int sub = cal.sub(10,20);
		System.out.println(sub);
		
		int multi = cal.multi(10,20);
		System.out.println(multi);

		int div = cal.div(10,20);
		System.out.println(div);
	}
}


/*
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl add
정보: 처리 시간 측정 시작------------------
10 + 20 = 30
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl add
정보: 처리 시간 측정 종료------------------
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl add
정보: 경과시간 : 44/1000초
30
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl sub
정보: 처리 시간 측정 시작------------------
10 - 20 = -10
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl sub
정보: 처리 시간 측정 종료------------------
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl sub
정보: 경과시간 : 1/1000초
-10
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl multi
정보: 처리 시간 측정 시작------------------
10 * 20 = 200
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl multi
정보: 처리 시간 측정 종료------------------
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl multi
정보: 경과시간 : 1/1000초
200
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl div
정보: 처리 시간 측정 시작------------------
10 / 20 = 0
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl div
정보: 처리 시간 측정 종료------------------
6월 14, 2021 10:40:28 오전 com.test.spr.CalculatorImpl div
정보: 경과시간 : 2/1000초
0
 */