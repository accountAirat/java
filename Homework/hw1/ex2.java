package Homework.hw1;
//Вывести все простые числа от 1 до 1000
public class ex2 {

    public static void main(String[] args) {
        for (int i = 3; i < 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i==j){
                    System.out.printf("%d ",i);
                }
                else if (i%j==0){
                    j = 1001;
                }
            }
        }
    }
}