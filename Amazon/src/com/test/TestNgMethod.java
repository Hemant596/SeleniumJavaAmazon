package com.test;

import org.testng.annotations.Test;

public class TestNgMethod {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePage() {
		System.out.println("Homepage");
	}

}
