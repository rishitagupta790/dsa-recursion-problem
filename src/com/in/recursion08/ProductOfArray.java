package com.in.recursion08;

class Product {
	int eval(int[] arr) {
		return pro(arr, arr.length - 1);
	}

	public int pro(int[] arr, int i) {
		if (i < 0) {
			return 1;
		} else {
			return arr[i] * pro(arr, i - 1);
		}
	}

}

public class ProductOfArray {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		Product pd = new Product();
		int ans = pd.eval(ar);
		System.out.println(ans);
	}

}
