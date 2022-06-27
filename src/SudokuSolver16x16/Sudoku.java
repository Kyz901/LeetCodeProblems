package SudokuSolver16x16;

import java.util.Arrays;

public class Sudoku {

    private final String[][] board;
    private final int[][] boardForCalculation;
    private final int gridSize;

    public Sudoku(String[][] board) {
        this.board = board;
        this.gridSize = board.length;
        boardForCalculation = transformBoard(board);
    }

    public int[][] getBoardForCalculation() {
        return Arrays.copyOf(boardForCalculation, gridSize);
    }

    public int[][] transformBoard(final String[][] board) {
        int[][] transformedToNumbersBoard = new int[gridSize][gridSize];
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                transformedToNumbersBoard[i][j] = Constants.lettersToNumbers.get(board[i][j]);
            }
        }

        return transformedToNumbersBoard;
    }

    public void setSolutionBoard(final int[][] resultBoard) {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                board[i][j] = Constants.numbersToLetters.get(resultBoard[i][j]);
            }
        }
    }

    public int getGridSize() {
        return gridSize;
    }


    public void printBoard() {
        System.out.println("-----------------------------------------");
        for (int i = 0; i < gridSize; i++) {
            System.out.print("| ");
            for (int j = 0; j < gridSize; j++) {
                String solution = board[i][j] + " ";
                if(isEndOfInnerBox(j+1)) {
                    solution = solution.concat("| ");
                }
                System.out.print(solution);
            }
            System.out.println();
            if(isEndOfInnerBox(i+1)) {
                System.out.println("-----------------------------------------");
            }
        }
    }
    private boolean isEndOfInnerBox(int count) {
        return count % getInnerBoxSize() == 0;
    }

    public int getInnerBoxSize() {
        return toInt(Math.sqrt(gridSize));
    }

    private static int toInt(Double value) {
        return value.intValue();
    }

}
