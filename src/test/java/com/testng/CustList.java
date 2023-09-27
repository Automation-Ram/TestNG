package com.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustList extends Base implements ITestListener {

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test");
		fail(result.getMethod().getMethodName());
	}
}
