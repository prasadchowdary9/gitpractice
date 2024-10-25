package array;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int rotations = 2;
		int[] arr = {1,2,3,4,5};
	 rotatedArray(arr,rotations);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotatedArray(int[] arr, int k) {
		int len = arr.length;
		k=  k%len;
		reverse(arr,0,len-1);
		reverse(arr,0,k-1);
		reverse(arr,k,len-1);
		
	
		
	}

	private static void reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		
	}

}
