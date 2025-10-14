package Day02;

import java.util.PriorityQueue;

public class KthLargest {
    public static int klargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(k+1);
        for(int i : arr){
            pq.add(i);
            if (pq.size()<k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,8,7,6};
        int k=2;
        klargest(arr, k);
    }
}
