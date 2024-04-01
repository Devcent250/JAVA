
package randomexample;

import java.util.Random;

public class RandomExample {

     public static void main(String[] args) {
      //Pseudo-random number example 
      Random generetor = new Random();
      int i = generetor.nextInt(10);
      System.out.println(i);
        i = generetor.nextInt(10);
      System.out.println(i);
       i = generetor.nextInt(10);
      System.out.println(i);
      
      
    }
    
}
