package Validation;

/*
 *
 * https://leetcode.com/problems/valid-parentheses/submissions/
 *
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isValid("[][][][][][][][][][][][]([])"));

    }

    public boolean isValid(String s) {
        int count = 0;
        int next;

        while (true) {

            char[] ch = s.toCharArray();

            if (ch.length < 1) {
                return true;
            } else if (ch.length - 1 < count + 1) {
                return false;
            }

            char current = ch[count];

            if (current == 125 | current == 93 | current == 41 | ch.length < 2) {
                return false;
            }

            char nextCur = ch[count + 1];

            if (current == 123) {
                next = 125;
            } else if (current == 91) {
                next = 93;
            } else if (current == 40) {
                next = 41;
            } else return false;

            if (nextCur == next) {
                String firstPart = s.substring(0, count);
                String secondPart = s.substring(count + 2);
                s = firstPart.concat(secondPart);
                count = 0;
            } else count++;

            if (s.length() == 0) {
                break;
            }
        }
        return true;
    }
}
