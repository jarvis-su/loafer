package com.jarvis.tools;

import static org.junit.Assert.*;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Before;
import org.junit.Test;

public class StringToolsTest {

	@Before
	public void setUp() {
		System.out.println(SystemUtils.JAVA_HOME);
		System.out.println(SystemUtils.JAVA_VERSION);
		System.out.println("before the test ");
	}

	@Test
	public void testIsEmpty() {
		assertTrue(StringTools.isEmpty(""));
	}

}
