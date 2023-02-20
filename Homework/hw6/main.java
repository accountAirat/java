package Homework.hw6;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Homework/hw6/laptopbase.csv");
        Scanner scan = new Scanner(fr);
        String[] array = new String[7];
        ArrayList<Laptop> base = new ArrayList<>();
        HashMap<String, Integer> filterMap = new HashMap<>();
        filterMap.put("ramMin", 0);
        filterMap.put("ramMax", 100);
        filterMap.put("memoryMin", 0);
        filterMap.put("memoryMax", 10000);
        filterMap.put("priceMin", 0);
        filterMap.put("priceMax", 500000);
        scan.nextLine();
        while (scan.hasNextLine()) {
            array = scan.nextLine().split(";", 0);
            base.add(new Laptop(array[0], array[1], array[2], array[3],
                    array[4], array[5], array[6]));
        }
        menu(filterMap);
        filters(base, filterMap);
        System.out.println(base);
        scan.close();
        fr.close();

    }

    private static void getRange(Scanner scn, HashMap<String, Integer> filterMap, String x, String y) {
        System.out.println("Введите минимальное значение: ");
        filterMap.put(x, scn.nextInt());
        System.out.println("Введите максимальное значение: ");
        filterMap.put(y, scn.nextInt());
    }

    private static void menu(HashMap<String, Integer> filterMap) {
        Scanner scn = new Scanner(System.in);
        Integer select = 100;
        while (select != 0) {

            System.out.println("Введите параметр:\n1 Ram\n2 Memory\n3 Цена\n0 Запустить");
            select = scn.nextInt();
            if (select.equals(1)) {
                getRange(scn, filterMap, "ramMin", "ramMax");
            } else if (select.equals(2)) {
                getRange(scn, filterMap, "memoryMin", "memoryMax");
            } else if (select.equals(3)) {
                getRange(scn, filterMap, "priceMin", "priceMax");
            }
        }
        scn.close();
    }

    private static void filters(ArrayList<Laptop> base, HashMap<String, Integer> filterMap) {
        for (int i = 0; i < base.size(); i++) {
            if (base.get(i).ram < (filterMap.get("ramMin")) || base.get(i).ram > (filterMap.get("ramMax"))
                    || base.get(i).memory < (filterMap.get("memoryMin"))
                    || base.get(i).memory > (filterMap.get("memoryMax"))
                    || base.get(i).memory < (filterMap.get("priceMin"))
                    || base.get(i).memory > (filterMap.get("priceMax"))) {
                base.remove(i);
                i--;
            }
        }
    }
}