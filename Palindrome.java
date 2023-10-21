import java.util.Scanner;

public class Palindrome
{
   public static void main(String[] args)
   {
      int num, rev=0, rem, temp;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = sc.nextInt();
      
      temp = num;
      while(temp!=0)
      {
         rem = temp%10;
         rev = (rev*10) + rem;
         temp = temp/10;
      }
      
      if(num==rev)
         System.out.println("\nIt is a Palindrome Number.");
      else
         System.out.println("\nIt is not a Palindrome Number.");
         sc.close();
   }
}