package pro.robrides;

public class Basic {

	public static void main(String[] args) {
		
		// Fibonacci basic solution
		int x = 0, y = 1, n = x + y;
		
		System.out.println(n);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(x = n + y);
			n = y;
			y = x;
		}

	}

}
