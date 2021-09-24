package triangle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class ExampleTest {

	@Test
	public void testSomething() throws Exception {
		int expected = 10;
		int actual = 10;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSomething2() throws Exception {
		int expected = 10;
		int actual = 10;
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSomething3() throws Exception {
		int expected = 10;
		int actual = 11;
		assertEquals(expected+1, actual);
	}
	
	@Test
	public void testAbsoluteValueOf() throws Exception {
		int input = -4;
		int result = Example.absoluteValueOf(input);
		assertThat(result).isGreaterThanOrEqualTo(0);
	}
	
	@Test
	public void testAbsoluteValueOf2() throws Exception {
		int input = -4;
		int result = Example.absoluteValueOf(input);
		assertThat(result).isEqualTo(4);
	}

	@Test
	public void testGetStandardColorNames() throws Exception {
		List<String> result = Example.getStandardColorNames();
		assertThat(result).contains("Red");
	}
	
	@Test
	public void testGetStandardColorNamesFail() throws Exception {
		List<String> result = Example.getStandardColorNames();
		assertThat(result).doesNotContain("White");
	}
	
	@Test
	public void testGetStandardColorNamesFail2() throws Exception {
		List<String> result = Example.getStandardColorNames();
		assertThat(result).doesNotContain("Black");
	}

	//@Test
	public void testFail() throws Exception {
		List<String> result = Example.getStandardColorNames();
		assertThat(result).contains("Black");
	}

}
