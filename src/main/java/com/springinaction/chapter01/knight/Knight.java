package com.springinaction.chapter01.knight;

public interface Knight {
	String getName();
	Object embarkOnQuest() throws QuestFailedException;
}
