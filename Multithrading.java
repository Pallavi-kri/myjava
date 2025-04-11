 import java.util.*;
 class A extends Thread
 {
 	public void run()
 	{
 		System.out.println("Start of thread A=>=>");
 		for(int i=1; i<=5 ; i++)
 	    	System.out.println("i="+i);
 	    	System.out.println("End of thread A****");
 	  
 	}
 }
  class B extends Thread
  {
  	public void run()
  	{
  		System.out.println("Start of thread B=>=>");
  		for(int j=1;j<=5;j++)
  			System.out.println("\t j="+j);
  		System.out.println("End of Thread B***");
  	}
  }	   
  class C extends Thread
  {
  	public void run()
  	{
  	System.out.println("Start of thread C=>=>");
  	for(int k=1;k<=5;k++)
  	 System.out.println("\t k="+k);
  	 System.out.println("End of Thread C***");
  }
 } 
 public class Multithrading
 {
 	public static void main(String args[])
 	{
 		A p=new A();
 		B q=new B();
 		C r=new C();
 		p.start();
 		q.start();
        r.start();
 	}
 } 