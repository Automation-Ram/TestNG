package com.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;

public class MyTransaforms implements IAnnotationTransformer {

	public void transforms(ITestAnnotation annotations, Class testClass, Constructor testCons, Method testMethod) {
		annotations.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
