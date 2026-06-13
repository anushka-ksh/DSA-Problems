class Solution {
    public int rob(int[] nums) {
        int[] dp= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i<1){
                dp[i]=nums[i];
            }else if(i==1){
                dp[i]=Math.max(nums[i], dp[i-1]);
            }
            else{
                dp[i]=Math.max(nums[i]+dp[i-2], dp[i-1]);
            }
        }
        return dp[dp.length-1];
    }
}