import java.util.*;

public class Asc{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int i = 1;
        System.out.println("Ascending Order : ");
        ascending(i,num);
    }

    private static void ascending(int i ,int n)
    {
        if(i == n +1)
        {
            return ;
        }
        else{
            System.out.println(i);
            ascending(i+1,n);
        }
    }
}