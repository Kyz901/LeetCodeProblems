package PlusOne;

/*
 *
 * https://leetcode.com/problems/plus-one/
 *
 */

public class PlusOne {
    public static void main(String[] args) {
        toString(plusOne(new int[]{8, 9, 9}));
    }

    public static int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        for(int i = lastIndex; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }

    public static void toString(final int[] array) {
        System.out.print("[");
        for(final int num : array) {
            System.out.print(" " +num);
        }
        System.out.print(" ]");
    }
}
