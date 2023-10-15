import java.util.Scanner;
public class q3 {
     public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter your length in kilometers: ");
         float L_kilo = scan.nextFloat();
         
         float L_met = L_kilo * 1000;
         
         System.out.println("Entered length in meters: "+L_met);
         
         
     }
    
}
