import java.util.ArrayList;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        //Пусть дан произвольный список целых чисел, удалить из него четные числа

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,8,3,9,5,21));
        System.out.println(list);

        for (int i=0; i<list.size(); i++){
            if(list.get(i)% 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}