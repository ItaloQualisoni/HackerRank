import java.util.Scanner;

public class Solution {

    public static int solve(String word){
        int output = 0;
    	for (int i = 0; i < word.length(); i++) {
			char pos_i = word.charAt(i);
            for (int j = i+1; j < word.length(); j++) {
                char pos_j = word.charAt(j);
                if(pos_i == pos_j){
                    i = j;
                    output++;
                }
                else{   
                    i = --j;
                    break;
                }
            }
		}
        
        return output;
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