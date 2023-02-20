package Seminar.seminar_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = fillArray();
        System.out.println(percentUniq(arr));
        
        }
        
        public static ArrayList<Integer> fillArray() {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
        nums.add(ThreadLocalRandom.current().nextInt(0, 25));
        }
        return nums;
        }
        
        public static Float percentUniq(ArrayList<Integer> nums) {
        Set<Integer> set = new HashSet<>(nums);
        return (set.size() * 100) / (float)nums.size();
        }
}
