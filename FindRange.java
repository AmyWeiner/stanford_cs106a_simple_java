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
		while (true) {
			int x = readInt("? ");
			int y = readInt("? ");
			int min = Math.min(x,y);
			int max = Math.max(x, y);
		}
	}
	
	private static final int SENTINEL = 0;

}
