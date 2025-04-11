import java.util.*;
public class Threads {
    public static void main(String[] args) {
        Thread thread =new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("hello,world!");
                }
                try{
                    Thread.sleep(300000);
                }
                catch(InterruptedException e){
                    System.out.println("Thread interruptrd");
                }
            }
        };
        thread.start();
    }
}
