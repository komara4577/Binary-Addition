
//By Kevin O'Mara
import java.util.Scanner;

public class BinaryAddition{
   public static void main (String []args){
      Scanner input = new Scanner(System.in);
      
      int i = 0, carry = 0;
      int[] sum = new int[10];
      
      
      System.out.print("Enter first binary number:");
      long b1 = input.nextLong();
      
      System.out.print("Enter second binary number:");
      long b2 = input.nextLong();
      
      input.close();
     if(isBinary(b1, b2) == true){ 
         while(b1 != 0 || b2 != 0){
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
            
         }
         if(carry != 0){
            sum[i++] = carry;
         }
         --i;
         System.out.print("Output: ");
         while(i >= 0){
            System.out.print(sum[i--]);
         }
         System.out.print("\n");
      }
      else
         System.out.print("Numbers entered are not binary.");
   }
   
   public static boolean isBinary(long a, long b){
      long x = a;
      long y = b;
      
      while(x != 0){
         if(x % 10 > 1){
            return false;
         }
         x = x / 10;
      }
      while(y != 0){
         if(x % 10 > 1){
            return false;
         }
        y = y /10;
      }
      return true;
   }
}
