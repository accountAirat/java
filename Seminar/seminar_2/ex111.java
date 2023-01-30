package Seminar.seminar_2;
import java.util.Scanner;
public class ex111 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter N, c1, c2: ");
        String str = iScanner.nextLine();
        iScanner.close();
        String[] arr = str.split(" |,|\\.");

        System.out.println(charString(arr));
    }

    public static String charString(String[] arr) {

        int number = Integer.parseInt(arr[0]);
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < number / 2; i++) {
            string.append(arr[1]).append(arr[2]);
        }
        return string.toString();
    }
}
