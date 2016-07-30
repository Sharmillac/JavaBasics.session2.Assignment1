package assignment2;

import java.util.Scanner;

public class cAssignment1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int lAge = 0;

		System.out.println("Please enter your age.");
		lAge = scan.nextInt();
		

		
		if(lAge >= 18)
		{
			System.out.println("You are eligible to Vote");
		}
		else
		{
			System.out.println("You are not eligible to Vote");
		}
	}


}
