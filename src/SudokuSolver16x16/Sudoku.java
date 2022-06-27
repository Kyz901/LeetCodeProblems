package SudokuSolver16x16;

public class Sudoku {

    private final int[][] board;
    private final int gridSize;

    public Sudoku(int[][] board) {
        this.board = board;
        this.gridSize = board.length;
    }

    public int[][] getBoard() {
        return board;
    }

    public int getGridSize() {
        return gridSize;
    }


    public void printBoard() {
        System.out.println("---------------------------------------------");
        for (int i = 0; i < gridSize; i++) {
            System.out.print("| ");
            for (int j = 0; j < gridSize; j++) {
                String solution = Constants.numbersToLetters.get(board[i][j]) + " ";
                if(isEndOfInnerBox(j+1)) {
                    solution = solution.concat("| ");
                }
                System.out.print(solution);
            }
            System.out.println();
            if(isEndOfInnerBox(i+1)) {
                System.out.println("---------------------------------------------");
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
