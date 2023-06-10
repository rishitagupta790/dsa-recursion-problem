package com.in.recursion03;

class Natural {
	public int sum(int n) {
		if (n == 0)
			return 0;

		return n + sum(n - 1);

	}
}

public class Factorial {

	public static void main(String[] args) {
		Natural nat = new Natural();
		int result = nat.sum(6);
		System.out.println(result);
	}

}
