package com.gyanu.algo;

import java.util.ArrayList;
import java.util.List;

public class RollingHash {
	private String input;
	private String pattern;

	public RollingHash(String input, String pattern) {
		this.input = input;
		this.pattern = pattern;
	}

	public List<Integer> getMatchingIndexes() {
		List<Integer> results = new ArrayList<>();
		int base = 256;
		int mod = 101;
		int thash = 0;
		int phash = 0;
		int h = 1;
		for (int i = 0; i < this.pattern.length() - 1; i++) {
			h = (h * base) % mod;
		}

		for (int i = 0; i < this.pattern.length(); i++) {

			thash = (base * thash + this.input.charAt(i)) % mod;
			phash = (base * phash + this.pattern.charAt(i)) % mod;
		}
		if (thash == phash) {
			results.add(0);
		}

		for (int j = 1; j <= (this.input.length() - this.pattern.length()); j++) {
			// System.out.println("thash " + thash + ", phash " + phash);
			thash = thash - (this.input.charAt(j - 1) * h);
			thash = (thash * base + this.input.charAt(j - 1 + this.pattern.length())) % mod;

			if (thash < 0) {
				thash = mod + thash;
			}
			if (thash == phash) {
				results.add(j);
			}
		}
		return results;
	}

}
