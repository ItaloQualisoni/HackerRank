import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        
        Arrays.sort(prices);
        
        int totalPaid = 0 , answer = 0;
        
        for(int i=0;i<n;i++){
            
            if(prices[i] + totalPaid > k){
                continue;
            }
            else{
                totalPaid += prices[i];
                answer++;
            }
            
        }
   
        // Compute the final answer from n,k,prices 
        System.out.println(answer);
    }
}
