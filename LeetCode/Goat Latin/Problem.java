package Goat Latin;

import java.util.HashSet;

class Problem {
    public String toGoatLatin(String sentence) {
        /** 1. We will split the array
            2.  */

        if(sentence.length() == 0){
            return "";
        }
        String[] words = sentence.split(" ");
        HashSet<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');

        StringBuilder result = new StringBuilder();
        int counter = 1;
        int wordCount = 0;
        for(String word: words){
            if(vowelSet.contains(word.toLowerCase().charAt(0))){
                word += "ma";
            }
            else{
                word = word.substring(1) + word.charAt(0) + "ma";
            }

            for(int i = 0; i < counter; i++){
                word += "a";
            }
            wordCount++;
            if(wordCount == words.length){
                result.append(word);
            }
            else{
                result.append(word + " ");
            }
        }
        return result.toString();
    }
}
