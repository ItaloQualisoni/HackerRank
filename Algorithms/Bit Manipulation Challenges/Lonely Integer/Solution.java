import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   static int lonelyinteger(int[] a) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       for (int i = 0; i< a.length; i++ ) {
	       if (list.contains(a[i])) {
              list.remove(new Integer(a[i]));
	       }
	       else{
		      list.add(a[i]);
	       }
        }
        return list.get(0);
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
