package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");

		boolean xGreaterThanY = ( x >= y);
		boolean yGreaterThanZ = ( y >= z);
		boolean xLessThanY = ( x <= y);
		boolean yLessThanZ = ( y <= z);

		boolean isOrdered = ( xGreaterThanY && yGreaterThanZ || xLessThanY && yLessThanZ ); // this equation compares the inputs x, y, and z as described in the variables above

		System.out.print(isOrdered);


	}

}
