/*
 * File: Hailstone.java
 * --------------------
 * This program is a stub for the Hailstone problem, which computes
 * Hailstone sequence described in Assignment #2.
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
				println(n + "is even, so I take half = " + half);
				n = half;
			} else {
				int threeNPlusOne = makeThreeNPlusOne(n);
				println(n + "is odd, so I make 3n + 1 = " + threeNPlusOne);
				n = threeNPlusOne;
			}
			counter ++;
		}
		println("The process took" + counter + "steps to reach 1.");
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
