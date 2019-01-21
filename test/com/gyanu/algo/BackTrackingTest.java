package com.gyanu.algo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.gyanu.algo.backtracking.NQueens;

public class BackTrackingTest {

	@Test
	public void FourNQueens() {
		int[][] board = new int[4][4];
		NQueens.solveNQUtil(board, 0);
		int[][] expected = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 1, 0, 0 } };
		assertArrayEquals(expected, board);
	}

}
