package Day02;

import java.util.Arrays;
import java.util.Scanner;

public class movenegative {
    public static int[] moveArray(int[] arr){
        int i=0; 
        int j = arr.length-1;
        while(i<j){
            while (i<j && arr[i]<0) {
                i++;
            }
            while (i<j && arr[j]>0) {
                j--;
            }

            if(j>i){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] ans = moveArray(arr);

        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
