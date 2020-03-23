import java.util.Random;

public class QuickSort {
	static int divide(int arr[], int low, int high) {
		for (int j = low; j < high; j++) {
			if (arr[j] < arr[high]) {
				low++;
				int temp = arr[low - 1];
				arr[low - 1] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		return low;
	}

	static void sort(int arr[], int low, int high) {
		if (low < high) {
			int middle = divide(arr, low, high);
			sort(arr, low, middle - 1);
			sort(arr, middle + 1, high);
		}
	}

	private static Random rgen = new Random();

	public static void main(String args[]) {
		int arr[] = new int[1000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rgen.nextInt(300);
		}
		long startTime = System.nanoTime();
		sort(arr, 0, arr.length - 1);
		long endTime = System.nanoTime();
		System.out.println("Runtime is: " + (endTime - startTime));
	}

}
