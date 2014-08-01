package com.springinaction.chapter01.knight;

public class KnightOfTheRoundTable implements Knight {
	private String name;
	private Quest quest;

	public KnightOfTheRoundTable(String name) {
		this.name = name;
		this.quest = new HolyGrailQuest();
	}

	public Object embarkOnQuest() throws QuestFailedException {
		Object obj = quest.embark();
		return obj;
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public String getName() {
		return this.name;
	}
}
