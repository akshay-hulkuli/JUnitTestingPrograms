package com.bridgelabz.junit_testing;
import java.util.Scanner;

public class SquareRoot {
	private static final double EPSILON = Math.pow(2.7182, -15);
	
	private static void sqrt(double c) {
		double t = c;
		while(true) {
			t = 0.5*(t + (c / t));
			if(Math.abs(t-(c/t)) < EPSILON*t) {
				break;
			}
		}
		System.out.println("SquareRoot is : "+t);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number who's root is to be found");
		double c = sc.nextDouble();
		sqrt(c);
		
	}
}
