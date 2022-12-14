package MultiplyStrings;

/*
 *
 * https://leetcode.com/problems/multiply-strings
 *
 */

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("498828660196","840477629533"));
    }

    public static String multiply(final String num1, final String num2) {
        final char[] chars1 = num1.toCharArray();
        final char[] chars2 = num2.toCharArray();
        final int zeroAscii = '0';
        long firstToNum = 0L;
        long secondToNum = 0L;
        for (final char char1: chars1) {
            firstToNum = (firstToNum * 10) + ((int) char1 - zeroAscii);
        }
        for (final char char2: chars2) {
            secondToNum = (secondToNum * 10 )+((int) char2 - zeroAscii);
        }
        long result = firstToNum * secondToNum;
        return String.valueOf(result);
    }
}
