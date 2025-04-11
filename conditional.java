import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= obj. nextInt();
        // if(a==0)
        // {
        //     System.out.println("Number is Zero");

        // }
        // else if(a>=0){
        //     System.out.println("Number is positive:");
        // }
        // else{
        //     System.out.println("Number is Negative ");
        // }
        if(a%2==0)
        {
            System.out.println("no is even");
        }
        else{
            System.out.println("no is odd");
        }
    }
}
