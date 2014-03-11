package Solved;

public class Problem019 {

	public static void main(String[] args) {
		// SOLVED
		
		/*
		 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
		 */
		
		int sundays = 0;
		int dayOfWeek = 1; //Monday
		int[] monthDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		dayOfWeek = 365+dayOfWeek % 7;
		
		for (int year = 1901; year <= 2000; year++) {
			for (int month = 1; month <= 12; month++) {
				if (dayOfWeek == 0) {
					sundays++;
				}
				
				
				dayOfWeek += monthDays[month];
				if (year % 4 == 0 && month==2) {
					dayOfWeek++;
				}
				dayOfWeek = dayOfWeek%7;
			}
		}
		
		
		System.out.println("The answer is: " + sundays);
	}

}
