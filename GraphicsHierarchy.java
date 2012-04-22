/*
 * File: GraphicsHierarchy.java
 * -------------------------------------------------------------------
 * This program draws a partial diagram of the acm.graphics hierarchy, 
 * with the first tier of the hierarchy consisting of the GObject class, 
 * and the second tier of the hierarchy consisting of the GLabel, GRect,
 * GOval, and GLine subclasses.
 */

import acm.program.*;
import acm.graphics.*;

public class GraphicsHierarchy extends GraphicsProgram {
	
	public void run() {
		addDiagram();
	}
	
	/*
	 * The method addDiagram adds a partial diagram of the acm.graphics hierarchy to the screen. 
	 * The first tier of the hierarchy consisting of the GObject class, and the second tier of 
	 * the hierarchy consisting of the GLabel, GRect, GOval, and GLine subclasses.
	 */
	private void addDiagram() {
		double rx1 = getWidth() / 2;											
		double ry1 = (getHeight() / 2) - OFFSET_FROM_CENTER;
		double w = BOX_WIDTH;
		double h = BOX_HEIGHT;
		double rx2 = getWidth() / 8;
		double ry2 = (getHeight() / 2) + OFFSET_FROM_CENTER;
		double horizontalOffset = getWidth() / 4;								//horizontal distance between second tier boxes
		addGObjectBox(rx1, ry1, w, h);
		addGLabelBox(rx2, ry2, w, h);
		String gLine = "GLine";
		String gOval = "GOval";
		String gRect = "GRect";
		//add(createLabeledBox(rx2, ry2, w, h, gLabel));
		add(createLabeledBox(rx2 + horizontalOffset, ry2, w, h, gLine));
		add(createLabeledBox(rx2 + (2 * horizontalOffset), ry2, w, h, gOval));
		add(createLabeledBox(rx2 + (3 * horizontalOffset), ry2, w, h, gRect));
		GLine gObjectToGLabel = new GLine(rx1, ry1 + (BOX_HEIGHT / 2), rx2, ry2 - (BOX_HEIGHT / 2));
		add(gObjectToGLabel);
		GLine gObjectToGLine = new GLine(rx1, ry1 + (BOX_HEIGHT / 2), rx2 + horizontalOffset, ry2 - (BOX_HEIGHT / 2));
		add(gObjectToGLine);
		GLine gObjectToGOval = new GLine(rx1, ry1 + (BOX_HEIGHT / 2), rx2 + (2 * horizontalOffset), ry2 - (BOX_HEIGHT / 2));
		add(gObjectToGOval);
		GLine gObjectToGRect = new GLine(rx1, ry1 + (BOX_HEIGHT / 2), rx2 + (3 * horizontalOffset), ry2 - (BOX_HEIGHT / 2));
		add(gObjectToGRect);
		}
	
	private void addGObjectBox(double x, double y, double w, double h) {
		String gObject = "GObject";
		add(createLabeledBox(x, y, w, h, gObject));
	}
	
	private void addGLabelBox(double x, double y, double w, double h) {
		String gLabel = "GLabel";
		add(createLabeledBox(x, y, w, h, gLabel));
	}
	
	/*
	 * The method createLabeledBox creates a rectangular GRect object, centered at (x, y), and
	 * containing a label, centered at (x, y) as well.
	 */
	private GRect createLabeledBox(double x, double y, double w, double h, String str) {
		GRect rect = new GRect(x - (BOX_WIDTH / 2), y - (BOX_HEIGHT / 2), w, h);
		GLabel label = new GLabel(str, x, y);
		double lx = x - (label.getWidth() / 2);
		double ly = y + ((label.getAscent() + label.getDescent()) / 2);
		label.setLocation(lx, ly);
		add(label);
		return rect;
	}
	
	/* Specified constants for the program*/
	private static final double BOX_WIDTH = 100;
	private static final double BOX_HEIGHT = 50;
	private static final double OFFSET_FROM_CENTER = 100;
}
