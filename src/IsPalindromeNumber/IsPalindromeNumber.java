package IsPalindromeNumber;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(IsPalindromeNumber.isPalindrome(121));
        System.out.println(IsPalindromeNumber.isPalindrome(-121));
        System.out.println(IsPalindromeNumber.isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        final String str = String.valueOf(x);
        final int length = str.length();

        for (int i = 0; i < length/2; i++) {
            if(str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
