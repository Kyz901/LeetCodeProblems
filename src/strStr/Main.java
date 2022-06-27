package strStr;


/*
 *
 *   https://leetcode.com/problems/implement-strstr/submissions/
 *
 */

public class Main {
    public static void main(String[] args) {
        String str = "aaaaaaaa";
        Main main = new Main();
        System.out.println(main.strStr(str, "aab"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        if (haystack.indexOf(needle) > -1) return haystack.indexOf(needle);

        return -1;
    }
}
