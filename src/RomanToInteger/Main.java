package RomanToInteger;

/*
 *
 * https://leetcode.com/problems/roman-to-integer/
 *
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.romanToInt("XIV"));
    }

    public static int romanToInt(String s) {
        int result = 0, previous = 0, current = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': current = 1; break;
                case 'V': current = 5; break;
                case 'X': current = 10; break;
                case 'L': current = 50; break;
                case 'C': current = 100; break;
                case 'D': current = 500; break;
                case 'M': current = 1000; break;
            }
            result += current >= previous
                ? current
                : -current;
            previous = current;
        }

        return result;
    }
}
