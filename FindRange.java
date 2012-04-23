/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

	public void run() {
		println("This program finds the smallest and largest integers in a list.");
		println("Enter values, one per line, using a 0 to signal the end of the list.");

		int x = readInt("? ");
		if (x == SENTINEL) {
			println("The Sentinel number was enetered on the first input line. Therefore, no values have been entered.");
		} else {
			int y = readInt("? ");
			if (y == SENTINEL) {
				y = x;
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

	private static final int SENTINEL = 0;

}

