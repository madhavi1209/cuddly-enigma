package com.bug_fixing;

import java.util.Arrays;

public class BugFixing3 {

	//check if the array contains every number from 1 to K atleast once
	public boolean solution(int[] A, int K) {
		int n = A.length;
		Arrays.sort(A);
		for (int i = 0; i < n - 1; i++) {
			System.out.println("value of i : "+i);
			if (A[i] + 1 < A[i + 1])
				return false;
		}
		if (A[0] != 1 || A[n - 1] != K)//change && to ||
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		int[] A = {1, 1, 2, 2, 3};
		int K = 3;
		System.out.println(new BugFixing3().solution(A, K));
	}
}
