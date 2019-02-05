package com.gyanu.algo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.gyanu.algo.pojo.FaultyHashcode;

public class MapTest {
	static Map<FaultyHashcode, String> faultyHashcodes;

	@BeforeAll
	public static void setup() {
		faultyHashcodes = new HashMap<>();
	}

	@Test
	public void differentObjectWithFaultyHashCode() {
		FaultyHashcode first = new FaultyHashcode("ram", "1111111");
		FaultyHashcode second = new FaultyHashcode("sita", "2222222");
		FaultyHashcode third = new FaultyHashcode("gita", "3333333");
		faultyHashcodes.put(first, "first");
		faultyHashcodes.put(second, "second");
		faultyHashcodes.put(third, "third");
		// System.out.println(faultyHashcodes.toString());
		assertEquals(first.hashCode(), second.hashCode());
		assertFalse(first.equals(second));
		assertEquals(3, faultyHashcodes.size());
		assertEquals("first", faultyHashcodes.get(first));
	}

	@Test
	public void rollingHash() {
		String input = "cdefcdefcdefcdefcdef";
		String pattern = "cdef";
		RollingHash rollingHash = new RollingHash(input, pattern);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(4);
		expected.add(8);
		expected.add(12);
		expected.add(16);
		assertIterableEquals(expected, rollingHash.getMatchingIndexes());

	}

}
