package com.nadeem.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Make sure to practice your butterfly stroke!";
	}

	@Override
	public String getDailyFortune() {
		
		System.out.println("SwimCoach - inside getDailyFortune.");
		return fortuneService.getFortune();
	}

}
