package excercises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		
		int value;		
		 Scanner input = new Scanner(System.in);
		 System.out.print("Please insert a value >> ");
		 value = input.nextInt();
		 inchesToCentimeters(value);
		 gallonsToLiters(value);
	}
	public static void inchesToCentimeters(int value) {
		double iToC;
		iToC = value * 2.54;
		System.out.println("There are " + iToC + " centimeters in " + value + " inches.");
	}
	public static void gallonsToLiters(int value) {
		double gToL;
		gToL = value * 3.7854;
		System.out.println("There are " + gToL + " liters in " + value + " gallons.");
	}
}
