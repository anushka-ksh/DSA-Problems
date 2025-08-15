class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list1= new ArrayList<>();
        List<String> smolList= new ArrayList<>();
        backtrack(0, s, smolList, list1);
        return list1;
    }
    void backtrack(int idx, String s,List<String> smolList, List<List<String>>list1){
        if(idx==s.length()){
            list1.add(new ArrayList<>(smolList));
            return;
        }
        for(int i=idx; i<s.length(); i++){
            if(isPalindrome(s,idx,i)){
                smolList.add(s.substring(idx,i+1));
                backtrack(i+1, s, smolList,list1);
                smolList.remove(smolList.size()-1);
            }
        }
    }
    boolean isPalindrome(String s, int a, int b){
        while(a<b){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}