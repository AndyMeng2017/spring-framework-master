package org.springframework.beans.factory.testxml.beanfactory.set;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: mhn
 * @Date: 2020/5/9 11:31
 * @Version 1.0
 * @Software: IntelliJ IDEA
 */
public class TestA {

	private TestB testB;

	public void a(){
		testB.b();
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}
}
