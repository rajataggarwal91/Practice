package CrackingTheCodingInterview.GraphsAndTrees;

/**
 * Created by uaggara on 9/30/16.
 */
public class CheckBalanced {
    public static void main(String args[]){
        int[] ar = {10,11,12,13,14};
        System.out.println(checkBalanced(new MinimalTree().createBST(ar)));

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);


        System.out.println(checkBalanced(root));

    }

    public static boolean checkBalanced(TreeNode root){
        if(root == null)
            return true;

        if(Math.abs(getLevel(root.right,1) - getLevel(root.left,1)) > 1 || !checkBalanced(root.left) || !checkBalanced(root.right))
            return false;
        else
            return true;
    }

    public static int getLevel(TreeNode root, int level){
        if(root==null)
            return level-1;
        return Math.max(getLevel(root.right, level+1), getLevel(root.left,level+1));
    }




}
