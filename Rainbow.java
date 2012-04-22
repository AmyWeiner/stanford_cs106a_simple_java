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
		drawGreenStripe();
		drawBlueStripe();
		drawMagentaStripe();
		drawWhiteSpace();
	}

	private void drawRedStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 200;
		double r = 400;
		add(createFilledCircle(cx, cy, r, Color.RED));
	}

	private void drawOrangeStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 200;
		double r = 380;
		add(createFilledCircle(cx, cy, r, Color.ORANGE ));
	}

	private void drawYellowStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 200;
		double r = 360;
		add(createFilledCircle(cx, cy, r, Color.YELLOW));
	}

	private void drawGreenStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 200;
		double r = 340;
		add(createFilledCircle(cx, cy, r, Color.GREEN));
	}

	private void drawBlueStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 200;
		double r = 320;
		add(createFilledCircle(cx, cy, r, Color.BLUE));
	}

	private void drawMagentaStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 200;
		double r = 310;
		add(createFilledCircle(cx, cy, r, Color.MAGENTA));
	}

	private void drawWhiteSpace() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 200;
		double r = 300;
		add(createFilledCircle(cx, cy, r, Color.WHITE));
	}

	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
}
