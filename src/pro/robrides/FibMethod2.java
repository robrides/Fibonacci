package pro.robrides;

public class FibMethod2 {

	// Incredibly inefficient solution for Fibonacci
	
	public static long fibonacci(int n) {
		System.out.println(n);
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		for (int i = 0; i <= n; i++) {

			System.out.println(i + ": " + fibonacci(i));

		}
	}

}
