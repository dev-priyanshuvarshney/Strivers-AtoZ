package Day03;

import java.util.Arrays;

public class mergeSorted{

    public static void mergeArray(int[] a, int[] b){
        int i = a.length-1;
        int j=0;

        while (i>=0 && j<b.length) {
            if(a[i]<b[j]){
                i--;
            } else{
                int temp = b[j];
                b[j]=a[i];
                a[i]=temp;
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,6};
        int[] b = {5,3};

        mergeArray(a, b);

        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i : b){
            System.out.print(i+" ");
        }
    }
}