package excercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
	
		double gpa;
	
		 Scanner input = new Scanner(System.in);
		 System.out.print("Please insert your GPA >> ");
		 gpa = input.nextDouble();
		 afterMultiplier(gpa);
		 
		 
	}
	public static void afterMultiplier(double gpa) {
		double timesTen;
		timesTen = (gpa * 10);
		System.out.println("With a GPA of " + gpa + ", you've earned $" + timesTen + ".");
	}
	 
}
