package com.gyanu.algo.datastructure;

import java.util.HashSet;
import java.util.Set;

public class Vertex<T> {
	T value;
	Set<T> neighbors;

	public Vertex(T val) {
		this.value = val;
		neighbors = new HashSet<>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex<?> other = (Vertex<?>) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	
}
