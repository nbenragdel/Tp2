package com.tohtml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class UtilHtmlTest {

	@Test
	public void testCasGen() {
		UtilHtml uh = new UtilHtml();
		String arg[] = { "A", "B", "C" };
		String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
		assertEquals("cas general : toHtmlTab", expectedHtmlTab,
				uh.toHtmlTab(arg, arg.length));
	}

	@Test
	public void testTabvide() {
		UtilHtml uh = new UtilHtml();
		String arg[] = {};
		String expectedHtmlTab = "(vide)";
		assertEquals("toHtmlTab : tableau vide", expectedHtmlTab,
				uh.toHtmlTab(arg, 10));
	}

	@Test
	public void testTab1ele() {
		UtilHtml uh = new UtilHtml();
		String arg[] = { "A" };
		String expectedHtmlTab = "<table><tr><td>A</td></tr></table>";
		assertEquals("toHtmlTab : une ligne", expectedHtmlTab,
				uh.toHtmlTab(arg, arg.length));
	}

	@Test
	public void testTabNeleMoins1() {
		UtilHtml uh = new UtilHtml();
		String arg[] = { "A", "B", "C" };
		String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>...</td></tr></table>";
		assertEquals("toHtmlTab : cas moins 1", expectedHtmlTab,
				uh.toHtmlTab(arg, arg.length - 1));
	
	}

	@Test
	public void testTabNeleDivise2() {
		UtilHtml uh = new UtilHtml();
		String arg[] = { "A", "B", "C" };
		String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
		assertEquals("toHtmlTab : cas median,impair", expectedHtmlTab,
				uh.toHtmlTab(arg, arg.length / 2));
	
	}

	@Test
	public void testTabMaxRows() {
		UtilHtml uh = new UtilHtml();
		String arg[] = { "A", "B", "C" };
		String expectedHtmlTab = "<table><tr><td>...</td></tr></table>";
		assertEquals("toHtmlTab : cas MaxRows = 0", expectedHtmlTab,
				uh.toHtmlTab(arg, 0));
	}
}
