package com.bug_fixing;

public class BugFixing1 {

	 //return the character that occurs the most frequently in the given string
   //in case of more than one character satisfying the requirement, we need to
   //return the earliest character alphabetically
   String solution(String S) {
	   
       int[] occurrences = new int[26];
       for (char ch : S.toCharArray()) {
           occurrences[ch - 'a']++;
       }
       char best_char = 'a';
       int best_res = 0;
       for (int i = 0; i < 26; i++) {//changed i intialization to 0 
           if (occurrences[i] >best_res) { //changed condition to > from >=
               best_char = (char) ((int) 'a' + i);
               best_res = occurrences[i];
           }
       }
      
       return Character.toString(best_char);
   }
    
   
   public static void main(String[] args) {
    System.out.println("Char is : "+new BugFixing1().solution("apple"));
   	System.out.println("Char is : "+new BugFixing1().solution("hello")); 
    System.out.println("Char is : "+new BugFixing1().solution("parameter"));
    System.out.println("Char is : "+new BugFixing1().solution(""));
    System.out.println("Char is : "+new BugFixing1().solution("heeellooo"));
    System.out.println("Char is : "+new BugFixing1().solution("abcd"));
   	
   }
}
