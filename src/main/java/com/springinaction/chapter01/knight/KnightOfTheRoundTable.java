package com.springinaction.chapter01.knight;

public class KnightOfTheRoundTable implements Knight{
	private String name;
	private HolyGrailQuest quest;

	public KnightOfTheRoundTable(String name) {
		this.name = name;
		this.quest = new HolyGrailQuest();
	}
	
	public Object embarkOnQuest() throws QuestFailedException{
		return quest.embark();
	}
}
