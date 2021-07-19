package array;

import java.util.Arrays;

public class Move_All_Negative_Numbers_to_the_Begining {

	public static void sol1(int[] arr) {
		System.out.println("\n---------Solution 1-------------\n");
		Arrays.sort(arr);

		for (int i : arr)
			System.out.print(" " + i);

	}

	public static void sol2(int[] arr) {

		System.out.println("\n---------Solution 2-------------\n");
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			if (arr[start] < 0 && arr[end] < 0) {
				start++;
			} else if (arr[start] > 0 && arr[end] < 0) {
				swap(arr, start, end);
				start++;
				end--;
			} else if (arr[start] > 0 && arr[end] > 0) {
				end--;
			} else {
				start++;
				end--;
			}
		}

		for (int i : arr)
			System.out.print(" " + i);
		

	}

	private static void swap(int[] arr, int start, int end) {
		// TODO Auto-generated method stub

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

	}

	public static void main(String[] args) {

		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		sol1(arr);
		sol2(arr);

	}

}
