package Day02;

import java.util.Arrays;
import java.util.Scanner;

public class rotate {
    public static void rotateArray(int[] arr){
        int i=0, j=arr.length-1;
        while(i!=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        rotateArray(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
