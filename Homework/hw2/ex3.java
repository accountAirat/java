package Homework.hw2;
import java.util.Scanner;

/**
 Напишите метод, который принимает на вход строку (String) и
 определяет является ли строка палиндромом (возвращает boolean значение).
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String x = scan.next();
        scan.close();
        System.out.println(work(x));
    }
    public static boolean work(String x){
        for (int i = 0; i < (x.length()/2); i++) {
            if (x.charAt(i)!=x.charAt(x.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}