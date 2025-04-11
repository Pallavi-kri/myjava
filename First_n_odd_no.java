import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class First_n_odd_no {
    public static void main(String[] args) {
        int n,i=1,count=0,s=0,av=1;
        System.out.println("N=");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(count=0;count<n; )  
        {
            if(i%2 != 0)
            {
                System.out.println(i);
                count++;
                s=s+i;
            }
            
             i++;
             av=s/n;
            
        }
        System.out.println("sum=" +s+"\nAvreage="+av);
    }
   
    
}
