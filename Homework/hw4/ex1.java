package Homework.hw4;

import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод(не void), который вернет “перевернутый” список.
 */
public class ex1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            ll.add(Integer.toString(i));
        }
        System.out.println(ll);
        System.out.println(revers(ll));
    }

    public static LinkedList revers(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            list.addFirst(list.remove(i));
        }
        return list;
    }
}