import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        int m=0;
        for(int i=2;i<=2;i++)
        {
            if(n%i==0)
            {
                m=m+1;
            }
        }
        if(m==0)
        {
            System.out.println(n+"prime no");
        }
        else{
            System.out.println(n+"not a prime no");
        }
    
        scanner.close();
    }
}