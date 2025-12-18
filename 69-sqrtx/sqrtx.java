class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int sqrt=1;
        for(long i=1; i<=x; i++){
            if(i*i<=x){
                sqrt=(int)i;
            }
            else{
                break;
            }
        }
        return sqrt;
    }
}