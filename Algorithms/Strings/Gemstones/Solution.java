import java.util.*;

public class Solution {
    
    public static class Word{
        String word;
        Map<Character,Integer> dictionary;
        
        public Word(String word){
            this.word = word;
            fillDictionary();
        }
        
        public String getWord(){
            return this.word;
        }
        
        public Map<Character,Integer> getDictionary(){
            return this.dictionary;
        }
        
        private void fillDictionary(){
            this.dictionary = new HashMap<Character,Integer>();
            for (int i = 0; i < this.word.length(); i++) {
                dictionary.put(word.charAt(i), 1);
            }
        }
        
    }
    
    public static int solve(List<Word> wordList){
        int output = 0;
        
        Map<Character,Integer> outputMap = new HashMap<Character,Integer>();
        
        for(Word word : wordList){
            
            for ( Character character : word.getDictionary().keySet()) {
                if(outputMap.containsKey(character)) {
                    Integer val = outputMap.get(character);
                    outputMap.put(character, val + 1);
                }
                else
                    outputMap.put(character, 1);
            }

        }
        
        for ( Integer quantity : outputMap.values() ) {
            if(quantity == wordList.size()){
                output++;
            }
        }
        
        return output;

    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner in = new Scanner(System.in);
        int max_line = in.nextInt();
        in.nextLine();
        
        List<Word> wordList = new ArrayList<Word>();
        
        while (max_line-- > 0) {
        	wordList.add(new Word(in.nextLine()));
		}
        
        System.out.println(solve(wordList));
        
        in.close();
    }
}