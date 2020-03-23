import java.util.Random;

public class RadixSort {
	static int maxNumber(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

	static void countSort(int arr[], int temp) {
		int arr2[] = new int[arr.length];
		int place[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < arr.length; i++)
			place[(arr[i] / temp) % 10]++;
		for (int i = 1; i < 10; i++)
			place[i] += place[i - 1];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[place[(arr[i] / temp) % 10] - 1] = arr[i];
			place[(arr[i] / temp) % 10]--;
		}
		for (int i = 0; i < arr.length; i++)
			arr[i] = arr2[i];
	}

	static void radixSort(int arr[]) {
		int m = maxNumber(arr);
		for (int i = 1; m / i > 0; i *= 10)
			countSort(arr, i);
	}

	private static Random rgen = new Random();

	public static void main(String[] args) {
		int arr[] = new int[1000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rgen.nextInt(300);
		}
		long startTime = System.nanoTime();
		radixSort(arr);
		long endTime = System.nanoTime();
		System.out.println("Runtime is: " + (endTime - startTime));
	}
}
