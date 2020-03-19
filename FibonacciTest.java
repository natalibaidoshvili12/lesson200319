package Fibo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {
	@Test
	public void test() {
		FibonacciSolution fibo = new FibonacciSolution();
		long ch = fibo.check(-3);
		assertEquals(0, ch);
	}

	@Test
	public void test1() {
		FibonacciSolution fibo = new FibonacciSolution();
		long ch = fibo.check(1);
		assertEquals(0, ch);
	}

	@Test
	public void test2() {
		FibonacciSolution fibo = new FibonacciSolution();
		long ch = fibo.check(2);
		assertEquals(1, ch);
	}

	@Test
	public void test3() {
		FibonacciSolution fibo = new FibonacciSolution();
		long ch = fibo.check(3);
		assertEquals(1, ch);
	}

	@Test
	public void test4() {
		FibonacciSolution fibo = new FibonacciSolution();
		long ch = fibo.check(4);
		assertEquals(2, ch);
	}

	@Test
	public void test5() {
		FibonacciSolution fibo = new FibonacciSolution();
		long ch = fibo.check(5);
		assertEquals(3, ch);
	}

	@Test
	public void test6() {
		FibonacciSolution fibo = new FibonacciSolution();
		long ch = fibo.check(6);
		assertEquals(5, ch);
	}

	@Test
	public void test7() {
		FibonacciSolution fibo = new FibonacciSolution();
		long ch = fibo.check(7);
		assertEquals(8, ch);
	}

	@Test
	public void test8() {
		FibonacciSolution fibo = new FibonacciSolution();
		long ch = fibo.check(8);
		assertEquals(13, ch);
	}
}
