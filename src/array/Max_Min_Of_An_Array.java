package array;

import java.util.Arrays;

public class Max_Min_Of_An_Array {

	public static void sol1(int[] arr) {
		System.out.println("---------Solution 1-------------\n");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}

		System.out.println("Max Value : " + max);
		System.out.println("Min value : " + min);
	}
	
	
	public static void sol2(int[] arr)
	{
		System.out.println("\n---------Solution 2-------------\n");
		Arrays.sort(arr);
		
		System.out.println("Max Value : "+arr[arr.length-1]);
		System.out.println("Min Value : "+ arr[0]);
		
		
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 70, 30, 5, 100 };
		sol1(arr);
		sol2(arr);

	}

}
