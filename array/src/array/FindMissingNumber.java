package array;
public class FindMissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 2, 8, 4}; 
        System.out.println(missingNumber(nums)); 
    }
}
