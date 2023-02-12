package Seminar.seminar_5;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {

        Map<Integer, String> db = new HashMap<>();

        db.put(123456, "Иванов");
        db.put(321456, "Васильев");
        db.put(234561, "Петрова");
        db.put(234432, "Иванов");
        db.put(654321, "Петрова");
        db.put(345678, "Иванов");

        Scanner scan = new Scanner(System.in);
        String secondName = "Иванов";

        for (int str : db.keySet()) {

            if (db.get(str).equals(secondName)) {
                System.out.printf("%s %s \n", str, db.get(str));
            }

        }

    }
}