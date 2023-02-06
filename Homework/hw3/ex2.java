import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ex2 {
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList.
        // Найти минимальное, максимальное и среднее ариф. из этого списка

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,8,3,9,5,21));
        System.out.printf("max = %d; min = %d; sumA = %d", Collections.max(list), Collections.min(list), average(list));
    }
    public static int average(ArrayList<Integer> list) {
        int sumA = 0;
        for (int i = 0; i < list.size(); i++) {
            sumA += list.get(i);
        }
        return sumA/list.size();
    }
}
