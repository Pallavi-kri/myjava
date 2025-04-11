import java.util.Scanner;
class Array
{
 public static void main(String[] args) {
     int arr[];
     int n,i;
     Scanner sc=new Scanner(System.in);
     System.out.print("N=");
     n=sc.nextInt();
     arr=new int[n];
     System.out.println("Now, enter "+n+" elements one by one:");
     for(i=0;i<arr.length;i++)
     {
     	arr[i]=sc.nextInt();
     }
     System.out.println("The elements of array are:");
       for(int elements:arr)
       {
       	System.out.println(elements+" ");
       }
      // for( i=0;i<n;i++)
      // {
      //     System.out.println(arr[i]);
      // }

  }
}