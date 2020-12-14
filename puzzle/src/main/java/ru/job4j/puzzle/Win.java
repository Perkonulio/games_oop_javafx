package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if(checkHorizontal(board, i)) {
                rsl = true;
                break;
            } else {
                rsl = false;
            }
        }
        if(!rsl) {
            for (int j = 0; j < board.length; j++) {
                if(checkVertical(board, j)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkVertical(int[][] board, int cell) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if(board[i][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
