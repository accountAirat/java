package Homework.hw2;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*Дана json строка (читать из файла и сохранить в файл) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON,
то сделайте получение через обычный текстовый файл!!!)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
"оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Если .txt
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
"фамилия":"Краснов","оценка":"5","предмет":"Физика"

Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/
public class ex2 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("Homework/hw2/file.txt");
        Scanner scan = new Scanner(fr);
        String[] array = new String[5];
        String[] arrayf = {"Студент "," получил ", " по предмету "};
        while (scan.hasNextLine()) {
            array = scan.nextLine().split(",|:");
            System.out.println(Work(array,arrayf));
        }
        scan.close();
        fr.close();
    }
    public static String Work(String[] x, String[] y){
        StringBuilder sb = new StringBuilder();
        String result = "";
        sb.append(y[0]).append(x[1]).append(y[1]).append(x[3]).append(y[2]).append(x[5]);
        result = sb.toString();
        return result;
        }
}