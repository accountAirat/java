package Seminar.seminar_2;
import java.util.Scanner;;

public class ex2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter: ");
        String x = iScanner.next();
        iScanner.close();
        System.out.println(Work(x));//aaabbc
    }
    static String Work(String x){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        String result = "";
        for (int i = 0; i < x.length()-1; i++) {
            if (x.charAt(i) == x.charAt(i+1)){
                count++;}
            else{
                sb.append(x.charAt(i)).append(count);
                count=1;
            }
        }
        sb.append(x.charAt(x.length()-1)).append(count);
        result = sb.toString();
        return result;

    }
}
