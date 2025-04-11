import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter First complex no:");
         a=obj.nextInt();
         System.out.println("+/-");
         b=obj.nextInt();
        System.out.println("Your input is"+a+"+"+b+"i");
        System.out.println("Enter Second complex no:");
         c=obj.nextInt();
         System.out.println("+/-");
         d=obj.nextInt();
         System.out.println("Your input is"+c+"+"+d+"i");
         int e=a+c;
         int f=b+d;
         System.out.println("sum is="+e+"+"+f+"i");
    }
}
