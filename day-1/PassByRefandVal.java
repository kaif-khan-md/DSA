//https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pass-by-reference-and-value
// This is the solution  for the problem mentioned in the link above

// Geek is learning about functions and calling a function with arguments. He learns that passing can take one of two forms: pass by value or pass by reference.

// Geek wishes to add 1 and 2, respectively, to the parameter passed by value and reference. Help Geek in fulfilling his goal.

// Example 1:

// Input:
// a = 1
// b = 2
// Output:
// 2 4
// Explanation: 1 was passed by value whereas 2 passed by reference.

class Solution {
    static int[] passedBy(int a, int b) {
        // code here
        int[] arr = {a+1,b+2};
        return arr;
    }
}
