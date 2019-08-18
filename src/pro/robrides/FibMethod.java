package pro.robrides;

public class FibMethod {

	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String args[]) {

		int count = 10;

		System.out.println(n1); // print 0
		System.out.println(n2); // print 1

		printFibonacci(count - 2); // 2 numbers are already printed

	}

	static void printFibonacci(int count) {

		if (count > 0) {

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			System.out.println(n3);
			printFibonacci(count - 1);
		}
	}
}
