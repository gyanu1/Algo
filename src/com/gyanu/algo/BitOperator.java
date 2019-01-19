package com.gyanu.algo;

public class BitOperator {
	public static String flipLowestBit(int num) {
		return Integer.toBinaryString(num & (num - 1));
	}

//	public static String flipBitAt(int n, int position) {
//
//	}

	public static String clearBitAt(int n, int position) {
		int mask = ~0 << position;
		mask = mask | ((1 << position - 1) - 1);
		return Integer.toBinaryString(n & mask);
	}

	public static String setBitAt(int n, int position) {
		int mask = 1 << (position - 1);
		return Integer.toBinaryString(n | mask);
	}
}
