package Day02;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {4,57,8,6,2,5};
        int k = 2;
        Arrays.sort(arr);
        int n = arr[arr.length-k];
        System.out.println(n);

    }
}
