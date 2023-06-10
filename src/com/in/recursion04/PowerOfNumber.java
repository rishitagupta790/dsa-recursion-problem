package com.in.recursion04;

class power {
	public int calci(int n, int p) {
		if (p == 1)
			return n;
		else
			return n * calci(n, p - 1);
	}
}

public class PowerOfNumber {

	public static void main(String[] args) {
		power pow = new power();
		int result1 = pow.calci(5, 2);
		int result2 = pow.calci(2, 5);

		System.out.println(result1);
		System.out.println(result2);
	}

}
