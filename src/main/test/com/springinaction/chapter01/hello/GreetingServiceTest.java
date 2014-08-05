package com.springinaction.chapter01.hello;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class GreetingServiceTest extends TestCase {

	@Test
	public void testSayGreeting() {

		BeanFactory factory = new ClassPathXmlApplicationContext(
				"applicationContextChapter01.xml");
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
//				"target\\classes\\applicationContextChapter01.xml"));
		GreetingServiceImpl greetingService = (GreetingServiceImpl) factory
				.getBean("greetingService");
		greetingService.sayGreeting();
		
	}

}
