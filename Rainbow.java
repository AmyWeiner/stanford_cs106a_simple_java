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
		double cx = getWidth() / 2;
		double cy = getHeight() / 2 + OFFSET_FROM_CENTER;
		double r = 560;
		paintUpperSky();
		drawRainbow(cx, cy, r);
		paintLowerSky(cx, cy, r);
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
	private void drawRainbow(double x, double y, double r) {
		drawRedBand(x, y, r);
		drawOrangeBand(x, y, r);
		drawYellowBand(x, y, r);
		drawGreenBand(x, y, r);
		drawBlueBand(x, y, r);
		drawMagentaBand(x, y, r);
	}

	/*
	 * The method drawRedBand draws the red band of the rainbow.
	 */
	private void drawRedBand(double x, double y, double r) {
		add(createFilledCircle(x, y, r, Color.RED));
	}
	
	/*
	 * The method drawOrangeBand draws the orange band of the rainbow.
	 */
	private void drawOrangeBand(double x, double y, double r) {
		double r2 = r -BAND_WIDTH;
		add(createFilledCircle(x, y, r2, Color.ORANGE ));
	}

	/*
	 * The method drawYellowBand draws the yellow band of the rainbow.
	 */
	private void drawYellowBand(double x, double y, double r) {
		double r2 = r - ( 2 * BAND_WIDTH);
		add(createFilledCircle(x, y, r2, Color.YELLOW));
	}

	/*
	 * The method drawGreenBand draws the green band of the rainbow.
	 */
	private void drawGreenBand(double x, double y, double r) {
		double r2 = r - (3 * BAND_WIDTH);
		add(createFilledCircle(x, y, r2, Color.GREEN));
	}

	/*
	 * The method drawBlueBand draws the blue band of the rainbow.
	 */
	private void drawBlueBand(double x, double y, double r) {
		double r2 = r - (4 * BAND_WIDTH);
		add(createFilledCircle(x, y, r2, Color.BLUE));
	}

	/*
	 * The method drawMagentaBand draws the magenta band of the rainbow.
	 */
	private void drawMagentaBand(double x, double y, double r) {
		double r2 = r - (5 * BAND_WIDTH);
		add(createFilledCircle(x, y, r2, Color.MAGENTA));
	}

	/*
	 * The method paintLowerSky paints the canvas space below the rainbow the color cyan.
	 */
	private void paintLowerSky(double x, double y, double r) {
		double r2 = r - (6 * BAND_WIDTH);
		add(createFilledCircle(x, y, r2, Color.CYAN));
	}

	/*
	 * The method createFilledCircle adds a solidly filled in GOval to the canvas, centered 
	 * at the coordinates(x, y), with a radius r, and a color color. 
	 */
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	
	/* The constants speficied for the program */
	private static final double OFFSET_FROM_CENTER = 380;
	private static final double BAND_WIDTH = 20;
}
