package com.cosmo.everton.app;

import java.util.Scanner;

public class MaximumFinder {

	private static Scanner input;

	public static void main(String[] args) {
			input = new Scanner(System.in);
			
			System.out.println("entre com três valores float separados por espaços");
			double number1 = input.nextDouble();
			double number2 = input.nextDouble();
			double number3 = input.nextDouble();
			
			double result = maximum(number1,number2,number3);
			
			System.out.println("Maximum is: "+result);
			
			
			

	}
	
	public static double maximum(double x, double y, double z) {
		double maximumValue = x;
		
		if(y > maximumValue)
			maximumValue = y;
		if(z > maximumValue)
			maximumValue = z;
		
		return maximumValue;
	}
	

}
