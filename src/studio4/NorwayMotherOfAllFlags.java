package studio4;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(22 / 6.0, 16 / 2.0, 22 / 6.0, 16 / 2.0);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(22 * (1 / 6.0 + 1 / 3.0), 16 / 2.0, 22 / 6.0, 16 / 2.0);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(22 * (1 / 6.0 + 2 / 3.0), 16 / 2.0, 22 / 6.0, 16 / 2.0);

	}

	public static void indonesia() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(22 / 2.0, 16 * (1 / 2.0 + 1 / 4.0), 22 / 2.0, 16 / 4.0);

	}

	public static void netherlands() {
		StdDraw.clear();

		StdDraw.setPenColor(127, 0, 0);
		StdDraw.filledRectangle(22 / 2.0, 16 * (1 / 6.0 + 2 / 3.0), 22 / 2.0, 16 / 6.0);

		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(22 / 2.0, 16 * (1 / 6.0), 22 / 2.0, 16 / 6.0);
	}

	public static void poland() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(22 / 2.0, 16 * (1 / 4.0), 22 / 2.0, 16 / 4.0);
	}

	public static void thailand() {
		StdDraw.clear();

		StdDraw.setPenColor(127, 0, 0);
		StdDraw.filledRectangle(22 / 2.0, 16 * (1 / 12.0 + 5 / 6.0), 22 / 2.0, 16 / 12.0);
		
		StdDraw.setPenColor(127, 0, 0);
		StdDraw.filledRectangle(22 / 2.0, 16 * (1 / 12.0), 22 / 2.0, 16 / 12.0);
		
		StdDraw.setPenColor(0, 0, 80);
		StdDraw.filledRectangle(22 / 2.0, 16 * (1 / 6.0+1/3.0), 22 / 2.0, 16 / 6.0);
	}

	public static void finland() {
		StdDraw.setPenColor(1,47,108);
		StdDraw.filledRectangle(22/2.0, 16/2.0, 22/2.0, 16/2.0);
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(3,3 , 3, 3);
		
		StdDraw.filledRectangle(3,3+10 , 3, 3);
		
		StdDraw.filledRectangle(6+ 10, 3, 6, 3);
		StdDraw.filledRectangle(6+ 10, 3+10, 6, 3);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
