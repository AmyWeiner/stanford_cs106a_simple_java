/*
 * File: Pyramid.java
 * ------------------
 * This program is a stub for the Pyramid problem, which draws
 * a brick pyramid.
 */

import acm.program.*;
import acm.graphics.*;

public class Pyramid extends GraphicsProgram {
	
	private static final double BRICK_WIDTH = 30;
	private static final double BRICK_HEIGHT = 12;
	private static final double BRICKS_IN_BASE =12;

	public void run() {
		for (int i = 1; i < BRICKS_IN_BASE; i++){
		double x = i * ((getWidth() - BRICK_WIDTH) / 2);
		double y = getHeight() - BRICK_HEIGHT;
		GRect brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);
		}
	}

}
