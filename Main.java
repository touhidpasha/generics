import java.util.Scanner;
 class Largest{
    public void intMax(int... num){
      int max=0;
      for (int i: num)
      {
          if(i>max)
          max=i;
      }
      System.out.println(max +"largest");
}
public void floatMax(float... num){
    float max=0;
    for (float i: num)
    {
        if(i>max)
        max=i;
    }
    System.out.println(max +"largest");
}

}

public class Main{
    public static void main(String args[]){
        
        Largest l1=new Largest();
        l1.intMax(1,2,3,20,7);

 }
}