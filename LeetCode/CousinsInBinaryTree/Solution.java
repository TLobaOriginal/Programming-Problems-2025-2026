package CousinsInBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isCousinsQueue(TreeNode root, int x, int y) {
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        nodeQueue.offer(root);

        /* When at a node we want to check a few things */

        while(!nodeQueue.isEmpty()){
            boolean xExists, yExists;
            for(int i = 0; i < nodeQueue.size(); i++){
                TreeNode currNode = nodeQueue.poll();
                //Are any of it's children X or Y
                if(currNode.left.val == x || currNode.right.val == x){
                    xExists = true;
                }

            }
        }
        return false;
    }
 
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        System.out.println("Root Value: " + root.val);
        ArrayList<Integer> depths = new ArrayList<>();
        TreeNode xParent = getParent(root, x, null, depths, 0);
        TreeNode yParent = getParent(root, y, null, depths, 0);

        System.out.println("X Depth = " + depths.get(0));
        System.out.println("Y Depth = " + depths.get(1));
        System.out.println("X val = " + xParent.val);
        System.out.println("Y Val = " + yParent.val);
        return (xParent.val != yParent.val) && depths.get(0) == depths.get(1);
    }

    private TreeNode getParent(TreeNode root, int toFind, TreeNode parent, ArrayList<Integer> depths, int currentDepth) {
        System.out.println("=========================");
        if(root == null){
            System.out.println("Null root: Current depth = " + currentDepth);
            return null;
        }
        else if(root.val == toFind){
            System.out.println("Value has been found = " + root.val + " & Depth = " + currentDepth);
            
            depths.add(currentDepth);
            return parent;
        }
        System.out.println("Going left from node " + root.val);
        TreeNode leftSideResult = getParent(root.left, toFind, root, depths, currentDepth + 1);
        System.out.println("Going right from node " + root.val);
        TreeNode rightSideResult = getParent(root.right, toFind, root, depths, currentDepth + 1);
        System.out.println("=========================");
        return leftSideResult != null ? leftSideResult : rightSideResult;
    }

}
