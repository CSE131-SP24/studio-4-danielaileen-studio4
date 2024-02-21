package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0,20);
		StdDraw.setYscale(0,20);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledSquare(10,10,10);
		
		StdDraw.setPenColor(StdDraw.RED);
		double[] xs = {2.5,17.5,2.5};
		double[] ys = {2.5,2.5,17.5};
		StdDraw.filledPolygon(xs , ys);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		double[] xs1 = {2.5,17.5,17.5};
		double[] ys1 = {17.5,17.5,2.5};
		StdDraw.filledPolygon(xs1, ys1);
		
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(10, 10, 5);
	}
}