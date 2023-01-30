package Homework.hw1;
import java.util.Scanner;
/*Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine */
public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (1>0){
            System.out.print("Введите первое число: ");
            Integer numberOne = scan.nextInt();
            System.out.print("Введите второе число: ");
            Integer numberTwo = scan.nextInt();
            System.out.print("Введите оператор: ");
            String operator = scan.next();
            scan.close();
            switch (operator) {
                case ("+"):
                    System.out.printf("%d %s %d = %d\n",numberOne,operator,numberTwo, sum(numberOne,numberTwo));
                    break;
                case ("-"):
                    System.out.printf("%d %s %d = %d\n",numberOne,operator,numberTwo, def(numberOne,numberTwo));
                    break;
                case ("*"):
                    System.out.printf("%d %s %d = %d\n",numberOne,operator,numberTwo, prod(numberOne,numberTwo));
                    break;
                case ("/"):
                    System.out.printf("%d %s %d = %f\n",numberOne,operator,numberTwo, quot(numberOne,numberTwo));
                    break;
                default:
                    System.out.print("Не верный оператор!\n");
            }
        }
    }
    static Integer sum(int x, int y) {return x + y;}
    static Integer def(int x, int y) {return x - y;}
    static Integer prod(int x, int y) {return x * y;}
    static double quot(double x, double y) {return x / y;}
}
