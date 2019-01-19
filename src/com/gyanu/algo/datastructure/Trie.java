package com.gyanu.algo.datastructure;

public class Trie {
	char data;
	boolean isWord;
	Trie[] next;
	
	public Trie(char data, boolean isWord) {
		this.data= data;
		this.isWord = isWord;
		next = new Trie[26];
	}
}
