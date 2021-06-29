package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
//	@Test(timeOut=2000)
//	public void infiniteLoopTest() {
//		int i=1;
//		while( i==1) {
//			System.out.println(1);
//		
//		}
//	}

	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String A = "A123";
		Integer.parseInt(A);
	}
}
