import java.util.Scanner;
public class HollowTriangle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int rows=sc.nextInt();     
for(int i=1; i<=rows; i++){
  for(int j=1; j<=i; j++){
  
  if(j==1 || j==i || i==rows){
     System.out.print("*");  
     }
     else{
     System.out.print(" ");
     sc.close();
}
}
System.out.println();}
}
}