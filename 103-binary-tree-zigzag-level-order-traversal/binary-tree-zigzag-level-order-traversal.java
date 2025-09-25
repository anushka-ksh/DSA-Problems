/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q1= new LinkedList<>();
        q1.offer(root);
        int counter=0;
        while(!q1.isEmpty()){
            List<Integer> shortlist= new ArrayList<>();
            counter++;
            int len=q1.size();
            
            for(int i=0; i<len; i++){
                TreeNode node=q1.poll();
                shortlist.add(node.val);
                if(node.left!=null){
                    q1.offer(node.left);
                }
                if(node.right!=null){
                    q1.offer(node.right);
                }
            }
            if(counter%2==0){
                Collections.reverse(shortlist);
            }
            result.add(shortlist);
        }
        return result;
    }
}