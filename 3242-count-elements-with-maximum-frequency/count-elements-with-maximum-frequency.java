class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count=0;
        int maxcount=0;
        HashMap<Integer, Integer> map1= new HashMap<>();
        for(int num : nums){
            int curfreq=map1.getOrDefault(num,0)+1;
            map1.put(num, curfreq);

            if (curfreq > maxcount){
                maxcount = curfreq;
                count = curfreq;
            } 
            else if (curfreq == maxcount){
                count += curfreq;
            }
        } 
        return count;
    }
}