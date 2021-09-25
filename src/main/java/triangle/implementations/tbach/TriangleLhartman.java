package triangle.implementations.tbach;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleLhartman implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... input) {
		if (input == null || input.length < 3) {
			return TriangleResult.UNKNOWN;
		}
		final int a = input[0];
		final int b = input[1];
		final int c = input[2];

		if (a < 1 || b < 1 || c < 1) {
			return TriangleResult.UNKNOWN;
		}

		// Wie berechnet sich das? :D
		// es Muss für jedes seite geschaut werden welche die längste ist dann müssen
		// die anderen zei mind zusammen so groß sein wie die längste seite
		// fang ruhig mal an, ich bau den Test
		// Die Summe 2er Seiten muss größer sein als die 3.Seite

		if ((a > (b + c)) || (b > (a + c)) || (c > (a + b))) {
			return TriangleResult.UNKNOWN;
		}

		if (a == b && b == c) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		} else if (a == b || b == c || a == c) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		} else {
			return TriangleResult.TRIANGLE_NOT_EQUAL;
		}
	}
}