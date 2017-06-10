package com.nadeem.springdemo;

public class BaseballCoach implements Coach {
	
	// Interface is used for loose coupling 
	// because the application shouldn't be hard-coded to
	// receive a specific bean from the applicationContext.xml
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
