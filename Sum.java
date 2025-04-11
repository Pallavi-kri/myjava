import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
         sum+=i;
        }
        System.out.println(+sum);

    }
}
