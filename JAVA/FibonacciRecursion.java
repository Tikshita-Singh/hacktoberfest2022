public class FibonacciRecursion_ {

	public static void main(String[] args) {
		int n = 7;
		int ans = fibo(n);
		System.out.println(ans);
	}

	static int fibo(int n) {
		//base case
		if(n<2) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}

}
