package com.gyanu.algo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.HashMap;
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
		//System.out.println(faultyHashcodes.toString());
		assertEquals(first.hashCode(), second.hashCode());
		assertFalse(first.equals(second));
		assertEquals(3, faultyHashcodes.size());
		assertEquals("first", faultyHashcodes.get(first));
	}

}
