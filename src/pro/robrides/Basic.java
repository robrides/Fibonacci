package pro.robrides;

public class Basic {

	public static void main(String[] args) {
		
		// Fibonacci basic solution
		int n1 = 0, n2 = 1, n3 = 0;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for (int i = 0; i < 10; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}

	}

}
