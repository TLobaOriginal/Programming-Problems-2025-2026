package RansomProblem;

import java.util.HashMap;

public class Problem {
    public static boolean canConstruct(String ransomNote, String magazine) {
        /* Create a hashmap storing the letters in the magazine
        and how many times each letter appears
        Loop through ransomNote and check it's letters one by one
        while reducing the values of the correspoding letter in the magazine hashmao
        
        False condition
        - If a letter cannot be found
        - If the value of a letter in the hashmap falls below 0
        
        True condition
        iteration completes without fail*/
        HashMap<Character, Integer> magazineDict = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char letter = magazine.charAt(i);
            if(!magazineDict.containsKey(letter)){
                magazineDict.put(letter, 1);
            }
            else{
                magazineDict.put(letter, magazineDict.get(letter) + 1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char letter = ransomNote.charAt(i);
            if(!magazineDict.containsKey(letter)){
                return false;
            }
            else{
                magazineDict.put(letter, magazineDict.get(letter) - 1);
                if(magazineDict.get(letter) == 0){
                    magazineDict.remove(letter);
                }
            }
        }

        return true;
    }
}
