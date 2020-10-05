/* RandomCircle.java
 * This program creates 10 circle on canvas, with random size between radius 5 -10
 * and also fill color in circles with random color selection
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class RandomCircle extends GraphicsProgram{

	// this are given values fro number of circle and radius of circle
	private static final int NUM_CIR = 10;
	private static final double RAD_MIN = 5;
	private static final double RAD_MAX = 50;

	// main method, when it runs for loop creates circle until reaches the final NUM_CIR
	//	radius will be randomly selected between maximum and minimum value
	//x and y co-ordinants also randomly generated for circle to be on canvas

	public void run() {
		for (int i = 0; i < NUM_CIR; i++) {
			//int radius = rgen.nextInt(5,50);	
			double radius = rgen.nextDouble(RAD_MIN, RAD_MAX);
			//double xCo = rgen.nextDouble(0,getWidth() / 1 );
			//double yCo = rgen.nextDouble(0,getHeight() / 1 );
			double xCo = rgen.nextDouble(0,getWidth() - 2 * radius );
			double yCo = rgen.nextDouble(0,getHeight() - 2 * radius );

			//Circle = new GOval(xCo, yCo, radius , radius);
			Circle = new GOval(xCo, yCo, 2 * radius , 2 * radius);

			// this will fill the rendom color in circle using random generator variable
			Circle.setFilled(true);
			Circle.setColor(rgen.nextColor());
			add(Circle);
		}
	}
	// instance variables
	private GOval Circle;
	private RandomGenerator rgen = RandomGenerator.getInstance();

}
