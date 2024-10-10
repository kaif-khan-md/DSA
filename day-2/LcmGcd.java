//the solution for the given code below is found here
//https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1


// Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD. The function takes two integers a and b as input and returns a list containing their LCM and GCD.

// Example 1:

// Input: a = 5 , b = 10
// Output: 10 5
// Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
// Input: a = 14 , b = 8
// Output: 56 2
// Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
// Expected Time Complexity: O(log(min(a, b))
// Expected Auxiliary Space: O(1)

class Solution {
    static Long[] lcmAndGcd(Long A , Long B) 
    {
            Long gcd = gcd(A,B);

            Long lcm  = (A*B)/gcd;
            Long [] ans = new Long[2];
            ans[0] = lcm;
            ans[1] = gcd;
            return ans;
    }
    static Long gcd(Long A, Long B){
            while(B!=0)
            {
                Long temp = B;
                B=A%B;
                A=temp;
            }
            return A;
    }
};