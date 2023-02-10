package Homework.hw4;
/*
 В калькулятор добавьте возможность отменить последнюю операцию.
 */

import java.util.Scanner;
import java.util.Stack;

public class ex3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner scan = new Scanner(System.in);
        String operator = "";
        Integer numberTwo = 0;
        System.out.print("Введите число: ");
        st.push(scan.nextInt());
        while (!operator.equals("q")) {
            System.out.print("~~~~~~~~~~~\nОператоры: +, -, *, /\nОтменить операцию: !\nВыйти: Q\nВведите символ: ");
            operator = scan.next().toLowerCase();
            if (!operator.equals("!") && !operator.equals("q")) {
                System.out.print("Введите число: ");
                numberTwo = scan.nextInt();
                System.out.print(st.peek());
            }
            switch (operator) {
                case ("+"):
                    System.out.printf(" + %d = ", numberTwo);
                    System.out.printf("%d\n", sum(st, numberTwo));
                    break;
                case ("-"):
                    System.out.printf(" - %d = ", numberTwo);
                    System.out.printf("%d\n", def(st, numberTwo));
                    break;
                case ("*"):
                    System.out.printf(" * %d = ", numberTwo);
                    System.out.printf("%d\n", prod(st, numberTwo));
                    break;
                case ("/"):
                    System.out.printf(" / %d = ", numberTwo);
                    System.out.printf("%d\n", quot(st, numberTwo));
                    break;
                case ("!"):
                    System.out.printf("Отменённый итог: %d\nТекущее число: %d\n", st.pop(), st.peek());
                    break;
                case ("q"):
                    System.out.print("Пока");
                    break;
                default:
                    System.out.print("Не верный символ!\n");
            }
        }
        scan.close();
    }

    static Integer sum(Stack x, Integer y) {
        x.push((Integer) x.peek() + y);
        return (Integer) x.peek();
    }

    static Integer def(Stack x, Integer y) {
        x.push((Integer) x.peek() - y);
        return (Integer) x.peek();
    }

    static Integer prod(Stack x, Integer y) {
        x.push((Integer) x.peek() * y);
        return (Integer) x.peek();
    }

    static Integer quot(Stack x, Integer y) {
        x.push((Integer) x.peek() / y);
        return (Integer) x.peek();
    }
}