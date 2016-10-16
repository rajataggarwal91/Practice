package CrackingTheCodingInterview.GraphsAndTrees;

/**
 * Created by uaggara on 9/30/16.
 */

class TreeNodeP {
    int data;
    TreeNodeP left;
    TreeNodeP right;
    TreeNodeP parent;

    TreeNodeP(int val){
        this.data = val;
    }



}


public class SuccessorNode {
    public static void main(String args[]) {

        TreeNodeP treeNode = new TreeNodeP(5);
        treeNode.parent = null;
        treeNode.left = new TreeNodeP(3);
        treeNode.right = new TreeNodeP(10);
        treeNode.left.left = new TreeNodeP(1);
        treeNode.left.right = new TreeNodeP(2);
        treeNode.right.left = new TreeNodeP(7);
        treeNode.left.parent = treeNode;
        treeNode.right.parent = treeNode;
        treeNode.left.left.parent = treeNode.left;
        treeNode.left.right.parent = treeNode.right;
        treeNode.right.left.parent = treeNode.right;


        System.out.println(getSuccessor(treeNode.left.right).data);
    }


    public static TreeNodeP getSuccessor(TreeNodeP treeNode) {

        if( treeNode==null || treeNode.parent==null)
            return null;

        if (treeNode.right != null) {
            treeNode = treeNode.right;
            while (treeNode.left != null)
                treeNode = treeNode.left;
            return treeNode;
        } else if (treeNode.parent.right == treeNode) {
            while (treeNode != null && treeNode.parent.right != treeNode)
                treeNode = treeNode.parent;
            return treeNode.parent;
        } else
            return treeNode.parent;


    }
}
