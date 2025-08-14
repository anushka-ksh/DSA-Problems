class Solution {
    public String largestGoodInteger(String num) {
        String maxgood="";
        for(int i=0; i<num.length()-2;i++){
            char first= num.charAt(i);
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                String curgood= num.substring(i,i+3);
                if(maxgood.isEmpty() || curgood.compareTo(maxgood)>0){
                    maxgood=curgood;
                }
            }
        }
        return maxgood;
    }
}