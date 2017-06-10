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

	// add an init method
	public void doMyStartUpStuff(){
		System.out.println("TrackCoach: inside method doMyStartUpSuff.");
	}
	
	// add a destroy method
	public void doMyCleanUp(){
		System.out.println("TrackCoach: inside method doMyCleanUp.");
	}
}
