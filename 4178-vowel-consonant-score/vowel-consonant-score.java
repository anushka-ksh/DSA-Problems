class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        int score=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                v++;
            }else if(Character.isLetter(ch)){
                c++;
            }
        }
        if(c>0){
            score=Math.round(v/c);
        }else{
            return 0;
        }
        return score;
    }
}