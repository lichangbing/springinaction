package com.springinaction.chapter01.knight;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class KnightOfTheRoundTableTest extends TestCase{

	@Test
	public void testEmbarkOnQuest() throws QuestFailedException {
		KnightOfTheRoundTable knight = new KnightOfTheRoundTable("Bedivere");
		Object grail = knight.embarkOnQuest();
		assertNotNull(grail);
		
		//assertTrue(grail.isHoly());
	}

}
