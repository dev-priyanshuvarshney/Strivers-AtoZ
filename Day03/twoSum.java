package Day03;

public class twoSum {

    public static int[] sum(int[] a, int target){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {5,8,11,2};
        int target = 13;

        int[] result = sum(arr, target);

        for(int i:result){
            System.out.print(i+" ");
        }

    }
}
