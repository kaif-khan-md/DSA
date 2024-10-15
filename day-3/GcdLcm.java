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

import java.util.*;

public class GcdLcm{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to check for gcd and lcm : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = check(a,b);
        System.out.println("The gcd is : " + result);
    }

    static int check(int a,int b){
        while(a > 0 && b > 0)
        {
            if(a > b)
            {
                a = a % b;
            }
            else{
                b = b % a;
            }
        }

        if(a == 0)
        {
            return b;
        }
    
    return a;
        
    }
}
