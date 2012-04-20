/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.program.*;

public class GraphicsHierarchy extends GraphicsProgram {
	
	public void run() {
		addDiagram(getWidth() / 2, getHeight() / 2);
		double x = (getWidth() - BOX_WIDTH) / 2;
		double y = (getHeight() - BOX_HEIGHT) / 2;
		drawBox(x, y, BOX_WIDTH, BOX_HEIGHT);
	}
	
	private void addDiagram

	private static final double BOX_WIDTH = 100;
	private static final double BOX_HEIGHT = 50;
}
