// CS 0401 Summer 2024
// In-Class Exercise 1. Complete the method below so that the program
// rounds as required. See also sample output InClass1-out.txt

import java.util.*;

public class InClass1
{
	public static void main(String [] args)
	{
		Scanner inScan = new Scanner(System.in);
		System.out.println("Please enter a positive double (<= 0 to quit): ");
		double orig = inScan.nextDouble();
		while (orig > 0)
		{
			int digs = 0;
			do 
			{
				System.out.println("Enter the number of digits to round (> 0): ");
				digs = inScan.nextInt();
			}
			while (digs <= 0);
			
			double rounded = round(orig, digs);
			System.out.println();
			System.out.println("Orig: " + orig);
			System.out.println("Rounded to " + digs + " places: " + rounded);
			System.out.println();
			System.out.println("Please enter a positive double (<= 0 to quit): ");
			orig = inScan.nextDouble();
		}
	}
	
	// Return the result of num rounded to digs decimal places
	public static double round(double num, int digs) {
		for(int x = digs; x > 0; x--){
			num = num * 10;
		}
		num = (int)(num + 0.5);
		for(int x = digs; x > 0; x--){
			num = num / 10;
		}
		return num;
	}
}
