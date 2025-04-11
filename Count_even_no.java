import java.util.Scanner;

public class Count_even_no {
   public static void main(String[] args) {
    int n,i,count=0;
    System.out.println("N=");
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();
    for(i=1;i<=n;i++)
    {
        if(i%2==0)
         // if(i%5==0 && i%3 == 0)
        {
            System.out.println(i);
            count++;
        }
    }
    System.out.println("Totle even no is : "+count);
   } 
}
