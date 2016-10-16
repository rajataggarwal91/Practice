package CrackingTheCodingInterview.GraphsAndTrees;

/**
 * Created by uaggara on 9/30/16.
 */
public class ValidateBST {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        TreeNode root = new MinimalTree().createBST(arr);
        System.out.println(isValidBST(root,null,null));

        root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.left.right = new TreeNode(25);
        root.right = new TreeNode(30);
        System.out.println(isValidBST(root,null,null));

    }

    public static boolean isValidBST(TreeNode root, Integer minValue, Integer maxValue){
        if(root==null)
            return true;

        if ((maxValue != null && root.data > maxValue) || (minValue != null && root.data < minValue))
            return false;

        return isValidBST(root.left,minValue,root.data) && isValidBST(root.right,root.data,maxValue);

    }

    }



