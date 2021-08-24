package com.bridgelabz.junit_testing;

import java.util.Scanner;

public class TemperatureConverter {
	
	private static void temperatureConversion(double temperature, int option) {
		if(option == 1) {
			double farenheit = (temperature*9/5)+32;
			System.out.println("Entered temperature in Celsius : "+ temperature);
			System.out.println("Temperature in farenheit : "+farenheit);
		}
		else {
			double celsius = (((temperature -32)*5)/9);
			System.out.println("Entered temperature in farenheit : "+ temperature);
			System.out.println("Temperature in celsius : "+celsius);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select the Converter   1 : Celsius to fahrenheit     2 : Fahrenheit to celsius");
		int option = sc.nextInt();
		
		
		switch(option) {
			case 1:
				System.out.println("Enter the temperature in celsius : ");
				double celsius = sc.nextDouble();
				temperatureConversion(celsius, option);
				break;
			case 2:
				System.out.println("Enter the temperature in farenheit : ");
				double farenheit = sc.nextDouble();
				temperatureConversion(farenheit, option);
				break;
			default :
				System.out.println("Invalid Option");
		}

	}

}
