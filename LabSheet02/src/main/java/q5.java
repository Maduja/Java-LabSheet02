import java.util.Scanner;
public class q5 {
  public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter num1: ");
      int n1 = scan.nextInt();
      
      System.out.print("Enter num2: ");
      int n2 = scan.nextInt();
      
      int d1,d2,d3,d4;
      
      d1=n1/10;
      d2=n1%10;
      d3=n2/10;
      d4=n2%10;
      
      System.out.println("First num is: "+d2 +d1);
      System.out.println("Second num is: "+d4 +d3);
  }  
}
