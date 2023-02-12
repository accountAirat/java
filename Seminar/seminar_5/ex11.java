package Seminar.seminar_5;

import java.util.TreeMap;

public class ex11 {
    public static void main(String[] args) {
        TreeMap<Integer, String> db = new TreeMap<>();
        db.put(123456, "Иванов");
        db.put(321456, "Васильев");
        db.put(234561, "Петрова");
        db.put(234432, "Иванов");
        db.put(654321, "Петрова");
        db.put(345678, "Иванов");
        for (var item : db.entrySet()) {
        if (item.getValue().equals("Иванов")) {
        System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        }
        }
    
}
