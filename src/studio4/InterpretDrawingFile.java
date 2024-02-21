package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shareType = in.next();
		int redComponent = in.nextInt();
		int blueComponent = in.nextInt();
		int greenComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
	
		
		System.out.println(shareType+redComponent+blueComponent+greenComponent);
		Color color = new Color(redComponent, blueComponent, greenComponent);
		StdDraw.setPenColor(color);
		if(shareType.equals("rectangle")) {
			StdDraw.filledRectangle(x1, y1, halfWidth, halfHeight);
		}else if(shareType.equals("ellipse")){
			StdDraw.filledEllipse(x1, y1, halfWidth, halfHeight);
		}else {
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double[] xs = {x1,halfWidth,x3};
			double[] ys = {y1,halfHeight,y3};
			StdDraw.filledPolygon(xs, ys);
		}
	}
}
