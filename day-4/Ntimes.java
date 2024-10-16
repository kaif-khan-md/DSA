import java.util.*;

public class Ntimes{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        Nprint(num);
    }

    private static void Nprint(int n)
    {
        if(n == 0)
        {
            return ;
        }
        else{
            System.out.println("Hey");
            Nprint(n-1);
        }
    }
}