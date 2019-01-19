package com.gyanu.algo.datastructure;

import java.util.LinkedList;
import java.util.List;

public class Graph2 {
	int size;
	List<Integer> adjList[];

	@SuppressWarnings("unchecked")
	public Graph2(int size) {
		this.size = size;
		this.adjList = new LinkedList[size]; // can be other data structure
		for (int i = 0; i < size; i++) {
			this.adjList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int src, int dest) {
		this.adjList[src].add(dest);
	}

	// need boolean[] visited to solve problem

}
