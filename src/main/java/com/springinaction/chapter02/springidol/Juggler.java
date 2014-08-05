package com.springinaction.chapter02.springidol;

public class Juggler implements Performer {

	private int beanBags = 3;
	
	public Juggler(){}
	
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}
	
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("JUGGLER " + beanBags + " BEANBAGS");
	}

}
