package excercises;

import java.util.Scanner;

public class TestLbls {

	public static void main(String[] args) {
		 double pounds;
		Scanner input = new Scanner(System.in);
		System.out.println("How many pounds do you weigh >> ");
		pounds = input.nextDouble();
		System.out.println("At " + pounds + " pounds, you weigh:");
		poundsToKilograms(pounds);
		poundsToOunces(pounds);
		poundsToMilligrams(pounds);
		
		
	}
	public static void poundsToKilograms(double pounds) {
		double poundsToKilograms;
		
		poundsToKilograms = (pounds * .453592);
		System.out.println(poundsToKilograms + " kilograms");

	}
	public static void poundsToOunces(double pounds) {
		double poundsToOunces;
		
		poundsToOunces = (pounds * 16);
		System.out.println(poundsToOunces + " ounces");

	}
	public static void poundsToMilligrams(double pounds) {
		double poundsToMilligrams;
		
		poundsToMilligrams = (pounds * 453592);
		System.out.println(poundsToMilligrams + " milligrams");

	}

}
