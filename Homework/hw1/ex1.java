package Homework.hw1;
import java.util.Scanner;
/*Вычислить n-ое треугольного число(сумма чисел от 1 до n),
n! (произведение чисел от 1 до n)
тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5 */
public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        Integer num = scan.nextInt();
        System.out.printf("%d! = %d\n",num,fNumbers(num));
        System.out.printf("%d-ое треугольного число = %d\n",num,tNumbers(num));
        scan.close();
    }
    static int tNumbers(int number) {
        Integer result = 1;
        for (int i = 2; i < number+1; i++) {
            result = result + i; 
        }
    return result;
    }
    static int fNumbers(int number) {
        Integer result = 1;
        for (int i = 2; i < number+1; i++) {
            result = result * i; 
        }
        return result;
        }
    

}