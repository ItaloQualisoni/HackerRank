import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        int max = Integer.MIN_VALUE;
        for(int i = l ; i<= r ; i++){
            for(int j = i+1 ; j<=r ; j++){
            	//Calculate i xor j
                int xor = i^j;
            	if (max<xor) {
					max = xor;
				}
            }
            
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}