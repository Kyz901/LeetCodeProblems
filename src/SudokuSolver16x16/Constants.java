package SudokuSolver16x16;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static final int UNSOLVED = 0;
    public static final Map<Integer, String> numbersToLetters = new HashMap<>(fillMapCorrespondence());

    private static Map<Integer, String> fillMapCorrespondence() {
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
}
