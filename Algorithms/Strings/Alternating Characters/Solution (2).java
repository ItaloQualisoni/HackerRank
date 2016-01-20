import java.util.Scanner;

public class Solution {

	public static int solve(String word){
    	if (goodWord(word)) {
			return 0;
		}
    	else{
    		return word.length()- count(word);
    	}
    }
	public static boolean goodWord(String word){
		for (int i = 0; i < word.length() -1; i++) {
			char pos_i = word.charAt(i);
			char pos_i_plus_one = word.charAt(i+1);
			if (pos_i == pos_i_plus_one) {
				return false;
			}
		}
		return true;
	}
	
    public static int count(String word){
    	int total = 1;
    	
    	for (int i = 0; i < word.length()-1; i++) {
        	char current = word.charAt(i);
			char next = word.charAt(i+1);
			if (current!=next) {
				total++;
			}
		}
    	return total;    	
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner in = new Scanner(System.in);
        int max_line = in.nextInt();
        in.nextLine();

        while (max_line-- > 0) {
        	System.out.println(solve(in.nextLine()));
		}
        
        in.close();
    }
}