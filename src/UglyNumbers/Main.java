package UglyNumbers;

/*
 *
 * https://leetcode.com/problems/ugly-number/
 *
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isUgly(2));

    }

    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }

        while (num != 1) {

            if (num % 2 == 0) {

                num = num / 2;
                continue;
            }
            if (num % 3 == 0) {
                num = num / 3;
                continue;
            }
            if (num % 5 == 0) {
                num = num / 5;
                continue;
            }
            return false;
        }
        return true;
    }
}
