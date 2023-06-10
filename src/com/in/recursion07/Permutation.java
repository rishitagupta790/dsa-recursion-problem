package com.in.recursion07;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		String S = "ABC";
		System.out.println("Permutations of " + S + ":");
		printPermutations(S);
	}

	public static void printPermutations(String str) {
		int n = str.length();
		char[] chars = str.toCharArray();
		List<String> permutations = new ArrayList<>();
		permute(chars, 0, n - 1, permutations);

		for (String permutation : permutations) {
			System.out.println(permutation);
		}
	}

	public static void permute(char[] chars, int l, int r, List<String> permutations) {
		if (l == r) {
			permutations.add(new String(chars));
		} else {
			for (int i = l; i <= r; i++) {
				swap(chars, l, i);
				permute(chars, l + 1, r, permutations);
				swap(chars, l, i); // backtrack
			}
		}
	}

	public static void swap(char[] chars, int i, int j) {
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}
}
