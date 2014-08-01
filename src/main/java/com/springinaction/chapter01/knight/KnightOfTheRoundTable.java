package com.springinaction.chapter01.knight;

public class KnightOfTheRoundTable implements Knight {
	private String name;
	private Quest quest;
	private Minstrel minstrel;

	public KnightOfTheRoundTable(String name) {
		this.name = name;
		this.quest = new HolyGrailQuest();
	}

	public Object embarkOnQuest() throws QuestFailedException {
		this.minstrel.singBefore(this);
		Object obj = quest.embark();
		this.minstrel.singBefore(this);
		return obj;
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public void setMinstrel(Minstrel minstrel) {
		this.minstrel = minstrel;
	}

	public String getName() {
		return this.name;
	}
}
