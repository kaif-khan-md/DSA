//https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
// This is the solution  for the problem mentioned in the link above

// Problem statement
// The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

//     F(n) = F(n - 1) + F(n - 2), 
//     Where, F(1) = 1, F(2) = 1


// Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.

// "Indexing is start from 1"


// Example :
// Input: 6
// Output: 8

import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    System.out.print(fibo(n));
	}
     public static int fibo(int n)
	 {
		 if(n == 1 || n == 2)
		 return 1;
		 else
		 return fibo(n-1) + fibo(n-2);
	 }
		
	}
