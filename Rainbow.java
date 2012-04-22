/*
 * File: Rainbow.java
 * ------------------
 * This program is a stub for the Rainbow problem, which displays
 * a rainbow by adding consecutively smaller circles to the canvas.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Rainbow extends GraphicsProgram {
	
	double RAINBOW_CENTER = getWidth() / 2;
	double OFFSET = getHeight() + 200;
	double RADIUS = getWidth() / 2;
	
	public void run() {
		drawRainbow();
	}

	private void drawRainbow() {
		drawRedStripe();
		//drawOrangeStripe();
		//drawYellowStripe();
		//drawGreenStripe();
		//drawBlueStripe();
		//drawMagentaStripe();
	}
	
	private void drawRedStripe() {
		add(createFilledCircle(350, 300, 300, Color.RED));
	}
	
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x -r, y-r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
}
