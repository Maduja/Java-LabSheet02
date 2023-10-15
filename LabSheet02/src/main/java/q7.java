import java.util.Scanner;
public class q7 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter temperature in celsius: ");
        float C_temp = scan.nextFloat();
        
        float K_temp = ((9/5)* C_temp+32);
        
        System.out.print("Temperature in Kelvin: "+K_temp);
    }
}
