package demo;

import java.util.Scanner;

public class Daychecker {

	private int day;
	public void daychecker() {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number for the day: ");
		
		int day = reader.nextInt();
		
		switch(day) {
			case 1:
				System.out.println("Monday (Worst day actually)");
				break;
			case 2:
				System.out.println("Tuesday (How many tuesdays you know? As a friend)");
				break;
			case 3:
				System.out.println("Wednesday (In the working mood)");
				break;
			case 4:
				System.out.println("Thursday (Out of working mood waiting for weekend)");
				break;
			case 5:
				System.out.println("Friday (can't wait to get through)");
				break;
			case 6:
				System.out.println("Saturday (Yes!!! we made it saturday night)");
				break;
			case 7:
				System.out.println("Sunday (FUCK its sunday best day and worst night)");
				break;
		}
		
	}
}
