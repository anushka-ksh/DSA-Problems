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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list1= new ArrayList<>();
        inorder(root, list1);
        return list1;
    }
    private void inorder(TreeNode node, List<Integer> list1){
        if(node==null) return;
        inorder(node.left, list1);
        list1.add(node.val);
        inorder(node.right, list1);
    }
}