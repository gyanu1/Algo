package com.gyanu.algo.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LamdaTesting {

	// public int[] nums;

	@BeforeEach
	public void setup() {
		// nums = {1,2,4,3,5,7,8,9,5};
	}

	@Test
	public void mapTesting() {
		int[] nums = { 3, 2, 1 };
		int[] expected = { 9, 4, 1 };
		assertArrayEquals(expected, IntStream.of(nums).map(a -> a * a).toArray());
	}

	@Test
	public void filterTesting() {
		int[] nums = { 9, 4, 1 };
		int[] expected = { 9, 4 };
		assertArrayEquals(expected, IntStream.of(nums).filter(a -> a > 2).toArray());
	}

	// reduce
	@Test
	public void reduce() {
		assertEquals(2 * 25 * 26, IntStream.rangeClosed(1, 100).filter(a -> a % 4 == 0).reduce(0, (a, b) -> a + b));
	}

	// collect

	// prime number
	@Test
	public void primeNumbers100() {
		int[] primes = IntStream.rangeClosed(1, 100).filter(a -> a % 2 != 0).filter(a -> a % 3 != 0)
				.filter(a -> a % 5 != 0).filter(a -> a % 7 != 0).toArray();
		Stream.of(primes).forEach(System.out::println);
		System.out.println(Arrays.toString(primes));
	}

}
