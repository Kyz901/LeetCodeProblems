package ValidAnagram;

/*
 *
 * https://leetcode.com/problems/valid-anagram/submission
 *
 */


class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagran","nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        if(s.length()!=t.length()) return false;
        for (int i = 0; i <= sChar.length-1;i++ ) {
            int index = t.indexOf(sChar[i]);
            if (index == -1){
                return false;
            } else {
                t = t.substring(0,index).concat(t.substring(index+1));
            }
        }


            return true;
        }

    }
