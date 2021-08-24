package com.bridgelabz.junit_testing;
import java.util.Scanner;

public class Binary {
	
	static int swapNibbles(int number)
	{
	    return ((number & 0x0F) << 4 | (number & 0xF0) >> 4);
	}
	
	static void isPowerOf2(int resultent) {
		if(resultent == 0) {
			System.out.println("IT is a power of 2");
		}
		int num = 1;
		while(num <= resultent) {
			num *= 2;
			if(num == resultent) {
				System.out.println("It is a power of 2");
				return;
			}
		}
		System.out.println("it is not a power of 2");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int resultent = swapNibbles(number);
		System.out.println("After swapping nibbles we get : "+ resultent);
		isPowerOf2(resultent);
	}

}
