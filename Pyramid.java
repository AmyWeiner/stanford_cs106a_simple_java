/*
 * File: Pyramid.java
 * -----------------------------------------------------------
 * This program draws a brick  pyramid, consisting of bricks 
 * arranged in horizontal rows, so that the number of bricks 
 * in each row decreases by one as you move up the pyramid,.
 */

import acm.program.*;
import acm.graphics.*;

public class Pyramid extends GraphicsProgram {
	public void run() {
		for (int i = 0; i < BRICKS_IN_BASE; i++){
			for (int j = 0; j < BRICKS_IN_BASE - i; j++) {
				double x = (getWidth() - (BRICK_WIDTH * (BRICKS_IN_BASE - i))) / 2 + (BRICK_WIDTH * j);
				double y = getHeight() - (BRICK_HEIGHT * i) -BRICK_HEIGHT;
				GRect brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
		}
	}
	
	/* The constants given as parameters for the program */
	private static final double BRICK_WIDTH = 30;
	private static final double BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE =12;

}

