import java.util.Scanner;

public class Main {
    public static int singleNumber(int[] nums) {
        // Your code goes here
        java.util.Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i+= 2) {
                if (nums[i] != nums[i + 1]) {
                    count = nums[i];
                    //break;
            }
        }
        if (count == 0) {
            count = nums[nums.length - 1];
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num = input.nextInt();
        int[] array = new int[num];
        int temp = 0;
        System.out.println("Enter the element inside array :");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        System.out.println(singleNumber(array));
    }
}