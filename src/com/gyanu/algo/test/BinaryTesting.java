package com.gyanu.algo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gyanu.algo.BitOperator;

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
		assertEquals("11111111111111111111111111111110", Integer.toBinaryString(-32 >> 4));
	}

	@Test
	public void logicalShift() {
		assertEquals("1111", Integer.toBinaryString(-32 >>> 28));
	}

	@Test
	public void clearBitAt() {
		assertEquals("100000", BitOperator.clearBitAt(Integer.parseInt("101000", 2), 4));
		assertEquals("1011", BitOperator.clearBitAt(Integer.parseInt("1111", 2), 3));
	}

	@Test
	public void setBitAt() {
		assertEquals("101000", BitOperator.setBitAt(Integer.parseInt("100000", 2), 4));
		assertEquals("1111", BitOperator.setBitAt(Integer.parseInt("1011", 2), 3));
	}

	@Test
	public void flipLowestBit() {
		assertEquals("100", BitOperator.flipLowestBit(6));
		assertEquals("101000", BitOperator.flipLowestBit(44));
	}
}
