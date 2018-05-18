package com.cosmo.everton.app;

import java.security.SecureRandom;

public class Craps {
	// A classe Craps simula o jogo de dados craps.

		private static final SecureRandom randomNumbers = new SecureRandom();
		
		// estado do jogo
		private enum Status{
			CONTINUE,WON,LOST
		};
		private static final int SNAKE_EYES = 2;
		private static final int TREY = 3;
		private static final int SEVEN = 7;
		private static final int YO_LEVEN = 11;
		private static final int BOX_CARDS = 12;
		
		public static void main(String[] args) {
			int myPoints = 0;
			Status gameStatus;
			int sumOfDice = RollDice();
			
			switch(sumOfDice) {
			
				case SEVEN:
				case YO_LEVEN:
					gameStatus = Status.WON;
					break;
					
				case SNAKE_EYES:
				case TREY:
				case BOX_CARDS:
					gameStatus = Status.LOST;
					break;
					
				default:
					gameStatus = Status.CONTINUE;
					myPoints = sumOfDice;
					System.out.printf("Pontuação é %d%n",myPoints);
					break;
			}
			while(gameStatus == Status.CONTINUE) {
				sumOfDice = RollDice();
				
				if(sumOfDice == myPoints) {
					gameStatus = Status.WON;
				}else if(sumOfDice == SEVEN){
					gameStatus =Status.LOST;
				}
				
				if(gameStatus == Status.WON) {
					System.out.println("Player Wins");
				}else {
					System.out.println("Player Loses");
				}
			}
		}

		private static int RollDice() {
			int die1 = 1+randomNumbers.nextInt(6);
			int die2 = 1 + randomNumbers.nextInt(6);
			int sum = die1+die2;
			
			System.out.printf("Player rolled %d + %d  = %d%n ",die1,die2,sum);
			return sum;
		}
}
	