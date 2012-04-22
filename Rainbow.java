/*
 * File: Rainbow.java
 * -------------------------------------------
 * This program displays a rainbow, consisting 
 * of the colors, red, orange, yellow, green, 
 * blue, and magenta, by adding consecutively 
 * smaller circles to the canvas. The rainbow 
 * is set against a cyan background, which
 * represents the sky.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Rainbow extends GraphicsProgram {

	public void run() {
		paintUpperSky();
		drawRainbow();
		paintLowerSky();
	}

	/*
	 * The method paintUpperSky paints the canvas space above the rainbow the color cyan.
	 */
	private void paintUpperSky() {
		double x = 0;
		double y = 0;
		double skyWidth = getWidth();
		double skyHeight = getHeight();
		GRect sky = new GRect(x, y, skyWidth, skyHeight);
		sky.setColor(Color.CYAN);
		sky.setFilled(true);
		add(sky);
	}
	
	/*
	 * The method drawRainbow draws a rainbow on the canvas, consisting of the colors
	 * red, orange, yellow, green, blue, and magenta.
	 */
	private void drawRainbow() {
		drawRedBand();
		drawOrangeBand();
		drawYellowBand();
		drawGreenBand();
		drawBlueBand();
		drawMagentaBand();
	}

	/*
	 * The method drawRedBand draws the red band of the rainbow.
	 */
	private void drawRedBand() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 560;
		double r2 = 500;
		add(createFilledCircle(cx, cy, r1, r2, Color.RED));
	}
	
	/*
	 * The method drawOrangeBand draws the orange band of the rainbow.
	 */
	private void drawOrangeBand() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 540;
		double r2 = 480;
		add(createFilledCircle(cx, cy, r1, r2, Color.ORANGE ));
	}

	/*
	 * The method drawYellowBand draws the yellow band of the rainbow.
	 */
	private void drawYellowBand() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 520;
		double r2 = 460;
		add(createFilledCircle(cx, cy, r1, r2, Color.YELLOW));
	}

	/*
	 * The method drawGreenBand draws the green band of the rainbow.
	 */
	private void drawGreenBand() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 500;
		double r2 = 440;
		add(createFilledCircle(cx, cy, r1, r2, Color.GREEN));
	}

	/*
	 * The method drawBlueBand draws the blue band of the rainbow.
	 */
	private void drawBlueBand() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 480;
		double r2 = 420;
		add(createFilledCircle(cx, cy, r1, r2, Color.BLUE));
	}

	/*
	 * The method drawMagentaBand draws the magenta band of the rainbow.
	 */
	private void drawMagentaBand() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 460;
		double r2 = 400;
		add(createFilledCircle(cx, cy, r1, r2, Color.MAGENTA));
	}

	/*
	 * The method paintLowerSky paints the canvas space below the rainbow the color cyan.
	 */
	private void paintLowerSky() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + 320;
		double r1 = 440;
		double r2 = 380;
		add(createFilledCircle(cx, cy, r1, r2, Color.CYAN));
	}

	/*
	 * The method createFilledCircle adds a solidly filled in GOval to the canvas, centered 
	 * at the coordinates(x, y), with a radius r, and a color color. 
	 */
	private GOval createFilledCircle(double x, double y, double r1, double r2, Color color) {
		GOval circle = new GOval(x - r1, y - r2, 2 * r1, 2 * r2);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
}
