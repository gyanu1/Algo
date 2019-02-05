package com.gyanu.algo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author gyanumaharjan
 * 
 *         final generally means it cannot be reassigned
 *
 */
class GeneralJavaTest {

	@Test
	public void arrayImmutability() {
		final char[] name = new char[] { 'g', 'y', 'a', 'n', 'u' };
		name[0] = 'm';
		assertEquals('m', name[0]); // allows modifying each array element
	}

	@Test
	public void stringImmutability() {
		String name = "gyanu";
		name = "raju";
		System.out.println("" + (1<<0));
		System.out.println("" + (1<<1));
	}
}
