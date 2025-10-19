package Day03;

import java.util.*;

public class unionArray{
    public static ArrayList<Integer> findUnion(int[] a, int[] b){
        ArrayList<Integer> result = new ArrayList<>();
        int i=0, j=0;
        int n = a.length, m = b.length;

        while(i<n && j<m){
            if(a[i]<b[j]){
                addIfNotDuplicate(result, a[i]);
                i++;
            } else if(b[j]<a[i]){
                addIfNotDuplicate(result, b[j]);
                j++;
            } else{
                addIfNotDuplicate(result, a[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            addIfNotDuplicate(result, a[i]);
            i++;
        }
        while(j<m){
            addIfNotDuplicate(result, b[j]);
            j++;
        }
        return result;
    }

    private static void addIfNotDuplicate(ArrayList<Integer> list, int num){
        if(list.isEmpty() || list.get(list.size()-1) !=  num){
            list.add(num);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,4};
        int[] b = {1,1,4,4};
        System.out.println(findUnion(a, b));
    }
}