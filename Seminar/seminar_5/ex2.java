package Seminar.seminar_5;

import java.util.HashMap;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {
        String str1 = "total";
        String str2 = "paper";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = new char[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            ch2[i] = str2.charAt(i);
        }
        boolean flag = true;
        Map<Character, Character> db1 = new HashMap<>();
        db1.putIfAbsent(ch1[0], ch2[0]);
        for (int i = 1; i < str1.length(); i++) {
            if (db1.containsKey(ch1[i]) && db1.get(ch1[i]).equals(ch2[i])) {
                continue;
            } else if (!db1.containsKey(ch1[i]) && db1.containsValue(ch2[i])) {
                flag = false;
            } else if (!db1.containsKey(ch1[i])) {
                db1.put(ch1[i], ch2[i]);
            } else {
                flag = false;
            }
        }
        System.out.println(flag);
    }

}
