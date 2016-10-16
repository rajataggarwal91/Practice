package CrackingTheCodingInterview.GraphsAndTrees;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by uaggara on 9/30/16.
 */
public class ListOfDepths {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        MinimalTree minimalTree = new MinimalTree();
        ArrayList<LinkedList> levelsList = new ArrayList<>();

        int level = 0;
        TreeNode root = minimalTree.createBST(arr);
        createList(root,level,levelsList);
        printListOfDepths(root,levelsList);
    }

    public static void printListOfDepths(TreeNode root, ArrayList<LinkedList> levelsList){
        for(LinkedList l : levelsList){
            for(Object element : l) {
                System.out.println(((TreeNode)element).data + " ");
            }
            System.out.println();
        }

    }


    public static void createList(TreeNode root, int level, ArrayList<LinkedList> levelsList){
        if(root==null)
            return;
        if(levelsList.size()<=level)
            levelsList.add(level, new LinkedList());
        levelsList.get(level).add(root);
        createList(root.left, level+1, levelsList);
        createList(root.right, level+1, levelsList);

    }



}
