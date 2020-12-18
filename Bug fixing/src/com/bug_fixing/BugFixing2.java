package com.bug_fixing;

import java.util.Arrays;

public class BugFixing2 {

	int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n && m!=0;) {//A=2,3,6,7 B=1,1,3,8//add m!=0
        	 if (A[k] == B[i]) 
                 return A[k];
             if (i < m-1  && B[i] < A[k])//change > to <
                i += 1;
             else
            	 k+=1;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		//int[] A = {2,3,6,7};
		//int[] B = {1,1,3,8};//3
		
		/*FIRST*/
		//int[] A = {1,3,6,7};
		//int[] B = {1,1,3,8};//1
		
		/*EMPTY*/
		//int[] A = {};
		//int[] B = {};//-1
		
		/*NO MATCH*/
		//int[] A = {2,3,6,7};
		//int[] B = {1,1,9,8};//-1
		
		/*ALL MATCH*/
		//int[] A = {2,2,2,2};
		//int[] B = {2,2,2,2};//2
		
		/*NEGATIVE MATCH*/
		//int[] A = {2,-3,6,7};
		//int[] B = {1,1,-3,8};//-3
		
		int[] A = {22,35,690873,73445};
		int[] B = {11,1,35,690873};
		System.out.println(new BugFixing2().solution(A, B));
	}
	
}