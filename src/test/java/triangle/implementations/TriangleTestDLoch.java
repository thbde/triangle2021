package triangle.implementations;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleTestDLoch {

	public static final Triangle triangle = new TriangleDLoch();

	@Test
	public void testGetTriangleResultForLengthsUnknown1()
	{
		final int[] input = { 5, 6, 7, 8};
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

    @Test
	public void testGetTriangleResultForLengthsUnknown2()
	{
        final int[] input = { 5, 6};
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsUnknown3()
	{
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(null);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsNotEqual() {
		final int[] input = { 5, 6, 7 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsNotEqualVariables() {
		final int a = 5;
		final int b = 6;
		final int c = 7;
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(a, b, c);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsNotEqual2() {
		final int[] input = { 50, 70, 90 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsIsosceles() {
		final int[] input = { 2, 2, 3 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

    @Test
	public void testGetTriangleResultForLengthsIsosceles2() {
		final int[] input = { 20, 10, 10 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

    @Test
	public void testGetTriangleResultForLengthsIsosceles3() {
		final int[] input = { 20, 10, 20 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsEquiliteral() {
		final int[] input = { 1, 1, 1 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsEquiliteral2() {
		final int[] input = { 42, 42, 42 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

    @Test
	public void testGetTriangleResultForLengthsEquiliteralNegative() {
		final int[] input = { -42, -42, -42 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}
    @Test
	public void testGetTriangleResultForLengthsEquiliteralNegative2() {
		final int[] input = { -42, 42, 42 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

    @Test
	public void testGetTriangleResultForLengthsEquiliteralNegative3() {
		final int[] input = { 42, -42, 42 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

    @Test
	public void testGetTriangleResultForLengthsEquiliteralNegative4() {
		final int[] input = { 42, 42, -42 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

    @Test
	public void testGetTriangleResultForLengthsZero() {
		final int[] input = { 0, 0, 0 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}
    @Test
	public void testGetTriangleResultForLengthsZero2() {
		final int[] input = { 2, 4, 0 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}
    @Test
	public void testGetTriangleResultForLengthsZero3() {
		final int[] input = { 0, 1, 2 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}
    @Test
	public void testGetTriangleResultForLengthsZero4() {
		final int[] input = { 3, 0, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

    @Test
	public void testGetTriangleResultForLengthsToShort() {
		final int[] input = { 10, 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}


    @Test
	public void testGetTriangleResultForLengthsToShort2() {
		final int[] input = { 3, 1, 10 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

    @Test
	public void testGetTriangleResultForLengthsToShort3() {
		final int[] input = { 5, 10, 5 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}
}
