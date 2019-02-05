package com.gyanu.algo;

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

	@Test
	public void checkBitSetAt() {
		assertEquals(true, BitOperator.checkIfBitSetAt(Integer.parseInt("0011010", 2), 4));
		assertEquals(false, BitOperator.checkIfBitSetAt(Integer.parseInt("0011010", 2), 3));
	}

	@Test
	public void flipBitAt() {
		assertEquals("100011", BitOperator.flipBitAt(Integer.parseInt("110011", 2), 5));
		assertEquals("111011", BitOperator.flipBitAt(Integer.parseInt("110011", 2), 4));
	}
	
	@Test
	public void oddEven() {
		assertEquals(true, (4&1)==0, "even number");
		assertEquals(true, (5&1)==1, "odd number");
	}
	
	@Test
	public void readBytesFromNumbers() {
		int bytes = 0xFF;
		assertEquals(255, bytes);
		long bytesl = 0xFE;
		assertEquals(254, bytesl);
		assertEquals(Integer.parseInt("00011111", 2), Integer.parseInt("110111111010011100011111", 2)&0x0000FF);
		assertEquals(Integer.parseInt("10100111", 2), (Integer.parseInt("10111111010011100011111", 2)&0x00FF00)>>8);	
	}
	
	@Test
	public void reverseBitsOfNumber() {
		int length = 31;
		int num = 0xAA;
		int reverse = 0;
		while(num>0) {
			num =num>>1;
			if((num & 1) ==1) {
				reverse|=(1<<length);
			}
			length--;
		}
		System.out.println(Integer.toBinaryString(reverse));
		assertEquals(0xAA000000,reverse);
	}
}
