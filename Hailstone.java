/*
 * File: Hailstone.java
 * --------------------------------------------------
 * This program displays the Hailstone sequence of an 
 * integer, as outlined in Douglas Hofstadter's book 
 * Godel, Escher, Bach, upon reading in an integer from 
 * the user. Additionally, at the end of the sequence, 
 * the program displays the number of steps taken in
 * order to reach 1.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {

	public void run() {
		println("This program computes the Hailstone sequences.");					//prompts the user for input
		int counter = 0;
		int n = readInt("Enter a number: ");

		while (n > 1) {
			if (isEven(n)) {														//determines whether or not n is even
				int half = takeHalf(n);												//takes half of n
				println(n + " is even, so I take half = " + half);					//displays sequence for even n
				n = half;
			} else {
				int threeNPlusOne = makeThreeNPlusOne(n);							//makes 3n + 1
				println(n + " is odd, so I make 3n + 1 = " + threeNPlusOne);		//displays sequence for odd n
				n = threeNPlusOne;
			}
			counter ++;																//counts the number of steps to reach 1
		}
		println("The process took " + counter + " steps to reach 1.");
	}

	/**
	 * This method determines whether or not an integer is even by testing whether or not the
	 * remainder is equal to zero when the integer is divided by two.
	 * @param x This represents the integer
	 * @return This method returns a boolean, which is true if the integer is even, and false otherwise.
	 */
	private boolean isEven (int x) {
		return x % 2 == 0;
	}

	/**
	 * This method takes in an integer and divides it by two.
	 * @param x This represents the integer to be divided in half
	 * @return This method returns an integer that is half of the original integer
	 */
	private int takeHalf (int x) {
		return x / 2;
	}

	/**
	 * This method takes in an integer and multiplies it by three, and then adds one to it.
	 * @param x This represents the integer to be evaluated
	 * @return This method returns an integer that is three times plus one more than the original value
	 */
	private int makeThreeNPlusOne(int x) {
		return (3 * x) + 1;
	} 
}
