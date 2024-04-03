package com.practice.java.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import com.practice.java.models.Residents;

public class Utilities {
	
	static int numberOfDaysInWeek = 7;
	
	public static Map<Integer, Integer> generateFreeupSchedule(int numberOfFlats, String freeupDay) {
		
		Map<Integer, Integer> scheduleMap = new HashMap<Integer, Integer>();

		//if count of flats > 7
		if(numberOfFlats > numberOfDaysInWeek) {
			scheduleMap = ScheduleFlatsCountOverThanWeek(scheduleMap, numberOfFlats);			
		}
		//if count of flats <= 7
		else {
			scheduleMap = ScheduleFlatsCountLessThanWeek(scheduleMap, numberOfFlats);	
		}
		return new HashMap<Integer, Integer>();
	}

	private static Map<Integer, Integer> ScheduleFlatsCountLessThanWeek(Map<Integer, Integer> scheduleMap, int numberOfFlats) {

		IntStream.rangeClosed(1, numberOfDaysInWeek).forEach(i-> {	
			if(i <= numberOfFlats) {
				scheduleMap.put(i, i);
			}
			else {
				scheduleMap.put(i, i- numberOfFlats);
			}
		});
		return scheduleMap;
	}

	private static Map<Integer, Integer> ScheduleFlatsCountOverThanWeek(Map<Integer, Integer> scheduleMap, int numberOfFlats) {

		IntStream.rangeClosed(1, numberOfFlats).forEach(i-> {
			int dayNumeric = (i <= numberOfDaysInWeek) ? i : i - numberOfDaysInWeek;
			if(i <= numberOfDaysInWeek) {
				scheduleMap.put(dayNumeric, i);
			}
			else {
				scheduleMap.put(dayNumeric, i);
			}
			
		});
		return scheduleMap;
	}

	private static Map<Integer, Integer> ScheduleFlatsEqualsAcrossWeek(Map<Integer, Integer> scheduleMap, int numberOfFlats) {
		IntStream.rangeClosed(1, numberOfFlats).forEach(i-> {
			scheduleMap.put(i, i);
		});
		return scheduleMap;
	}

	public static void sendMessage(Residents resDetail) {
		System.out.println("Flat details: " + resDetail.toString());
		
	}

}
