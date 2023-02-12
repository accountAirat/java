package Homework.hw5;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску. 0x00000 0000x00 00x0000
public class ex3 {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];
        String queen = "[f]";
        Integer quantityQueens = 8;
        Integer count = 8;
        fillingChessboard(chessboard);
        for (int i = 0; i < quantityQueens; i++) {
            check(chessboard, queen, count);
        }
        printChessboard(chessboard);

    }

    private static void check(String[][] chessboard, String queen, Integer count) {
        for (int line = 0; line < chessboard.length; line++) {
            for (int column = 0; column < chessboard.length; column++) {
                if (checkLine(line, chessboard, queen) && checkColumn(column, chessboard, queen)
                        && checkDiagonal(line, column, chessboard, queen)) {
                    chessboard[line][column] = queen;
                    count++;
                }
            }
        }
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
