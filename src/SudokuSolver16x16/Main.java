package SudokuSolver16x16;

/*
*
* Classic recursion sudoku solver improved by Igor Kuzmin
* - Added 4x4 logic (no size limit possible)
* - "As Is" sudoku initialization added
* - Code clean refactoring to readable and easy to understanding
*
 */

public class Main {

    public static void main(String[] args) {
        final String[][] board = {
            {" ", "F", "6", "5",     " ", " ", "D", " ",    "C", " ", " ", " ",    "2", " ", "E", "3"},
            {" ", " ", " ", "1",     " ", "2", " ", " ",    " ", "G", " ", "3",    "5", "6", " ", "4"},
            {"4", "3", "2", "E",     "G", " ", " ", "F",    "7", " ", "D", " ",    "9", "C", " ", " "},
            {"D", " ", " ", "A",     "6", " ", " ", " ",    " ", " ", " ", "9",    " ", " ", " ", "7"},

            {"2", " ", " ", " ",     " ", " ", " ", " ",    "4", "1", "5", "C",    "D", " ", "7", "6"},
            {"5", " ", " ", "B",     " ", "9", " ", " ",    "E", " ", " ", "7",    "F", " ", " ", " "},
            {" ", " ", "E", " ",     " ", "6", " ", " ",    " ", "2", " ", " ",    "4", " ", "9", "5"},
            {" ", " ", " ", "C",     "E", "5", " ", " ",    "D", " ", " ", " ",    "3", "B", " ", " "},

            {" ", " ", " ", "2",     "D", " ", "1", " ",    " ", "F", "8", " ",    " ", "4", " ", " "},
            {" ", "1", " ", " ",     "F", "G", " ", "E",    " ", " ", "C", "A",    "6", " ", "B", "2"},
            {" ", " ", " ", "9",     "A", " ", " ", " ",    "B", "D", "3", " ",    "G", "5", "C", "1"},
            {"B", "4", "C", "6",     " ", " ", "3", "2",    "1", "7", " ", " ",    "A", "9", " ", "D"},

            {" ", " ", "B", " ",     " ", " ", "G", "6",    " ", " ", " ", "4",    "C", " ", "5", " "},
            {"E", "5", "3", "G",     " ", " ", "2", " ",    " ", " ", "F", "1",    " ", "7", "6", " "},
            {" ", " ", "8", " ",     "9", "7", " ", " ",    "3", " ", "G", "E",    " ", "2", " ", "F"},
            {" ", "9", " ", " ",     " ", "F", " ", " ",    "6", " ", "2", "D",    "E", " ", "G", " "},
        };

        Sudoku sudoku = new Sudoku(board);
        SudokuSolver sudokuSolver = new SudokuSolver(sudoku);
        long startTime = System.nanoTime();
        System.out.println(sudokuSolver.solveBoard() ?  "Successfully" : "Failed");
        sudoku.printBoard();

        System.out.println("Completed in " + (System.nanoTime() - startTime) / 1_000_000 + " ms");

    }
}
