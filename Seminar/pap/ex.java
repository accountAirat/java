package Seminar.pap;

public class ex {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 1, 3,9,8};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 3) {
                nums[i]= nums[i+1];
                nums[i+1] = 3;
            }}
        System.out.println(" ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        
    }
    
}
