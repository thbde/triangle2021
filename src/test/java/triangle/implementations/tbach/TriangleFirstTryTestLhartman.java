package triangle.implementations.tbach;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleFirstTryTestLhartman {

	public static final Triangle triangle = new TriangleLhartman();

	@Test
	public void testGetTriangleResultForNullInput() {
		final int[] input = null;
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForEmptyInput() {
		final int[] input = {};
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForOneIntegerInput() {
		final int[] input = { 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForTowIntegerInput() {
		final int[] input = { 1, 2 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForALowerThanOneInput() {
		final int[] input = { 0, 1, 2 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForBLowerThanOneInput() {
		final int[] input = { 1, 0, 2 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForCLowerThanOneInput() {
		final int[] input = { 1, 2, 0 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
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
	public void testGetTriangleResultForABLengthsIsosceles() {
		final int[] input = { 2, 2, 3 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForBCLengthsIsosceles() {
		final int[] input = { 3, 2, 2 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForACLengthsIsosceles() {
		final int[] input = { 2, 3, 2 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
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
	public void testGetTriangleResultForMoreThanThreeInputs() {
		final int[] input = { 5, 5, 5, 8 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}
}