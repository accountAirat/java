// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
package Homework.hw2;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class ex1 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(ex1.class.getName());
        FileHandler FileHandler = new FileHandler("log.txt");
        logger.addHandler(FileHandler);
        SimpleFormatter sFormat = new SimpleFormatter();
        FileHandler.setFormatter(sFormat);

        int [] array = {18, 6, 44, 2, 56};
        boolean isSorted = false;
        int temp;
        String message;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    message = String.format("%s <<<>>> %s = %s", array[i], array[i+1], Arrays.toString(array));
                    logger.info(message);
                }
            }
        }
    }
    
}