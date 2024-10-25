package array;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 8};
        
        int[] mergedArray = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray)); 
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];
        
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

       
        while (i < n) {
            merged[k++] = arr1[i++];
        }
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}
