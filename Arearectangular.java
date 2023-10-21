import java.util.Scanner;

public class Arearectangular {
    public static void main(String args[])
    {
        int l,b,area;
        System.out.println("Enter the value of sides");
       Scanner sc=new Scanner(System.in);
       l =sc.nextInt();
       b =sc.nextInt();
       area=l*b;
       System.out.print("Area of rectangular"+area);
       sc.close();
    }
    
}
