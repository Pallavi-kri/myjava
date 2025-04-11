import java.util.Scanner;

public class compund {
 public static void main(String[] args) {
    System.out.println("Enter P ,R and T:");
    float p,r,t ;
    Scanner obj= new Scanner(System.in);
    p=obj.nextInt();
    r=obj.nextInt();
    t=obj.nextInt();
   double  ans=p*Math.pow(1+r/100, t);
    System.out.println("Ans="+ans);
 }
    
}
