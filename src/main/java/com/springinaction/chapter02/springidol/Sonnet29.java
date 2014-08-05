package com.springinaction.chapter02.springidol;

public class Sonnet29 implements Poem {

	private static String[] LINES = {
		"1","2","3","4","5"
	};
	
	public Sonnet29(){}
	
	public void recite() {
		// TODO Auto-generated method stub
		for(int i = 0; i < LINES.length; i++){
			System.out.println(LINES[i]);
		}
	}

}
