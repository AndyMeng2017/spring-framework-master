package org.springframework.beans.factory.testxml.beanfactory.set;

/**
 * @Author: mhn
 * @Date: 2020/5/9 11:31
 * @Version 1.0
 * @Software: IntelliJ IDEA
 */
public class TestC {
	private TestA testA;

	public void c(){
		testA.a();
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}
}
