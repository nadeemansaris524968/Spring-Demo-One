package com.nadeem.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields for email and team
	private String emailAddress;
	private String team;

	public CricketCoach(){
		
		System.out.println("CricketCoach: inside no-arg constructor.");
	}
	
	// Our setter method used for Setter Injection
	public void setFortuneService(FortuneService theFortuneService) {

		System.out.println("CricketCoach: inside setter method - setFortuneService.");
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes a day.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress.");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam.");
		this.team = team;
	}

}
