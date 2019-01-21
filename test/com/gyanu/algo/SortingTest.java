package com.gyanu.algo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.PriorityQueue;

import org.junit.jupiter.api.Test;

class SortingTest {

	@Test
	public void descendingSorting() {
		Integer[] num = { 6, 3, 7, 4, 5, 2, 8, 9 };
		Arrays.sort(num, (a, b) -> b - a);
		Integer[] expected = { 9, 8, 7, 6, 5, 4, 3, 2 };
		assertArrayEquals(expected, num);
	}

	@Test
	public void asendingSorting() {
		Integer[] num = { 6, 3, 7, 4, 5, 2, 8, 9 };
		Arrays.sort(num, (a, b) -> a - b);
		Integer[] expected = { 2, 3, 4, 5, 6, 7, 8, 9 };
		assertArrayEquals(expected, num);
	}

	@Test
	public void minQueue() {
		PriorityQueue<Integer> minQueue = new PriorityQueue<>();
		minQueue.add(9);
		minQueue.add(2);
		minQueue.add(7);
		assertEquals(2, (int) minQueue.poll());
		assertEquals(7, (int) minQueue.poll());
	}

}
