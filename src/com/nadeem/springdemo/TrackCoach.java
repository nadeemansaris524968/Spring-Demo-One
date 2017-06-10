package com.nadeem.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		
		return "Spend an hour everyday on the track";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it! - TrackCoach. "+fortuneService.getFortune();
	}

}
