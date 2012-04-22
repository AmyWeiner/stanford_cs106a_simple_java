/*
 * File: Quadratic.java
 * ---------------------------------------------------------
 * This program calculates the two solution to the quadratic
 * formula, upon given the three coefficients a, b, and, c 
 * by the user. If the three given coefficients result in an
 * equation with no real solution, a message to this effect
 * appears on the screen.
 */

import acm.program.*;

public class Quadratic extends ConsoleProgram {

	public void run() {
		println("Enter coefficients for the quadratic equation: ");		//prompts the user to enter coefficients
		double a = readDouble("a: ");
		double b = readDouble("b: ");
		double c = readDouble("c: ");
		double radicand = (b * b) - (4 * a * c);						//calculates radicand
		if (radicand < 0) {												//determines whether or not radicand is negative
			println("The equation has no real solutions.");				//informs user equation has no real solutions
		} else {
			double x1 = calculateSolutionOne(b, radicand, a);				//calculates the first solution
			double x2 = calculateSolutionTwo(b, radicand, a);				//calculates the second solution
			println("The first solution is: " + x1);
			println("The second solution is: " + x2);
		}
	}

	/*
	 * The method calculateSolutionOne calculates the first solution to the quadratic equation, which is a result
	 * of adding the evaluated square root term to the opposite of term b, and then dividing by 
	 * the term a multiplied by 2.
	 */
	private double calculateSolutionOne(double x, double y, double z) {
		return (-x + Math.sqrt(y)) / (2 * z);
	}

	/*
	 * The method calculateSolutionTwo calculates the second solution to the quadratic equation, which is a result
	 * of subtracting the evaluated square root term from the opposite of term b, and then dividing by 
	 * the term a multiplied by 2.
	 */
	private double calculateSolutionTwo(double x, double y, double z) {
		return (-x - Math.sqrt(y)) / (2 * z);
	}
}

