/* Sample program illustrating input/output methods */
import java.util.*;

class Solution{
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
      
      int N, K;
      N = in.nextInt();
      K = in.nextInt();
      
      int C[] = new int[N];
      for(int i=0; i<N; i++){
         C[i] = in.nextInt();
      }
       
      Arrays.sort(C);
      
      int result = 0 , quantity = 0,turn = K;
       
       for(int i=N-1; i>=0; i--){
           turn--;
           //System.out.println( quantity+ ";"+ C[i] + ": "+  calculate(quantity,C[i]) );
           result += calculate(quantity,C[i]);
           if(turn == 0){
               turn = K;
               quantity++;               
           }
       }
       
      System.out.println( result );
      
   }
    
   public static int calculate(int quantity,int flowerPrice){
       return (quantity+1)*flowerPrice;
   }
}