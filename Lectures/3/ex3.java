import java.util.ArrayList;

public class ex3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("qweq");
        list.add( "fgdfg");
        list.add( "234");
        list.add( "343");
        list.add( "fgf");
        list.add( "fgf");
        list.add( "Сатурн");
        list.add( "123");
        list.add( "Земля");
        System.out.println(list);
        int check;

        for (int i=0; i<list.size(); i++){
        try {
        check = Integer.valueOf(list.get(i));
        list.remove(i);
        i--;
        }
        catch (Exception e){
        }

        }
        System.out.println(list);

        }
}