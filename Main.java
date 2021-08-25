import java.util.Scanner;
 class Largest{
    public void intMax(int a,int b,int c){
      if(a>b){
      

        if(a>c)
       System.out.println(a +"largest");
       else
       System.out.println(c+" is largest");
      
    }
    else if(b>c)
    System.out.println(b+" is largest");
    else 
    System.out.println(c+ " is largest");
}
public void floatMax(Double a,Double b,Double c){
    if(a>b){
    

      if(a>c)
     System.out.println(a +"largest");
     else
     System.out.println(c+" is largest");
    
  }
  else if(b>c)
  System.out.println(b+" is largest");
  else 
  System.out.println(c+ " is largest");
}

}

public class Main{
    public static void main(String args[]){
        
        Largest l1=new Largest();
        l1.floatMax(1.3, 3.6, 3.2);
 }
}