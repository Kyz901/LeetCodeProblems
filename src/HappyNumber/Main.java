package HappyNumber;

/*
 *
 * https://leetcode.com/problems/happy-number/
 *
 */

public class Main {
    public static void main(String[] args) {
        int initNumber = 18;
        Main main = new Main();
        System.out.println(main.isHappy(initNumber));
    }

    public boolean isHappy(int checkedValue) {
        if(checkedValue == 1) {
            return true;
        } else {
            if (checkedValue < 7) return false;

            final char[] separatedInputValues = convertToCharArray(checkedValue);
            int sumOfPows = calculateSumOfPows(separatedInputValues);

            return isHappy(sumOfPows);
        }
    }

    public char[] convertToCharArray(final int valueToConvert) {
        return String.valueOf(valueToConvert).toCharArray();
    }

    public int convertToInt(final char valueToConvert) {
        return Character.getNumericValue(valueToConvert);
    }

    public int calculateSumOfPows(final char[] separatedInputValues) {
        int sumOfPows = 0;
        for(final char separatedValue : separatedInputValues) {
            final int integerValue = convertToInt(separatedValue);
            sumOfPows += integerValue * integerValue;
        }

        return sumOfPows;
    }
}
