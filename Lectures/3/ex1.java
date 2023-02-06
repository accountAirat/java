import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * ex1
 */
public class ex1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
        list1.add(Integer.toString(random.nextInt(10)));
        }
        list1.sort(Comparator.naturalOrder());
        System.out.print(String.join("-", list1));
    }
}