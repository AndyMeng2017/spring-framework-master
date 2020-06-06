package org.springframework.beans.factory.testxml.beanfactory.circular;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.tests.sample.beans.TestBean;

/**
 * @Author: mhn
 * @Date: 2019/10/12 12:00
 * @Version 1.0
 * @Software: IntelliJ IDEA
 */
public class BeanFactoryTest {

	public static void main(String[] args) {
		try {
			BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/factory/TestABCcircular.xml"));
			TestA testBean = (TestA) xmlBeanFactory.getBean("testA");
			System.out.println(testBean.getClass().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
