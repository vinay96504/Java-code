import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number: \n");
        int a = sc.nextInt();
       System.out.print("Enter second number:\n ");
       int b = sc.nextInt();
       for(int n=a;n<=b;n++)
        {
        int m=0;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                m=m+1;
            }
        }
        if(m==0)
        {
            System.out.println(n); 
        }
        
        sc.close();
    }
}
}