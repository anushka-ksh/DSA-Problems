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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; 
        // Queue<TreeNode> queue1= new LinkedList<>();
        // queue1.add(root);
        
        // int levelCount=0;
        // while(true){
        //     int countAtLevel=queue1.size();
        //     if(countAtLevel==0) return levelCount;
        //     while(countAtLevel>0){
        //         TreeNode currElement= queue1.poll();
        //         if(currElement.left!=null){
        //             queue1.add(currElement.left);
        //         }
        //         if(currElement.right!=null){
        //             queue1.add(currElement.right);
        //         }
        //         countAtLevel--;
        //     }
        //     levelCount++;
        // }

        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return Math.max(l,r)+1;
    }
}