package array;

public class ReverseArray {

	public static void reverse_Array_Sol1(int[] arr) {

		System.out.println("Reversing Method 1");
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(" " + arr[i]);
		System.out.println("\n");

	}

	public static void reverse_Array_Sol2(int[] arr) {

		System.out.println("Reversing Method 2");

		int start = 0;
		int end = arr.length - 1;
		reverse_Array(arr, start, end);
		
		for (int i : arr)
			System.out.print(" " + i);

	}

	private static void reverse_Array(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		reverse_Array_Sol1(arr);
		reverse_Array_Sol2(arr);

	}

}
