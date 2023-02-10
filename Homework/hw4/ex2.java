package Homework.hw4;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class ex2 {

    public static void main(String[] args) {
        LinkedList<String> linkist = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String cmd = "";

        linkist.add("A");
        linkist.add("B");
        linkist.add("C");
        while (!cmd.equals("4")) {
            System.out.println("~~~~~~~~\nВведите номер команды:\n1. enqueue() - помещает элемент в конец очереди");
            System.out.println("2. dequeue() - возвращает первый элемент из очереди и удаляет его");
            System.out.println("3. first() - возвращает первый элемент из очереди, не удаляя");
            System.out.println("4. Выход");
            cmd = scan.next();
            switch (cmd) {
                case "1":
                    System.out.println("Введите элемент");
                    cmd = scan.next();
                    enqueue(cmd, linkist);
                    System.out.println(linkist);
                    break;
                case "2":
                    System.out.printf("Первый элемент: %s\n", dequeue(linkist));
                    System.out.println(linkist);
                    break;
                case "3":
                    System.out.printf("Первый элемент: %s\n", first(linkist));
                    System.out.println(linkist);
                    break;
                case "4":
                    System.out.println("Пока");
                    break;
            }
        }
    }

    public static void enqueue(String x, LinkedList ll) {
        ll.addLast(x);
    }

    public static String dequeue(LinkedList ll) {
        return (String) ll.removeFirst();
    }

    public static String first(LinkedList ll) {
        return (String) ll.getFirst();
    }
}