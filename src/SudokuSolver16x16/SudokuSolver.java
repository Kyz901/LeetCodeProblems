package SudokuSolver16x16;

public class SudokuSolver {

    private final Sudoku sudoku;

    public SudokuSolver(Sudoku sudoku) {
        this.sudoku = sudoku;
    }

    public boolean solveBoard() {
        int[][] board = sudoku.getBoardForCalculation();
        int gridSize = sudoku.getGridSize();
        for (int row = 0; row < gridSize; row++) {
            for (int column = 0; column < gridSize; column++) {
                if (isUnsolved(board[row][column])) {
                    return fire(board, gridSize, row, column);
                }
            }
        }
        return true;
    }

    private boolean isUnsolved(int value) {
        return value == Constants.UNSOLVED;
    }

    private boolean fire(int[][] board, int gridSize, int row, int column) {
        for (int possibleSolution = 1; possibleSolution <= gridSize; possibleSolution++) {
            if (isValidPlacement(board, possibleSolution, row, column)) {
                board[row][column] = possibleSolution;
                if (solveBoard()) {
                    sudoku.setSolutionBoard(board);
                    return true;
                } else {
                    board[row][column] = Constants.UNSOLVED;
                }
            }
        }
        return false;
    }

    private boolean isValidPlacement(int[][] board, int number, int row, int column) {
        return !isNumberInBox(board, number, row, column) &&
            !isNumberInColumn(board, number, column) &&
            !isNumberInRow(board, number, row);
    }

    private boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int innerBoxSize = sudoku.getInnerBoxSize();
        int localBoxRow = row - row % innerBoxSize;
        int localBoxColumn = column - column % innerBoxSize;
        for (int i = localBoxRow; i < localBoxRow + innerBoxSize; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + innerBoxSize; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < sudoku.getGridSize(); i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < sudoku.getGridSize(); i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }
}
