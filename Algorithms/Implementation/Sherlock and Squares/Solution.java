import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static void solve(String line){
    	int count = 0;
    	//System.out.println(line.split(" ")[1]);
    	int low =  Integer.parseInt(line.split(" ")[0]); 
    	int high = Integer.parseInt(line.split(" ")[1]);
    	
    	for (int i = 0; i*i<=high; i++) {
    		if (i*i>=low) {
        		count++;	
			}
		}
    	System.out.println(count);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Queue<String> queue = new LinkedList<String>();

    	
    	Scanner in = new Scanner(System.in);
        int max_line = in.nextInt();
        in.nextLine();
        
        while (max_line-- > 0) {
        	 queue.add(in.nextLine());
		}
        
        while (!queue.isEmpty()) {
			solve(queue.poll());
		}
        in.close();
    }
}