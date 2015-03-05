import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int max_line = in.nextInt();

		in.nextLine();

		for (int i = 0; i < max_line; i++) {
			System.out.println(solve(0,in.nextInt(),1));
		}
		in.close();
	}

	private static int solve(int start,int end ,int  height) {
		// TODO Auto-generated method stub
		if (start == end) {
			return height;
		}
		else if (start%2==0) {
			return solve(start+1, end, 2*height);
		}
		return solve(start+1, end, height+1);
	}
}