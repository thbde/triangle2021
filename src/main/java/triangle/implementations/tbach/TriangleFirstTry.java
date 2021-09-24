package triangle.implementations.tbach;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleFirstTry implements Triangle {

	/** This implementation is a first try for the triangle problem and may lack some functionality */
	@Override
	public TriangleResult getTriangleResultForLengths(final int... lengths) {
		if (lengths == null) {
			return TriangleResult.UNKNOWN;
		}
		final int a = lengths[0];
		final int b = lengths[1];
		final int c = lengths[2];
		if (a == b && b == c) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}
		if (a == b) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
		if (b == c) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
