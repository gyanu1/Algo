package com.gyanu.algo;

public class BitOperator {
	public static String flipLowestBit(int num) {
		return Integer.toBinaryString(num & (num - 1));
	}

	public static String flipBitAt(int n, int position) {
		return Integer.toBinaryString(n ^ 1 << (position - 1));
	}

	public static String clearBitAt(int n, int position) {
		int mask = ~(1 << position - 1);
		return Integer.toBinaryString(n & mask);
	}

	public static String setBitAt(int n, int position) {
		int mask = 1 << (position - 1);
		return Integer.toBinaryString(n | mask);
	}

	public static boolean checkIfBitSetAt(int n, int position) {
		int mask = 1 << position - 1;
		return (n & mask) > 0;
	}
}
