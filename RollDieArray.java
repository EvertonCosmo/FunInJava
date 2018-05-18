package com.cosmo.everton.app;

import java.security.SecureRandom;

public class RollDieArray {
	// Rola dado de seis lados 6.000.000 vezes usando array 
	public static void main(String[] args) {
			SecureRandom randomNumbers = new SecureRandom();
			
			int[] f = new int[7];
			for(int i =0; i<=6000000;i++) {
				++f[1+randomNumbers.nextInt(6)];
				
				
			}
			System.out.printf("%s%10s%n","Face","Frequency");
			
			for(int face=1; face <f.length;face++) {
				System.out.printf("%4d%10d%n",face,f[face]);
			}
	}

}
