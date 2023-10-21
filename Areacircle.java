import java.util.Scanner;

public class Areacircle {
    public static void main(String args[])
    {
        final double PI=3.14;
        int r, area;
        System.out.print("Enter the radius of circle");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=(int)(PI*r*r);   
        System.out.print("Area of circle"+area); 
        sc.close(); 
     }

}
