package Fibo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {
	@Test
	public void test() {
		FibonacciSolution fibo = new FibonacciSolution();
		int ch = fibo.check(1);
		assertEquals(0, ch);
	}

	@Test
	public void test2() {
		FibonacciSolution fibo = new FibonacciSolution();
		int ch = fibo.check(2);
		assertEquals(1, ch);
	}

	@Test
	public void test3() {
		FibonacciSolution fibo = new FibonacciSolution();
		int ch = fibo.check(3);
		assertEquals(1, ch);
	}

	@Test
	public void test4() {
		FibonacciSolution fibo = new FibonacciSolution();
		int ch = fibo.check(4);
		assertEquals(2, ch);
	}

	@Test
	public void test5() {
		FibonacciSolution fibo = new FibonacciSolution();
		int ch = fibo.check(5);
		assertEquals(3, ch);
	}
}
