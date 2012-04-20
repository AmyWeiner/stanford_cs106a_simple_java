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
		println("This program computes the Hailstone sequences.");
		int counter = 0;
		int n = readInt("Enter a number: ");

		while (n > 1) {
			if (isEven(n)) {
				int half = takeHalf(n);
				println(n + " is even, so I take half = " + half);
				n = half;
			} else {
				int threeNPlusOne = makeThreeNPlusOne(n);
				println(n + " is odd, so I make 3n + 1 = " + threeNPlusOne);
				n = threeNPlusOne;
			}
			counter ++;
		}
		println("The process took " + counter + " steps to reach 1.");
	}

	private boolean isEven (int x) {
		return x % 2 == 0;
	}

	private int takeHalf (int x) {
		return x / 2;
	}

	private int makeThreeNPlusOne(int x) {
		return (3 * x) + 1;
	} 
}
