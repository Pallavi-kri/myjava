import java.util.Scanner;

 public class Even{
    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter N:");
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0)
           // if(i%2 != 0)
            System.out.println(i);
        }
       /*  float x,y,z;
        x=Float.parseFloat(args[0]);
        y=Float.parseFloat(args[1]);
        z=x+y;
       // getText("Result: "+String.valueOf(z));
       System.out.println("z="+z);*/
    }
}