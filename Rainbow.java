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
		double cy = getHeight() / 2 + 320;
		double r1 = 540;
		double r2 = 500;
		add(createFilledCircle(cx, cy, r1, r2, Color.RED));
	}

	private void drawOrangeStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 520;
		double r2 = 500;
		add(createFilledCircle(cx, cy, r1, r2, Color.ORANGE ));
	}

	private void drawYellowStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 500;
		double r2 = 500;
		add(createFilledCircle(cx, cy, r1, r2, Color.YELLOW));
	}

	private void drawGreenStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 480;
		double r2 = 500;
		add(createFilledCircle(cx, cy, r1, r2, Color.GREEN));
	}

	private void drawBlueStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 460;
		double r2 = 500;
		add(createFilledCircle(cx, cy, r1, r2, Color.BLUE));
	}

	private void drawMagentaStripe() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 440;
		double r2 = 500;
		add(createFilledCircle(cx, cy, r1, r2, Color.MAGENTA));
	}

	private void drawWhiteSpace() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 420;
		double r2 = 500;
		add(createFilledCircle(cx, cy, r1, r2, Color.WHITE));
	}

	private GOval createFilledCircle(double x, double y, double r1, double r2, Color color) {
		GOval circle = new GOval(x - r1, y - r2, 2 * r1, 2 * r2);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
}
