package ClimbingStairs;

/*
 *
 * https://leetcode.com/problems/climbing-stairs/
 *
 */


public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(final int n) {
        int result = 0;
        int prev = 0;
        int cur = 1;
        for(int i = 0; i < n; i++) {
            result = cur + prev;
            prev = cur;
            cur = result;
        }
        return result;
    }
}
