package array;

// Dutch National flag Algo

public class Sort_Array_Os_1s_2s {

	public static void sol1(int[] arr) {
		System.out.println("\n---------Solution 1-------------\n");
		int count0s = 0;
		int count1s = 0;
		int count2s = 0;

		for (int i : arr) {
			if (i == 0)
				count0s++;
			if (i == 1)
				count1s++;
		}

		count2s = arr.length - (count0s + count1s);

		for (int j = 0; j < count0s; j++)
			arr[j] = 0;

		for (int k = count0s; k < arr.length - (count0s); k++)
			arr[k] = 1;

		for (int l = arr.length - (count2s); l < arr.length; l++)
			arr[l] = 2;

		for (int i : arr)
			System.out.print(i);

	}

	public static void sol2(int[] arr) {
		System.out.println("\n---------Solution 2-------------\n");
		
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		

		while (mid <= end) {
//			for swapping 0 & 1
			if (arr[mid] ==0) {
				swap(arr, start, mid);
				start++;
				mid++;
			} else if (arr[mid] ==2) {
				swap(arr, mid, end);
				end--;
			} else
				mid++;
		}
		
		for (int i : arr)
			System.out.print(i);

	}

	private static void swap(int[] arr, int start, int mid) {
		
		
		int temp=arr[start];
		arr[start]=arr[mid];
		arr[mid]=temp;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 0, 0, 1, 2, 0 };
		sol1(arr);
		sol2(arr);
		// TODO Auto-generated method stub

	}

}
