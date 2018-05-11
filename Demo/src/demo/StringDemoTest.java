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
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
		assertEquals("һ����ĸ��Сд",str.smallString("B"),"b");
		assertEquals("һ����ĸ��Сд",str.smallString("C"),"c");
		assertEquals("һ����ĸ��Сд",str.smallString("D"),"d");
		assertEquals("һ����ĸ��Сд",str.smallString("E"),"e");
		assertEquals("һ����ĸ��Сд",str.smallString("F"),"f");
		assertEquals("һ����ĸ��Сд",str.smallString("G"),"g");
		assertEquals("һ����ĸ��Сд",str.smallString("X"),"x");
		assertEquals("һ����ĸ��Сд",str.smallString("Y"),"y");
		assertEquals("һ����ĸ��Сд",str.smallString("Z"),"z");
	}

}
