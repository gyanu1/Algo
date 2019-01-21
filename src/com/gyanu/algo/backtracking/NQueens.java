package com.gyanu.algo.backtracking;

public class NQueens {
	private static boolean isSafe(int board[][], int row, int col) {
		int i, j;
		// validate left, same row
		for (i = 0; i < col; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}
		// validate upper left diagonal
		for (i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		// validate lower left diagonal
		for (i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		return true;
	}

	public static boolean solveNQUtil(int board[][], int col) {
		if (col >= board[0].length) {
			return true;
		}

		for (int j = 0; j < board.length; j++) {

			if (isSafe(board, j, col)) {
				board[j][col] = 1;
				if (solveNQUtil(board, col + 1)) {
					return true;
				}
				board[j][col] = 0;
			}
		}

		return false;
	}

}
