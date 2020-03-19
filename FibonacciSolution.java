package Fibo;

public class FibonacciSolution {
	static int[] fib;

	public int check(int i) {
		return check2(i);
	}

	public int check2(int i) {
		fib = new int[i];
		for (int j = 0; j < i; j++) {
			if (j <= 1)
				fib[j] = j;
			else
				fib[j] = fib[j - 1] + fib[j - 2];
		}
		return fib[i-1];
	}

}
