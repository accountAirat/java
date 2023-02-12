package Seminar.seminar_5;

import java.util.*;

public class ex3 {

    public static void main(String[] args) {
        String yrav = "(({[]+()}))";
        char[] chars = yrav.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        boolean flag = true;
        String[] c1 = new String[] { "()", "{}", "[]", "<>" };
        for (int i = 0; i < c1.length; i++) {
            String s = c1[i];
            map.put(s.charAt(1), s.charAt(0));
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.containsValue(chars[i])) {
                stack.push(chars[i]);
            } else if (map.containsKey(chars[i])) {
                if (stack.empty() || map.get(chars[i]) != stack.pop()) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(stack.empty());
        } else {
            System.out.println(false);
        }
    }
}