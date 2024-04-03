package com.practice.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.java.models.Residents;
import com.practice.java.utils.Utilities;

@SpringBootApplication
public class JavaApplication {
	
	static int numberOfFlats;
	static String freeupDay;
	
	static DayOfWeek week = LocalDate.now().getDayOfWeek();

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
		
		numberOfFlats=Integer.parseInt(args[0]);
		freeupDay=args[1];		
		
		//numberOfFlats=9;
		//freeupDay="tuesday";	
		
		NoticeSchedule();
		
		
	}


	private static void NoticeSchedule() {
		
		//int logicalDayNumeric = getDayOfWeekAccToFlatCount(numberOfFlats);
		
		LocalDate today = LocalDate.now();
        LocalDate startDateOfMonth = today.withDayOfMonth(1);
        
        //find how many days in a month
        int daysInMonth = today.lengthOfMonth();
		
		int flatNum = getFlatNumberOfTheDay(startDateOfMonth, daysInMonth);
		
		sendMessageToFlats(flatNum);
	}

	//create spring utility for sending message
	private static void sendMessageToFlats(int flatNum) {
		Residents resDetail = new Residents();
		Utilities.sendMessage(resDetail);		
	}


	private static int getFlatNumberOfTheDay(LocalDate startDateOfMonth, int daysInMonth) {
		int flatNumber = 0;
		for (int i = 0; i < daysInMonth; i++) { // Scheduling for 20 days
            LocalDate currentDate = startDateOfMonth.plusDays(i);
            //System.out.println( "currentDate : " + currentDate );
            flatNumber = getFlatNumber(currentDate, numberOfFlats);
            System.out.println(currentDate + ": Sending message to Flat " + flatNumber);
        }
		return flatNumber;
	}
	
	 public static int getFlatNumber(LocalDate date, int totalFlats) {
	        int daysSinceStart = (int) (date.toEpochDay() - LocalDate.of(2024, 4, 1).toEpochDay());
	        return ((daysSinceStart % totalFlats) + 1);
	    }

}
