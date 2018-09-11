package excercises;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double temp;
		double temp2;
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert a number of degrees in Fahrenheit at 8:00 >> ");
		temp = input.nextDouble();
		System.out.println("Please insert a number of degrees in Fahrenheit at 12:00 >> ");
		temp2 = input.nextDouble();
		FahrenheitToCelsius(temp);
		
	}
	public static void FahrenheitToCelsius(double temp) 
	{
	double celsius;
	celsius = (temp - 32) * 5/9;
	System.out.println("The temperature of " + temp + " Fahrenheit is " + celsius + " in Celsius.");
	}
}
