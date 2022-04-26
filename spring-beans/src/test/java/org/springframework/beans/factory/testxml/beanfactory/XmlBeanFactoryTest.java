package org.springframework.beans.factory.testxml.beanfactory;

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
public class XmlBeanFactoryTest {

	public static void main(String[] args) {
		// 单个bean创建
		BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/factory/BeanFactoryUtilsTests-root.xml"));
		TestBean testBean = (TestBean) xmlBeanFactory.getBean("test");
		System.out.println(testBean.getName());





		// 循环依赖bean创建
		// 参考 org.springframework.beans.factory.FactoryBeanTests 测试类
//		BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/factory/FactoryBeanTests-circular.xml"));
//		TestBean testBean = (TestBean) xmlBeanFactory.getBean("test");
//		System.out.println(testBean.getName());



	}
}
