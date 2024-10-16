import java.util.*;

public class Fact{
  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Factorial : ");
        System.out.print(factorial(num));
    }

    private static int factorial(int n)
    {
        if(n == 0)
        {
            return 1 ;
        }
        else{
            return n * factorial(n-1);
        }
    }
}