import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	static HashMap<Long, Long> map = new HashMap<Long, Long>();
	
    private static long fib(long value){
        if(value == 0)
            return 0;
        if(value == 1)
            return 1;
        if (map.get(value)!= null) {
        	return map.get(value);
		}
        map.put(value, fib(value-1)+ fib(value-2));
        return map.get(value);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner in = new Scanner(System.in);
        int max_line = in.nextInt();
        for(int i = 0 ; i< max_line;i++){
            long aux = in.nextLong();
            int a = 0;
            while(true){
            	float res = fib(a++);
            	if (res== aux) {
					System.out.println("IsFibo");
					break;
				}
            	else if (res>aux) {
            		System.out.println("IsNotFibo");
					break;
				}
            }
        }
        in.close();
    }
}