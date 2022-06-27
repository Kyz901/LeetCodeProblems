package SudokuSolver16x16;

/*
*
* Classic recursion sudoku solver improved by Igor Kuzmin
* - Added 4x4 logic (no size limit possible)
* - "As Is" sudoku initialization added
* - Code clean refactoring to readable and easy to understanding
*
*
*
*                     EXMLP OUTPUT
*
*       -----------------------------------------
*       | 9 F 6 5 | 7 A D 4 | C 8 1 B | 2 G E 3 |
*       | C B 7 1 | 8 2 E 9 | F G A 3 | 5 6 D 4 |
*       | 4 3 2 E | G 1 B F | 7 6 D 5 | 9 C A 8 |
*       | D 8 G A | 6 C 5 3 | 2 E 4 9 | B F 1 7 |
*       -----------------------------------------
*       | 2 G 9 8 | B 3 F A | 4 1 5 C | D E 7 6 |
*       | 5 D 1 B | 2 9 4 G | E 3 6 7 | F A 8 C |
*       | A 7 E 3 | C 6 8 D | G 2 B F | 4 1 9 5 |
*       | F 6 4 C | E 5 7 1 | D A 9 8 | 3 B 2 G |
*       -----------------------------------------
*       | G A 5 2 | D B 1 C | 9 F 8 6 | 7 4 3 E |
*       | 3 1 D 7 | F G 9 E | 5 4 C A | 6 8 B 2 |
*       | 8 E F 9 | A 4 6 7 | B D 3 2 | G 5 C 1 |
*       | B 4 C 6 | 5 8 3 2 | 1 7 E G | A 9 F D |
*       -----------------------------------------
*       | 1 2 B F | 3 E G 6 | 8 9 7 4 | C D 5 A |
*       | E 5 3 G | 4 D 2 B | A C F 1 | 8 7 6 9 |
*       | 6 C 8 D | 9 7 A 5 | 3 B G E | 1 2 4 F |
*       | 7 9 A 4 | 1 F C 8 | 6 5 2 D | E 3 G B |
*       -----------------------------------------
*       Completed in 86140 ms
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
