package Day01;

public class MinMaxArray {
    public static int[] minMax(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            } else if(arr[i]>max){
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }
    public static void main(String[] args) {
        int[] arr = {4,8,9,7,6,3};
        int[] result = minMax(arr);
        System.out.println("Min: "+result[0]);
        System.out.println("Max: "+result[1]);
    }
}
