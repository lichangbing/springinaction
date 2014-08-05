package com.springinaction.chapter01.knight;

public class KnightOfTheRoundTable implements Knight {

	private String name;
	private Quest quest;

	public KnightOfTheRoundTable(String name) {
		this.name = name;
		this.quest = new HolyGrailQuest();
	}

	public Object embarkOnQuest(){
		return quest.embark();
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
