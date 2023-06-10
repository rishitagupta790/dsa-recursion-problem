package com.in.recursion02;

class Natural {
	public int fact(int n) {
		if (n == 1)
			return 1;

		return n * fact(n - 1);

	}
}

public class SumOfNatural {

	public static void main(String[] args) {
		Natural nat = new Natural();
		int result = nat.fact(5);
		System.out.println(result);
	}

}
