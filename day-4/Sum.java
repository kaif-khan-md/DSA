import java.util.*;

public class Sum{
  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Sum : ");
        System.out.print(add(num));
    }

    private static int add(int n)
    {
        if(n == 0)
        {
            return 0 ;
        }
        else{
            return n + add(n-1);
        }
    }
}