package Homework.hw5;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    /*
     * Пусть дан список сотрудников:
     * Написать программу, которая найдет и выведет повторяющиеся имена с
     * количеством повторений.
     * Отсортировать по убыванию популярности Имени.
     */
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> book = new HashMap<>();
        fill(book);
        printMap(book);
        sortPtint(book);

    }

    private static void fill(HashMap<String, Integer> book) throws IOException {
        FileReader fr = new FileReader("Homework/hw5/file.txt");
        Scanner scan = new Scanner(fr);
        String[] array = new String[2];
        while (scan.hasNextLine()) {
            array = scan.nextLine().split(" ");
            if (book.containsKey(array[0])) {
                book.put(array[0], book.get(array[0]) + 1);
            } else {
                book.put(array[0], 1);
            }
        }
        scan.close();
        fr.close();
    }

    private static void printMap(HashMap<String, Integer> book) {
        for (String index : book.keySet()) {
            System.out.println(index + " " + book.get(index));
        }
        System.out.println("");
    }

    private static void sortPtint(HashMap<String, Integer> book) {
        book.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
