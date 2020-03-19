class fibonacciPython :
	def check(int i) 
		long[] fib = new long[i + 1]
		if i <= 0
			return 0
		return check2(i, fib)

	def check2(int i, long fib[]) {
		if i <= 1 :
			fib[i] = 0
			return fib[i]
		elif i == 2 :
			fib[i] = 1
			return fib[i]
		else :
			fib[i] = check2(i - 1, fib) + check2(i - 2, fib)
		return fib[i - 1] + fib[i - 2]
