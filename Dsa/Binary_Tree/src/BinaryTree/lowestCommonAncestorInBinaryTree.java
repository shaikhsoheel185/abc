package BinaryTree;

import javax.swing.tree.TreeNode;



public class lowestCommonAncestorInBinaryTree {




    /*public TreeNode lowestCommonAncestor ( TreeNode root, TreeNode p, TreeNode  q) {

        if (root == null || root == p || root == q) return root;

        TreeNode left =  lowestCommonAncestor(root.left, p, q);
        TreeNode right =  lowestCommonAncestor(root.right , p, q);

        if ( left == null) return  right;
        else if ( right == null) return left;                                  //  Tc - O(n)
                                                                               //  Sc - O(n)

        else return root;


    }*/
}