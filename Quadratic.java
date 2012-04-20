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
		double x1 = calculateSolutionOne(a, b, c);
		//double x2 = calculateSolutionTwo();
		println("The first solution is: " + x1);
	}

	private double calculateSolutionOne(double a, double b, double c) {
		double x = (b * b) - (4 * a * c);
		return (-b + Math.sqrt(x)) / (2 * a);
	}
}

