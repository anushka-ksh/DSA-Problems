class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target,0);
        return result;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] candidates,int remain, int start){
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            res.add(new ArrayList<>(temp));
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtrack(res, temp, candidates, remain - candidates[i], i); // not i+1 because we can reuse elements
                temp.remove(temp.size() - 1);
            }
        }
    }
}