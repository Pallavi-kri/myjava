import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        int i,n,m=1;
        System.out.println("N:");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(i=1;i<=10;i++)
        {
            m=i*n;
            System.out.println(n+"*"+i+"="+m);
        }
    }
}
