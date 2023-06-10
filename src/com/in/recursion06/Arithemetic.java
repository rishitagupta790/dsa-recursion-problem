package com.in.recursion06;

class LenoAns {
	int result(int val, int diff, int seri) {
		return val + (seri - 1) * diff;
	}

	int findNthTerm(int a, int d, int N) {
		if (N == 1) {
			return a;
		} else {
			return findNthTerm(a + d, d, N - 1);
		}
	}
}
public class Arithemetic {

	public static void main(String[] args) {
		int A=2;
		int D=1;
		int N=5;
		//using formula
		LenoAns la= new LenoAns();
		int show=la.result(A, D, N);
		System.out.println(show);
		
		//using recursion
		int sho= la.findNthTerm(A, D, N);
		System.out.println(sho);
	}

}
