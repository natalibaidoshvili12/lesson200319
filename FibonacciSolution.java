package Fibo;

public class FibonacciSolution {

	public long check(int i) {
		long[] fib = new long[i];
		return check2(i, fib);

	}

	public long check2(int i, long fib[]) {
		if (i <= 0)
			return 0;
		if (i == 1) {
			fib[i - 1] = 0;
		} else if (i == 2) {
			fib[i - 1] = 1;
		} else {
			fib[i - 1] = check2(i - 1, fib) + check2(i - 2, fib);
		}
		return fib[i - 1];
	}

}
