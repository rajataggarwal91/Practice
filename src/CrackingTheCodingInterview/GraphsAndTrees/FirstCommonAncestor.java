package CrackingTheCodingInterview.GraphsAndTrees;

/**
 * Created by uaggara on 10/1/16.
 */
public class FirstCommonAncestor {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        TreeNode root = new MinimalTree().createBST(arr);
        TreeNode ans = commonAncestor(root,root.left,root.right);
        if(ans!=null)
            System.out.println(ans.data);
    }

    public static TreeNode commonAncestor(TreeNode root, TreeNode node1, TreeNode node2){
           // for BST we check when the values of node is between the desired nodes
           // for Binary tree, we check if they are on the same side

        if(node1==root || node2==root || root==null)
            return root;


           boolean node1left = covers(root.left, node1);
           boolean node2left = covers(root.left, node2);
           if (node1left != node2left)
               return root;

            if(node1left==true)
                return commonAncestor(root.left,node1,node2);
            else
                return commonAncestor(root.right,node1,node2);



    }

    public static boolean covers(TreeNode root, TreeNode node){
        if(root==null) return false;
        if(root==node) return true;
        return covers(root.left,node) || covers(root.right,node);




    }




}
