package com.nadeem.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from the context
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// You can also do this
//		CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		context.close();
	}

}
