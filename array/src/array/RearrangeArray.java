package array;
import java.util.Arrays;

public class RearrangeArray {
    public static void rearrange(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = nums[right--];
            } else {
                result[i] = nums[left++];
            }
        }
        System.arraycopy(result, 0, nums, 0, n); 
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        rearrange(nums);
        System.out.println(Arrays.toString(nums)); 
    }
}
