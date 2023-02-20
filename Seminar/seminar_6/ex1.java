package Seminar.seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ex1
 */
public class ex1 {

    public static void main(String[] args) {

        // Хранит очередность в своем порядке
        Set<Integer> nums = new HashSet<>(Arrays.asList(1, 2000, 3, 2, 4, 50000, 60, 3));
        System.out.println(nums);
        
        // Сохраняет очередность ввода
        Set<Integer> linkSet = new LinkedHashSet<>(Arrays.asList(1, 2000, 3, 2, 4, 500000, 6, 3));
        System.out.println(linkSet);
        }
}