import java.util.Scanner;
 class Largest<T>{
    public static <T extends Comparable<T>> void findLargest(T x, T y, T z) {
        T max = x; // assume x is initially the largest
    
        if (y.compareTo(max) > 0)
          max = y; // y is the largest so far
    
        if (z.compareTo(max) > 0)
          max = z; // z is the largest
    
        System.out.println("largest is "+max);//largest object

      } 
}




public class Main{
    public static void main(String args[]){
        
        Largest l1=new Largest();
        l1.findLargest(1,2,3);
        l1.findLargest("touhid","pasha", "hello");

 }
}