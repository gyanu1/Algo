package com.gyanu.algo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTesting {

	@Test
	public void arithmeticShift() {
		assertEquals(4, 8 >> 1);
		assertEquals(8, 4 << 1);
	}

	@Test
	public void negativeArithmeticShift() {
		assertEquals(-4, -8 >> 1);
		assertEquals(-8, -4 << 1);
		assertNotEquals(8, -4 << 1);
		assertNotEquals(4, -8 >> 1);
	}

	@Test
	public void logicalShift() {
		assertEquals(4, -32 >>> 3);
		assertNotEquals(-4, -32 >>> 3);
	}

	@Test
	public void createMask() {

	}

	@Test
	public void flipBit() {

	}

	@Test
	public void flipLowestBit() {
		assertEquals(4, flipLowestBit(6));
	}
	
	public static int flipLowestBit(int num) {
		return num & (num-1);
	}
}
