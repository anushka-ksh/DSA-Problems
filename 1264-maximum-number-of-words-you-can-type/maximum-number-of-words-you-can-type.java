class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int typable=0;
        String[] str= text.split(" ");

        for(String word: str){
            boolean canBeTyped=true;
            for(char brokenChar: brokenLetters.toCharArray()){
                if(word.contains(String.valueOf(brokenChar))){
                    canBeTyped=false;
                    break;
                }

            }
            if(canBeTyped){
                typable++;  
            }
            
        }
        return typable;
    }
}