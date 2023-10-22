package demo;

import java.util.Scanner;

public class Agechecker {
	
	private int age;
	public void agechecker() {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int age = reader.nextInt();
		
		if(age > 18) {
			System.out.println("ELIGIBLE");
		}
		else {
			System.out.println("NOT ELIGIBLE");
		}
		
	}
	
}
