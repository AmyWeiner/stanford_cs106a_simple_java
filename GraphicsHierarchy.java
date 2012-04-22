/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.program.*;
import acm.graphics.*;

public class GraphicsHierarchy extends GraphicsProgram {
	
	public void run() {
		addDiagram();
	}
	
	private void addDiagram() {
		double rx1 = getWidth() / 2;
		double ry1 = (getHeight() / 2) - OFFSET_FROM_CENTER;
		double w = BOX_WIDTH;
		double h = BOX_HEIGHT;
		double rx2 = getWidth() / 4;
		double ry2 = (getHeight() / 2) + OFFSET_FROM_CENTER;
		String gObject = "GObject";
		String gLabel = "GLabel";
		add(createLabeledBox(rx1, ry1, w, h, gObject));
		add(createLabeledBox(rx2, ry2, w, h, gLabel));
		//drawGLineBox();
		//drawGOvalBox();
		//drawGRectBox();
		}
	
	private GRect createLabeledBox(double x, double y, double w, double h, String str) {
		GRect rect = new GRect(x - (BOX_WIDTH / 2), y - (BOX_HEIGHT / 2), w, h);
		GLabel label = new GLabel(str, x, y);
		double lx = x - (label.getWidth() / 2);
		double ly = y + ((label.getAscent() + label.getDescent()) / 2);
		label.setLocation(lx, ly);
		add(label);
		return rect;
	}
	

	private static final double BOX_WIDTH = 100;
	private static final double BOX_HEIGHT = 50;
	private static final double OFFSET_FROM_CENTER = 100;
}
