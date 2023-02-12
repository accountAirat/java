package Homework.hw5;

import java.util.*;
// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

public class ex1 {
    public static void main(String[] args) {
        HashMap<String, String[]> book = new HashMap<>();

        String[] Ivan = { "123", "234", "345" };
        String[] Petr = { "123", "234" };
        String[] Katya = { "123" };
        book.put("Иванов Иван", Ivan);
        book.put("Пётр", Petr);
        book.put("Катя", Katya);
        printMap(book);
    }

    private static void printMap(HashMap<String, String[]> book) {
        for (String index : book.keySet()) {
            System.out.print("\n" + index);
            for (int i = 0; i < book.get(index).length; i++) {
                System.out.print(" " + book.get(index)[i]);
            }
        }
    }
}