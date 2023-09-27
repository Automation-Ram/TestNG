package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsProg {
	@BeforeSuite
	public void suiteb() {
		System.out.println("suiteb");
	}

	@BeforeTest
	public void testb() {
		System.out.println("testb");
	}

	@BeforeClass
	public void classb() {
		System.out.println("classb");
	}

	@BeforeMethod
	public void methodb() {
		System.out.println("methodb");
	}

	@Test(priority = 3, groups = "TEST")
	public void test() {
		System.out.println("test");
		
	}

	@Test(priority = 1, groups = "Test2")
	public void test2() {
		System.out.println("test2");
	}

	@Test(priority = 2, groups = "Test3")
	public void test3() {
		System.out.println("test3");
	}

	@AfterMethod
	public void methoda() {
		System.out.println("methoda");
	}

	@AfterClass
	public void classa() {
		System.out.println("classa");
	}

	@AfterTest
	public void testa() {
		System.out.println("testa");
	}

	@AfterSuite
	public void suitea() {
		System.out.println("suitea");
	}

}
