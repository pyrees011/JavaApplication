package demo;

import java.util.Scanner;

public class ReverseNum {
	
	private int num;
	public void reverseNum() {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num = reader.nextInt();
		int rev=0, temp = num, rem=0;
		
		while(temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		
//		for(; temp > 0; temp/=10) {
//			rem = temp % 10;
//			rev = rev * 10 + rem;
//		}
		
		
		System.out.println("reversed number: " + rev);
		
	}
}
