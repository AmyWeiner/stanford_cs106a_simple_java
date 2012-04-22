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
		double rx = getWidth() / 2;
		double ry = getHeight() / 2;
		double w = BOX_WIDTH;
		double h = BOX_HEIGHT;
		String gObject = "GObject";
		add(createLabeledBox(rx, ry, w, h, gObject));
		//drawGLabelBox();
		//drawGLineBox();
		//drawGOvalBox();
		//drawGRectBox();
		}
	
	private GRect createLabeledBox(double x, double y, double w, double h, String str) {
		GRect rect = new GRect(x - (BOX_WIDTH / 2), y - (BOX_HEIGHT / 2), w, h);
		GLabel label = new GLabel(str, x, y);
		double lx = x - (label.getWidth() / 2);
		label.setLocation(lx, y);
		add(label);
		return rect;
		
	}
	

	private static final double BOX_WIDTH = 100;
	private static final double BOX_HEIGHT = 50;
	private static final double OFFSET_FROM_TOP = 20;
}
