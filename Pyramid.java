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
		for (int i = 0; i < BRICKS_IN_BASE; i++){
			for (double j = BRICKS_IN_BASE; j > 0; j--) {
				for (double k = BRICKS_IN_BASE; k > 0; k--) {
					double x = (getWidth() - (BRICK_WIDTH * k)) / 2 + (BRICK_WIDTH * i);
					double y = getHeight() - (BRICK_HEIGHT * j);
					GRect brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
					add(brick);
				}
			}
		}
	}
}
