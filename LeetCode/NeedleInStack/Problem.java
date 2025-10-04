package NeedleInStack;

public class Problem {
    /*public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        
        Attempt number 1 tried to use a sliding window method
        Howeever, I encountered an issue with the edge case
        Without realising it, I had a passed an new start and then met a dead end.
        The problem is then that there was no way to backtrack.

        Meaning, we need to see if there's a way to 'store memory in quotes'.
        int index = -1;
        int counter = 0;

        for(int i = 0; i < haystack.length(); i++){
            if(needle.charAt(counter) == haystack.charAt(i)){
                if(counter == 0){
                    index = i;
                }
                counter++;
            }
            else{
                if(needle.charAt(0) == haystack.charAt(i)){
                    index = i;
                    counter = 1;
                }
                else{
                    index = -1;
                    counter = 0;
                }
            }

            if(counter == needle.length()){
                return index;
            }
        }

        return index;
    }*/

    public static int strStr(String haystack, String needle) {
        /*Well we can throw a hashmap at it! Let's make a string builder
         * Although this may destroy our memory, we can still do it.
         * As I am even thinking about it, we could use recursion but this will most likely sheg our run time
         */
        int needleSize = needle.length();
        int haystackSize = haystack.length();
        if(needleSize > haystackSize){
            return -1;
        }
        if(needleSize == 0){
            return 0;
        }
        
        for(int i = 0; i <= haystackSize - needleSize; i++){
            int j = 0;
            while(j < needleSize){
                
            }
        }


        return -1;
    }
}
