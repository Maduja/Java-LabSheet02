import java.util.Scanner;
public class q2 {
     public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter n1: ");
         int n1=scan.nextInt();
         
         System.out.println("Enter n2: ");
         int n2=scan.nextInt();
         
         System.out.println("Enter n3: ");
         int n3=scan.nextInt();
         
         float avg=(n1+n2+n3)/3;
         
         System.out.print("The average is: "+avg);
     }
}
