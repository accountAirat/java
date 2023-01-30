package Seminar.seminar_2;
import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        char c1 = scan.next().charAt(0);
        char c2 = scan.next().charAt(0);
        scan.close();
        System.out.println(build(num, c1, c2));
    }
    
    static String build(int number, char ch1, char ch2){
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (int i = 0; i < number / 2; i++) {
            sb.append(ch1);
            sb.append(ch2);
        }
        result = sb.toString();
        return result;
        
    }
}
