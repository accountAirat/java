import java.util.ArrayList;
import java.util.Comparator;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "Земля");
        list.add(0, "Марс");
        list.add(0, "Юпитер");
        list.add(0, "Юпитер");
        list.add(0, "Венера");
        list.add(0, "Плутон");
        list.add(0, "Сатурн");
        list.add(0, "Земля");
        list.add(0, "Земля");
        System.out.println(list);

        list.sort(Comparator.naturalOrder());

        int count = 1;
        for (int i=0 ; i<list.size()-1; i++){
        if (list.get(i).equals(list.get(i+1))){
        count++;
        }
        else{
        System.out.print(list.get(i));
        System.out.println(" " +count);
        count = 1;
        }
        }
        System.out.print(list.get(list.size()-1));
        System.out.println(" " + count);
    }
}