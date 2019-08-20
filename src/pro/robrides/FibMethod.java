package pro.robrides;

import java.util.Set;
import java.util.TreeSet;

// Fibonacci with recursive method call and a Single Responsibility Principle approach

public class FibMethod {
	
	static int n1 = 0, n2 = 1, n3 = 0;

	static private Set<Integer> fibonacciSeries = new TreeSet<>();

	public static void main(String args[]) {

		int count = 10;

		System.out.println(n1 + "\n" + n2); // print 0 and 1

		calculateFibonacci(count);
		printFibonacciSeries(fibonacciSeries);

	}

	static void calculateFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			fibonacciSeries.add(n3);
			calculateFibonacci(count - 1);
		}
	}

	static void printFibonacciSeries(Set<Integer> fibNums) {
		for (Integer integer : fibNums) {
			System.out.println(integer);
		}
	}

}
