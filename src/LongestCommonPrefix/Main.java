package LongestCommonPrefix;

/*
 *
 * https://leetcode.com/problems/longest-common-prefix/
 *
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.longestCommonPrefix(new String[]{"ab", "a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String checkedWord = strs[0];
        String lastValidPrefix = "";
        for(int i = 1; i <= checkedWord.length(); i++) {
            String checkPrefix = checkedWord.substring(0, i);
            for(int j = 1; j < strs.length; j++) {
                if(!strs[j].startsWith(checkPrefix)) {
                    return checkedWord.substring(0, i - 1);
                }
            }
            lastValidPrefix = checkPrefix;
        }
        return lastValidPrefix;
    }
}
