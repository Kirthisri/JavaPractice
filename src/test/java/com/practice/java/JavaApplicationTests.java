package com.practice.java;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaApplicationTests {
	
	LocalDate currentDate = LocalDate.of(2024, 4, 9); // Assuming today is April 10, 2024
    DayOfWeek week = currentDate.getDayOfWeek();
	
	//DayOfWeek week = LocalDate.now().getDayOfWeek();
	
	int numberOfFlats = 4;

	/*
	 * @Test void contextLoads() { int todaysNumeric; if(numberOfFlats == 7) {
	 * System.out.println("type 1 " + week.getValue()); } else if (numberOfFlats >
	 * 7){ todaysNumeric = week.getValue() - (numberOfFlats- 7);
	 * System.out.println("type 2 : week num - " + week.getValue());
	 * System.out.println("type 2 " + todaysNumeric); } else { todaysNumeric =
	 * week.getValue() + (numberOfFlats); System.out.println("type 3 : week - " +
	 * week); System.out.println("type 3 : week num - " + week.getValue());
	 * System.out.println("type 3 " + todaysNumeric); } }
	 */
	
	@Test
	void FlatScheduler() {
	        int totalFlatsCase1 = 9;
	        int totalFlatsCase2 = 4;

	        LocalDate startDate = LocalDate.of(2024, 4, 1); // Start date for scheduling

	        // Case 1: 9 flats
			/*
			 * System.out.println("Case 1: 9 flats"); for (int i = 0; i < 20; i++) { //
			 * Scheduling for 20 days LocalDate currentDate = startDate.plusDays(i); int
			 * flatNumberCase1 = getFlatNumber(currentDate, totalFlatsCase1);
			 * System.out.println(currentDate + ": Sending message to Flat " +
			 * flatNumberCase1); }
			 */

	        // Case 2: 4 flats
	        System.out.println("\nCase 2: 4 flats");
	        for (int i = 0; i < 30; i++) { // Scheduling for 20 days
	            LocalDate currentDate = startDate.plusDays(i);
	            //System.out.println( "currentDate : " + currentDate );
	            int flatNumberCase2 = getFlatNumber(currentDate, totalFlatsCase2);
	            System.out.println(currentDate + ": Sending message to Flat " + flatNumberCase2);
	        }
	    }
	
	    public static int getFlatNumber(LocalDate date, int totalFlats) {
	        int daysSinceStart = (int) (date.toEpochDay() - LocalDate.of(2024, 4, 1).toEpochDay());
	       // System.out.println( "currentDate epochDate : " + date.toEpochDay() );
	      //  System.out.println( "startdate epochDate : " + LocalDate.of(2024, 4, 1).toEpochDay() );
	//System.out.println( "daysSinceStart : " + daysSinceStart );
	//System.out.println( "daysSinceStart % totalFlats : " + daysSinceStart % totalFlats );
	        return ((daysSinceStart % totalFlats) + 1);
	    }
	    
	    

}
