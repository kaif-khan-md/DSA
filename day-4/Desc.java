import java.util.*;

public class Desc{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Descending Order : ");
        descending(num);
    }

    private static void descending(int n)
    {
        if( n == 0)
        {
            return ;
        }
        else{
            System.out.println(n);
            descending(n-1);
        }
    }
}