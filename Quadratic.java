/*
 * File: Quadratic.java
 * --------------------
 * This program is a stub for the Quadratic problem, which finds the
 * roots of the quadratic equation.
 */

import acm.program.*;

public class Quadratic extends ConsoleProgram {

	public void run() {
		println("Enter coefficients for the quadratic equation: ");
		double a = readDouble("a: ");
		double b = readDouble("b: ");
		double c = readDouble("c: ");
		double radicand = (b * b) - (4 * a * c);
		if (radicand < 0) {
			println("The equation has no real solutions.");
		} else {
		double x1 = calculateSolutionOne(b, radicand, a);
		double x2 = calculateSolutionTwo(b, radicand, a);
		println("The first solution is: " + x1);
		println("The second solution is: " + x2);
		}
	}

	private double calculateSolutionOne(double x, double y, double z) {
			return (-x + Math.sqrt(y)) / (2 * z);
		}

	private double calculateSolutionTwo(double x, double y, double z) {
		return (-x - Math.sqrt(y)) / (2 * z);
	}

}

