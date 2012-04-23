/*
 * File: FindRange.java
 * ----------------------------------------
 * This program reads in a list of integers, 
 * one per line, until the user enters the
 * sentinel value of zero, at which point
 * the program displays the largest and
 * smallest values entered on the screen.
 * if the sentinel value is entered as the
 * first value, an error message appears.
 * If the sentinel value is entered as the
 * second value, the first value is displayed
 * as both the smallest and largest values. 
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

	public void run() {
		println("This program finds the smallest and largest integers in a list.");				//program intro
		println("Enter values, one per line, using a 0 to signal the end of the list.");		//prompts the user to enter values

		int x = readInt("? ");
		if (x == SENTINEL) {
			println("The Sentinel number was enetered on the first input line. Therefore, no values have been entered.");		//error mesage
		} else {
			int y = readInt("? ");
			if (y == SENTINEL) {
				y = x;													//sets the first value entererd as the largest
				println("The smallest value is " + x);
				println("The largest value is " + y);
			}else {
				int min = Math.min(x, y);
				int max = Math.max(x, y);
				while (true) {
					int n = readInt("? ");
					if (n == SENTINEL) break;
					min = Math.min(n, min);
					max = Math.max(n, max);
				}
				
				println("The smallest value is " + min);
				println("The largest value is " + max);
			}	
		}
	}

	/* Sets the value of zero as the sentinel value*/
	private static final int SENTINEL = 0;

}

