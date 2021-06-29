package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	
	@Test(invocationCount=10)
	public void test() {
		int a=3;
		int b=3;
		int c=3;
		int d=3;
		int f=a+b+c+d;
		System.out.println("Sum is :"+f);
	}
}
