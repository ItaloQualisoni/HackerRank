import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static long calc(Long value){

    	long result = 0;
        long tmpValue = value;
    	long tmp = 0;
    	
        while(tmpValue > 0) {
            tmp = tmpValue % 10;
            if ( tmp != 0 &&(value%tmp)==0) {
				result++;
			}
            tmpValue /= 10;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Queue<Long> queue = new LinkedList<Long>();
    	
    	Scanner in = new Scanner(System.in);
        int max_line = in.nextInt();
        for(int i = 0 ; i< max_line;i++){
            queue.add(in.nextLong());
        }
       
        while (!queue.isEmpty()) {
			System.out.println(calc(queue.poll()));
		}
        in.close();
    }
}