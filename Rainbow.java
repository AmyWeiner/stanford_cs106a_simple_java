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
	
	public void run() {

		drawRainbow();
	}

	private void drawRainbow() {
		drawRedStripe();
		drawOrangeStripe();
		drawYellowStripe();
		//drawGreenStripe();
		//drawBlueStripe();
		//drawMagentaStripe();
	}

	private void drawRedStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 100;
		double r = 300;
		add(createFilledCircle(cx, cy, r, Color.RED));
	}
	
	private void drawOrangeStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		add(createFilledCircle(cx, cy, 20, Color.ORANGE ));
	}
	
	private void drawYellowStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		add(createFilledCircle(cx, cy, 20, Color.YELLOW));
	}

	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
}
