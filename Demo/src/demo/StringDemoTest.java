package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringDemoTest {
	private StringDemo str;
	@Before
	public void setUp() throws Exception {
		str = new StringDemo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSmallString() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
		assertEquals("一个字母变小写",str.smallString("B"),"b");
		assertEquals("一个字母变小写",str.smallString("C"),"c");
		assertEquals("一个字母变小写",str.smallString("D"),"d");
		assertEquals("一个字母变小写",str.smallString("E"),"e");
		assertEquals("一个字母变小写",str.smallString("F"),"f");
		assertEquals("一个字母变小写",str.smallString("G"),"g");
		assertEquals("一个字母变小写",str.smallString("X"),"x");
		assertEquals("一个字母变小写",str.smallString("Y"),"y");
		assertEquals("一个字母变小写",str.smallString("Z"),"z");
	}

}
