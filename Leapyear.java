import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int year = 2018;
    if((year%400==0)||(year%4==0 &&year%100!=0)){
        System.out.println("leap year");
    }
    else
    {
        System.out.println("not a leap year");
    }
    sc.close();
}
}