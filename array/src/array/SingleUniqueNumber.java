package array;

public class SingleUniqueNumber {
	public static void main(String[] args) {
		int[] nums = {4, 1, 2, 1, 2};
        System.out.println(findSingle(nums)); // Output: 4
	}

	private static int findSingle(int[] nums) {
		int res= 0;
		for(int i:nums) {
			res = res^i;
		}
		return res;
	
		
	}

}
