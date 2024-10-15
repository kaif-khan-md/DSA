

// Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

// Examples
// Example 1:
// Input:N = 153
// Output:True
// Explanation: 13+53+33 = 1 + 125 + 27 = 153
// Example 2:
// Input:N = 371
// Output: True
// Explanation: 33+53+13 = 27 + 343 + 1 = 371


import java.util.*;

public class Armstrong{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        if(armstrong(num))
        {
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }

    static boolean armstrong(int num){
        int n=num,rem,sum=0;

        while(n > 0)
        {
            rem = n % 10;
            sum += rem*rem*rem;
            n = n / 10;
        }
        if(sum == num)
        {
            return true;
        }
        else{
            return false;
        }
    }
}