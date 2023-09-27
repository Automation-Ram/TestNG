package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionS {

	SoftAssert soft = new SoftAssert();

	@Test
	public void method() {
		System.out.println("Open browser");
		Assert.assertEquals(false, false);
		System.out.println("login");
		soft.assertEquals(false, true);
		System.out.println("click deal page");
		Assert.assertEquals(false, false);
		System.out.println("create deal");
		Assert.assertEquals(false, false);
		soft.assertAll();
	}

}
