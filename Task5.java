import java.util.*;

public class KSmallestElement {

    public static int findKthSmallest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.add(num);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int result = findKthSmallest(arr, k);

        System.out.println("Kth smallest element: " + result);
    }
}
