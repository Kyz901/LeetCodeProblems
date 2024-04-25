package Validation;

import java.util.Stack;
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
        final Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(')  stack.push(')');
            else if(c == '{') stack.push('}');
            else if(c == '[') stack.push(']');
            else if(stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
