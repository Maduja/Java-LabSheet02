import java.util.Scanner;
public class q6 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int n = scan.nextInt();
        
        int add,sub,div,mul,rem,max,min,d1,d2;
        
        d1=n/10;
        d2=n%10;
        add=d1+d2;
        sub=d1-d2;
        div=d1/d2;
        mul=d1*d2;
        rem=d1%d2;
        max=(d1>d2)?d1:d2;
        min=(d1>d2)?d2:d1;
        
        
        System.out.println("addition is: "+add);
        System.out.println("substraction is: "+sub);
        System.out.println("division is: "+div);
        System.out.println("multiplication is: "+mul);
        System.out.println("Remainder is: "+rem);
        System.out.println("Lager is: "+max);
        System.out.println("Smaller is: "+min);
        System.out.println("Reverse is: "+d2 +d1);
    }
}
