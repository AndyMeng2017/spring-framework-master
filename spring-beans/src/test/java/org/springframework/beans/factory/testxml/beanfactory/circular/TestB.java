package org.springframework.beans.factory.testxml.beanfactory.circular;

/**
 * @Author: mhn
 * @Date: 2020/5/9 11:31
 * @Version 1.0
 * @Software: IntelliJ IDEA
 */
public class TestB {
	private TestC testC;

	public TestB(TestC testC) {
		this.testC = testC;
	}

	public void b(){
		testC.c();
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}
}
