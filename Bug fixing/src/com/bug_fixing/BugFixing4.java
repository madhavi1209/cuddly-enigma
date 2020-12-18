package com.bug_fixing;

public class BugFixing4 {

	//A - array of 0s and 1s
	//need to return the starting position of first sequence of the maximal occurrences of 1s
	//return -1 in case if the array does not contains 1s
	int solution(int[] A) {
		int n = A.length;    
		int i = n - 1;     
		int result = -1;
		int k = 0, maximal = 0;


		System.out.println("hello hello..how you doin 'broo'-> i added now ?");


		while (i > 0) {
			if (A[i] == 1) {
				k = k + 1;
				if (k >= maximal) {
					maximal = k;
					result = i;
				}
			} else
				k = 0;
			i = i - 1;
		}
		if (A[i] == 1 && k + 1 >= maximal) {   
			result = 0;
		}
			System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		int[] A = {0, 0,1,1, 1, 1, 1, 1, 0, 1, 1, 1, 1,1, 0, 1};
		int[] B=  {0,1,0,1,1,0,0,0,1,1,1};
		int[] C=  {0,0,0,0};
		int[] D=  {1,1,1,1};
		int[] E= {1,1,1,0,0,1,1,1,0,0}; 
		System.out.println(new BugFixing4().solution(A));
		System.out.println(new BugFixing4().solution(B));
		System.out.println(new BugFixing4().solution(C));
		System.out.println(new BugFixing4().solution(D));
		System.out.println(new BugFixing4().solution(E));
	}
}