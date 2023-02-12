package Seminar.seminar_5;

import java.util.HashMap;
import java.util.Map;

public class ex22 {
    public static void main(String[] args) {
        String str1 = "papera";
        String str2 = "titlet";
        Boolean prov = true;
        Map<Character, Character> dic = new HashMap<Character, Character>();
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (dic.containsKey(str1.charAt(i))) {
                    if (dic.get(str1.charAt(i)) != str2.charAt(i)) {
                        prov = false;
                    }
                } else {
                    if (dic.containsValue(str2.charAt(i))) {
                        prov = false;
                    }
                    dic.put(str1.charAt(i), str2.charAt(i));
                }
            }
        } else {
            prov = false;
        }
        System.out.println(prov);

    }
}