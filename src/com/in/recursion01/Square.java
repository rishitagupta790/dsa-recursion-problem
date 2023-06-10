package com.in.recursion01;

class Check {
	public boolean passVal(int n) {

		if (n <= 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		if (n % 2 != 0) {
			return false;
		}
		return passVal(n / 2);

	}
}

public class Square {

	public static void main(String[] args) {
		Check check = new Check();
		boolean result = check.passVal(10);
		System.out.println(result);

	}

}
