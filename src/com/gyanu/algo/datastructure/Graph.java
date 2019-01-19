package com.gyanu.algo.datastructure;

public class Graph<T> {
	int size;
	Vertex<T> vertices[];
	boolean isDirected;

	@SuppressWarnings("unchecked")
	public Graph(boolean isDirected, int size) {
		this.isDirected = isDirected;
		this.vertices = (Vertex<T>[]) new Vertex<?>[size];
		for(int i=0;i<size;i++) {
			this.vertices[i] = (Vertex<T>) new Vertex<Integer>(i);
		}
	}

	public void addEdge(Edge<T> edge) {
		// add vertex
		// add edge
		// update adjacency List
		this.vertices[(int) edge.start].neighbors.add(edge.end);
	}
}
