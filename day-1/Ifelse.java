// Given two integers, n and m. The task is to check the relation between n and m.

// Examples :

// Input: n = 4, m = 8
// Output: lesser
// Explanation: 4 < 8 so print 'lesser'.

// Input: n = 8, m = 8
// Output: equal
// Explanation: 8 = 8 so print 'equal'.

import java.util.*;
class Ifelse {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(compareNM(n,m));
    }

    public static String compareNM(int n, int m) {
        // code here
        if(n < m)
        {
            return "lesser";
        }
        else if( n > m)
        {
            return "greater";
        }
        else{
            return "equal";
        }
    }
}