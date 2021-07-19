package array;

// This question can be solved with the help of Min heap and max heap as well

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_Smallest_element {

	public static void sol1(int[] arr, int k) {

		System.out.println("\n---------Solution 1-------------\n");
		Arrays.sort(arr);

		System.out.println("Kth Smallest Element " + arr[k - 1]);

	}

	public static void sol2_MinHeap(int[] arr, int k) {

		System.out.println("\n---------Solution 2-------------\n");
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i : arr)
			queue.add(i);

		while(--k>0)
			queue.poll();
		
		System.out.println("Kth Smallest element "+queue.peek());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		sol1(arr, k);
		sol2_MinHeap(arr,k);

	}

}
