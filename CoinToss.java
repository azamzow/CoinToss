/**
 @Title: CoinToss
 @Purpose: To learn how to instantiate a class and use its methods.
 @Author: Zamzow, Avery
 @Date: 3/10/15
 @Version: 1.0
 */

import java.util.Scanner;
import java.util.Random;

public class CoinToss {
	public static void main(String[] args){
		Coin coin = new Coin();
		
		//string userInput
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your guess 4 times..... Enter Heads or Tails to work");
		
		int correct = 0, incorrect = 0;
		String userInput;
		for(int i = 1; i <= 4; i++){
			coin.toss();
			System.out.println("Whats your guess, heads or tails?");
			userInput = sc.nextLine();
		
			if ((coin.getSideUp()).equalsIgnoreCase(userInput))
				correct++;
			else
				incorrect++;
		}//end of for statement
		System.out.println(correct + " times you guessed it correctly.");
		System.out.println(incorrect + " times you guessed it incorrectly.");
	}//end of main method
}// end of class header
