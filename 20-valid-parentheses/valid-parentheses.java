class Solution {
    public boolean isValid(String s) {
        if(s.length()<1){
            return true;
        }
        Stack<Character> open= new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                open.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (open.isEmpty()) {
                    return false;
                }
                
                char top = open.peek();
                if ((s.charAt(i) == ')' && top == '(') || 
                    (s.charAt(i) == '}' && top == '{') || 
                    (s.charAt(i) == ']' && top == '[')) {
                    open.pop();
                } else {
                    return false;
                }
            }
        }
        
        return open.isEmpty();
    }
}