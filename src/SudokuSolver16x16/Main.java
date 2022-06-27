package SudokuSolver16x16;

public class Main {

    public static void main(String[] args) {
        final int[][] board = {
            {0,15,6,5, 0,0,13,0, 12,0,0,0, 2,0,14,3},
            {0,0,0,1, 0,2,0,0, 0,16,0,3, 5,6,0,4},
            {4,3,2,14, 16,0,0,15, 7,0,13,0, 9,12,0,0},
            {13,0,0,10, 6,0,0,0, 0,0,0,9, 0,0,0,7},

            {2,0,0,0, 0,0,0,0, 4,1,5,12, 13,0,7,6},
            {5,0,0,11, 0,9,0,0, 14,0,0,7, 15,0,0,0},
            {0,0,14,0, 0,6,0,0, 0,2,0,0, 4,0,9,5},
            {0,0,0,12, 14,5,0,0, 13,0,0,0, 3,11,0,0},

            {0,0,0,2, 13,0,1,0, 0,15,8,0, 0,4,0,0},
            {0,1,0,0, 15,16,0,14, 0,0,12,10, 6,0,11,2},
            {0,0,0,9, 10,0,0,0, 11,13,3,0, 16,5,12,1},
            {11,4,12,6, 0,0,3,2, 1,7,0,0, 10,9,0,13},

            {0,0,11,0, 0,0,16,6, 0,0,0,4, 12,0,5,0},
            {14,5,3,16, 0,0,2,0, 0,0,15,1, 0,7,6,0},
            {0,0,8,0, 9,7,0,0, 3,0,16,14, 0,2,0,15},
            {0,9,0,0, 0,15,0,0, 6,0,2,13, 14,0,16,0}
        };

        Sudoku sudoku = new Sudoku(board);
        SudokuSolver sudokuSolver = new SudokuSolver(sudoku);
        String result = sudokuSolver.solveBoard() ?  "Successfully" : "Failed";
        System.out.println(result);
        sudoku.printBoard();
        System.out.println(twoDimArrayEquals(board, board) ? "Equals" : "ERROR");

    }

    private static boolean twoDimArrayEquals(int[][] firstArray, int[][] secondArray) {
        System.out.println("DEBUGGING ---> ");
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                if(!(firstArray[i][j] == secondArray[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
