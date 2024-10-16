// Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

// Examples
// Example 1:
// Input:N = 2
// Output:It is a prime
// Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
// Example 2:
// Input:N =10
// Output: Not a prime


import java.util.*;

public class Prime{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= num ; i++)
        {
           
            if(num % i == 0)
            {
                count += 1;
            }
        }

        if(count <= 2)
        {
            System.out.println("It is a prime");
        }
        else
        {
            System.out.println("Not a prime");
        }
    }
}