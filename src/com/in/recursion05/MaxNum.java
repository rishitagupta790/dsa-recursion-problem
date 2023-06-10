package com.in.recursion05;

class ArrayMax {
	public int recursiveMax(int[] arr) {
		return max(arr, 0, arr.length - 1);
	}

	public int max(int[] arr, int start, int end) {
		if (start == end) {
			return arr[start];
		} else {
			int mid = (start + end) / 2;
			int maxLeft = max(arr, start, mid);
			int maxRight = max(arr, mid + 1, end);
			return Math.max(maxLeft, maxRight);
		}
	}

}

public class MaxNum {

	public static void main(String[] args) {
		ArrayMax am = new ArrayMax();
		int[] arrVal = { 2, 4, 3, 2, 8, 6 };
		int result = am.recursiveMax(arrVal);

		System.out.println(result);
	}

}
