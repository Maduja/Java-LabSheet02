import java.util.Scanner;
public class q1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter width: ");
        int width=scan.nextInt();
        
        System.out.println("Enter height: ");
        int height=scan.nextInt();
        
        int area=width*height;
        
        System.out.println("The area is: "+area);
    }
    
}
