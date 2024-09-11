package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter the start amount:");
		int startAmount = in.nextInt();

		System.out.println("Please enter the win chance:"); 
		double winChance = in.nextDouble(); 

		System.out.println("Please enter the win amount:");
		int winLimit = in.nextInt();
		
		System.out.println("Please enter the number of days you will simulate:"); 
		int daysSimulate = in.nextInt();

		double chanceofWinning = Math.random (); 

		int value = startAmount; 

		
			
		for (int i = 0; i < daysSimulate; i++) {
			while (winLimit > value && value>0) {//while loops go indefinitely and for loops go to a certain amount 
				if (chanceofWinning < winChance) {
					value +=1;
					System.out.print("Win");
				}
				else {
					System.out.print("Lose");
					value -=1; 

				}
				
			}
		}


	}

}
