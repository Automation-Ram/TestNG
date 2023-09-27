package com.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustList.class)
public class TestNGList extends Base {

	@BeforeMethod
	public void setup() {
		init();
	}

	@Test
	public void test1() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void test3() {
		Assert.assertEquals(true, false);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
