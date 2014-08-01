package com.springinaction.chapter01.knight;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.springinaction.chapter01.hello.GreetingServiceImpl;

public class KnightOfTheRoundTableTest extends TestCase{

	@Test
	public void testEmbarkOnQuest() throws QuestFailedException {
//		KnightOfTheRoundTable knight = new KnightOfTheRoundTable("Bedivere");
//		Object grail = knight.embarkOnQuest();
//		assertNotNull(grail);
//		
//		assertTrue(grail.isHoly());
//		
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("target\\classes\\applicationContextChapter01.xml"));	
		Knight knight = (Knight) factory.getBean("knight");
		knight.embarkOnQuest();
	}

}
