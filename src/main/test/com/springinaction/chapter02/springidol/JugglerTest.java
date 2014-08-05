package com.springinaction.chapter02.springidol;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.chapter01.hello.GreetingServiceImpl;

import junit.framework.TestCase;

public class JugglerTest extends TestCase {
	@Test
	public void testPerform() throws PerformanceException {

		BeanFactory factory = new ClassPathXmlApplicationContext(
				"applicationContextChapter02.xml");
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
//				"target\\classes\\applicationContextChapter01.xml"));
		Juggler juggler = (Juggler) factory
				.getBean("duke02");
		juggler.perform();
		
	}
}
