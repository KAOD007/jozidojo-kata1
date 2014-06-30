package com.github.kevin.whitebelt2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App{
	public static void main(String[] args){

	System.out.println("Welcome to kata2. powered by Kevin	");
	LocalDateTime now = LocalDateTime.now();
	System.out.println("The time is now "+now);
	
	LocalDateTime tenMinFromNow = now.plus(10, ChronoUnit.MINUTES);
	System.out.println("Ten minutes from now it will be: "+ tenMinFromNow);

	}
}

