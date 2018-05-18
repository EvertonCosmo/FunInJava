package com.cosmo.everton.app;

import java.security.SecureRandom;

public class RandomSecure {

	public static void main(String[] args) {
		// Produz números aleatórios seguros
		SecureRandom randomNumbers = new SecureRandom();
		
		
		for(int i=0; i<=20;i++) {
			int face = 1 + randomNumbers.nextInt(6); //seleciona aleatório entre 1 e 6
			System.out.printf("%d",face);
			
			
			
			if(i % 5 == 0) {
				System.out.println();
			}
		}

	}

}
