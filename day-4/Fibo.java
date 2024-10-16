import java.util.*;

public class Fibo{
  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Fibo : ");
        System.out.print(fibo(num));
    }

    private static int fibo(int n)
    {
        if(n == 1 || n == 2)
        {
            return 1 ;
        }
        else{
            return fibo(n-1) + fibo(n-2);
            
        }
    }
}