package com.cosmo.everton.app;

//import java.security.SecureRandom;
import java.util.Random;

public class RollDie {
	// Rola dado de seis lados 6.000.000 vezes usando switch case 
	public static void main(String[] args) {
//		SecureRandom randomNumbers = new SecureRandom();
		Random randomNumbers = new Random(); // Questão de desempenho
		
		int f1 = 0 ;
		int f2 = 0 ;
		int f3 = 0 ;
		int f4 = 0 ;
		int f5 = 0 ;
		int f6 = 0 ;
		
		
		for(int roll = 1; roll <=6000000;roll++) {
			int face = 1 + randomNumbers.nextInt(6);
			
			
			switch (face) {
			case 1:
				++f1;
				break;
			case 2:
				++f2;
				break;
			case 3:
				++f3;
				break;
			case 4: 
				++f4;
				break;
			case 5: 
				++f5;
				break;
			case 6:
				++f6;
				break;
				
			}
		}

		System.out.println("Face \t Frequency");
		System.out.printf("1\t %d%n2\t %d%n3\t %d%n4\t %d%n5\t %d%n6\t %d%n",f1,f2,f3,f4,f5,f6);
	}

}
