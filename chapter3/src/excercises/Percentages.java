package excercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		double x;
		double y;
		
		System.out.println("Please insert an x value >> ");
		x = input.nextDouble();
		System.out.println("Please insert a y value >> ");
		y = input.nextDouble();
		
		computePercent(x, y);
	}
	public static void computePercent(double x, double y) {
		double compute;
		
		compute = (x / y) * 100;
		System.out.println(x + " divided by " + y + " = " + compute + "%");
	}
}
