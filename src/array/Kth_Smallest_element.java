package array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_Smallest_element {

	public static void sol1(int[] arr, int k) {

		System.out.println("\n---------Solution 1-------------\n");
		Arrays.sort(arr);

		System.out.println("Kth Smallest Element " + arr[k - 1]);

	}

	public static void sol2(int[] arr, int k) {

		System.out.println("\n---------Solution 2-------------\n");
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i : arr)
			queue.add(i);

		System.out.println(queue);
		int j = 0;
		if (j == k) {
			System.out.println("value of j "+j);
			System.out.println(queue.poll());
			return;
		}
		queue.poll();
		j++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		sol1(arr, k);
		sol2(arr,k);

	}

}
