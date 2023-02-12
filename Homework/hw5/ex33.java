package Homework.hw5;

import java.util.Random;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску. 0x00000 0000x00 00x0000
public class ex33 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[][] chessboard = new String[8][8];
        String queen = "[f]";
        Integer quantityQueens = 8;
        fillingChessboard(chessboard);
        Integer line = 0;
        Integer column = 0;
        Integer count = 0;
        while (quantityQueens >= 0 && count < 1000) {
            line = rand.nextInt(8);
            column = rand.nextInt(8);
            if (check(chessboard, queen, line, column)) {
                chessboard[line][column] = queen;
                quantityQueens--;
            }
            count++;
        }
        if (quantityQueens >0){
            System.out.println("8 поставить не смог");
        }
        printChessboard(chessboard);

    }

    private static Boolean check(String[][] chessboard, String queen, Integer line, Integer column) {
        if (checkLine(line, chessboard, queen) && checkColumn(column, chessboard, queen)
                && checkDiagonal(line, column, chessboard, queen)) {
            return true;
        }
        return false;
    }

    private static Boolean checkDiagonal(int x, int y, String[][] chessboard, String queen) {
        for (int i = 1; i < 7; i++) {
            if (0 <= (x - i) && 0 <= (y - i)) {
                if (chessboard[x - i][y - i] == queen) {
                    return false;
                }
            }
            if (0 <= (x - i) && (y + i) < 7) {
                if (chessboard[x - i][y + i] == queen) {
                    return false;
                }
            }
            if ((x + i) < 7 && (y + i) < 7) {
                if (chessboard[x + i][y + i] == queen) {
                    return false;
                }
            }
            if ((x + i) < 7 && 0 <= (y - i)) {
                if (chessboard[x + i][y - i] == queen) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Boolean checkColumn(int column, String[][] chessboard, String queen) {
        for (int line = 0; line < chessboard.length; line++) {
            if (chessboard[line][column].equals(queen)) {
                return false;
            }
        }
        return true;
    }

    private static Boolean checkLine(int line, String[][] chessboard, String queen) {
        for (int column = 0; column < chessboard.length; column++) {
            if (chessboard[line][column].equals(queen)) {
                return false;
            }
        }
        return true;
    }

    private static void fillingChessboard(String[][] chessboard) {
        for (int line = 0; line < 8; line++) {
            for (int column = 0; column < 8; column++) {
                chessboard[line][column] = "[ ]";
            }
        }
    }

    private static void printChessboard(String[][] chessboard) {
        for (int line = 0; line < chessboard.length; line++) {
            for (int column = 0; column < chessboard[line].length; column++) {
                System.out.print(chessboard[line][column]);
            }
            System.out.println("");
        }
    }

}
