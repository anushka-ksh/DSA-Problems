class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int i=0;
        while(i<nums2.length-1){
            int j=i+1;
            while(j<nums2.length){
                if(nums2[i]<nums2[j]){
                    map.put(nums2[i], nums2[j]);
                    break;
                }else j++;
            }
            i++;
        }
        int[] nums3= new int[nums1.length];
        for(int a=0; a<nums1.length; a++){
            if(map.containsKey(nums1[a])){
                nums3[a]=map.get(nums1[a]);
            }else{
                nums3[a]=-1;
            }
        }
        return nums3;
    }
}