package CrackingTheCodingInterview.GraphsAndTrees;

/**
 * Created by uaggara on 9/30/16.
 */

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;


    TreeNode(int val) {
        this.data = val;
    }
}

public class MinimalTree {
    public TreeNode createBST(int[] arr) {
        return createBST(arr,0,arr.length-1);
    }

    public TreeNode createBST(int[] arr, int start, int end){
        if(start>end)
            return null;
        int mid = (start + end)/2;
        TreeNode newNode = new TreeNode(arr[mid]);
        newNode.left = createBST(arr, start, mid-1);
        newNode.right = createBST(arr, mid + 1, end);
        return newNode;
    }



//public TreeNode createBST(int[] arr, TreeNode root, int index){

//        if(index>=arr.length)
//            return null;
//        TreeNode newNode = new TreeNode(arr[index]);
//
//        if(root ==null) {
//            root = newNode;
//            createBST(arr, root, index + 1);
//        }
//        else {
//            if (root.left == null && root.data > arr[index]) {
//                root.left = newNode;
//            }
//            if (root.right == null && root.data <= arr[index]) {
//                root.right = newNode;
//            }
//        }
//        if(root.left!=null && root.right!=null) {
//            createBST(arr, root.left, index);
//            createBST(arr, root.right, index);
//        }






//            if(arr[i] < temp.data){
//                while(temp.left!=null && temp.left.data > arr[i]){
//                    prev = temp;
//                    temp = root.left;
//                }
//                temp = new TreeNode(arr[i]);
//                prev.left = temp;
//            }
//
//            if(arr[i] > temp.data){
//                while(temp.right!=null && temp.right.data > arr[i]){
//                    prev = temp;
//                    temp = root.right;
//                }
//                temp = new TreeNode(arr[i]);
//                prev.right = temp;
//            }
//
//            if(temp==null){
//                temp = new TreeNode(arr[i]);
//                if(arr[i] > prev.data)
//                    prev.right = temp;
//                else
//                    prev.left = temp;
//
//        }
//        return root;
//    }

    public void printTree(TreeNode root) {
        //This will print tree in preorder
        if (root == null)
            return;
        System.out.println(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }


    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 4, 5};
        MinimalTree mTree = new MinimalTree();
        mTree.printTree(mTree.createBST(arr));

    }

}
