import java.util.Scanner;

public class Sumaverage {
    public static void main(String[] args) 
    {
        int s=0,av=1,i,n,num;
        System.out.println("N= ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        System.out.println("Enter"+n+"element one by one:");
        for(i=1;i<=n;i++)
        {
           num= sc.nextInt();
           if(num%2 != 0)
           {
            s=s+num;
            av=s/n;
           }
            
        }
        System.out.println("Avrage="+av+"\nSum = "+s);
    }
}
