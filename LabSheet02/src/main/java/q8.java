import java.util.Scanner;
public class q8 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number in seconds: ");
        int num = scan.nextInt();
        
        int hours = num/3600;
        int x = num-3600;
        int min = x/60;
        int y = min * 60;
        int sec = x-y;
        
        System.out.println("Hours: "+hours);
        System.out.println("Minutes: "+min);
        System.out.println("Seconds: "+sec);
    }
}
