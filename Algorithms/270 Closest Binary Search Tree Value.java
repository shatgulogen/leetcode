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
    public int closestValue(TreeNode root, double target) {
         int val =root.val;
         int closest = root.val;//first set the closest value to be the value of the tree root
        while (root != null) {//root cannot be null is our condition
            val = root.val; //current value start with the value of the tree root
            closest = Math.abs(val - target) < Math.abs(closest - target) ? val : closest;
            //compare the absolute value between the difference of currentvalue and target with the difference between the closest value and target 
            // if the first one is smaller than the second, we set closest value to the smaller value, otherwise set it to itself
            root =  target < root.val ? root.left : root.right;
            // this can be written as:
            //if (target < root.val){
            // root = root.left;}
            // if (target > root.val){
            // root = root.right;}
        }
        return closest;
    }
}
