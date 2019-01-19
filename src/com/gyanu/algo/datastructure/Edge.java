package com.gyanu.algo.datastructure;

public class Edge<T> {
	T start;
	T end;
	double weight;
	
	public Edge(T start, T end, double weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}

}
