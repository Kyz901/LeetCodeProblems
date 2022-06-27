package SudokuSolver16x16;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static final int UNSOLVED = 0;
    public static final Map<String, Integer> lettersToNumbers = new HashMap<>(fillMapCorrespondenceForLetters());
    public static final Map<Integer, String> numbersToLetters = new HashMap<>(fillMapCorrespondenceForNumbers());

    private static Map<Integer, String> fillMapCorrespondenceForNumbers() {
        Map<Integer, String> newMapCorrespondence = new HashMap<>();
        newMapCorrespondence.put(1, "1");
        newMapCorrespondence.put(2, "2");
        newMapCorrespondence.put(3, "3");
        newMapCorrespondence.put(4, "4");
        newMapCorrespondence.put(5, "5");
        newMapCorrespondence.put(6, "6");
        newMapCorrespondence.put(7, "7");
        newMapCorrespondence.put(8, "8");
        newMapCorrespondence.put(9, "9");
        newMapCorrespondence.put(10, "A");
        newMapCorrespondence.put(11, "B");
        newMapCorrespondence.put(12, "C");
        newMapCorrespondence.put(13, "D");
        newMapCorrespondence.put(14, "E");
        newMapCorrespondence.put(15, "F");
        newMapCorrespondence.put(16, "G");

        return newMapCorrespondence;
    }

    private static Map<String, Integer> fillMapCorrespondenceForLetters() {
        Map<String, Integer> newMapCorrespondence = new HashMap<>();
        newMapCorrespondence.put(" ", 0);
        newMapCorrespondence.put("1", 1);
        newMapCorrespondence.put("2", 2);
        newMapCorrespondence.put("3", 3);
        newMapCorrespondence.put("4", 4);
        newMapCorrespondence.put("5", 5);
        newMapCorrespondence.put("6", 6);
        newMapCorrespondence.put("7", 7);
        newMapCorrespondence.put("8", 8);
        newMapCorrespondence.put("9", 9);
        newMapCorrespondence.put("A", 10);
        newMapCorrespondence.put("B", 11);
        newMapCorrespondence.put("C", 12);
        newMapCorrespondence.put("D", 13);
        newMapCorrespondence.put("E", 14);
        newMapCorrespondence.put("F", 15);
        newMapCorrespondence.put("G", 16);

        return newMapCorrespondence;
    }
}
