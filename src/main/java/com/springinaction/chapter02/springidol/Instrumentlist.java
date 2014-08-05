package com.springinaction.chapter02.springidol;

import com.springinaction.chapter03.springidol.Audience;

public class Instrumentlist implements Performer{

	private String song;
	private Instrument instrument;
	private Audience audience;
	
	public Instrumentlist(){}
	
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		audience.takeSeats();
		audience.turnOffCellPhones();
		
		try{
			System.out.println("Playing " + song + " : ");
			instrument.play();
			
			audience.apploud();
		}catch(Throwable e){
			audience.demandRefund();
		}
		
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void setAudience(Audience audience) {
		this.audience = audience;
	}
	
}
