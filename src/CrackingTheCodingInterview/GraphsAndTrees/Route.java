package CrackingTheCodingInterview.GraphsAndTrees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by uaggara on 9/30/16.
 */


class Node{
    int data = 0;
    boolean visited=false;
}

class AdjacencyList{
    public static boolean[][] init(){
        //Create adjacency matrix

        boolean[][] adj = new boolean[5][5];
        for(int i = 0; i < 5 ; i++){
            for(int j = 0; j <5 ; j++){
                adj[i][j] = false;
            }
        }

        adj[1][2] = true;
        adj[2][1] = true;
        adj[4][3] = true;
        adj[1][4] = true;

        return adj;
    }
}

public class Route {
    public static void main(String args[]) {


        Node[] nodeLists = new Node[5];
        //Create nodes
        for(int i = 0; i <5; i++){
            Node newNode = new Node();
            nodeLists[i] = newNode;
            nodeLists[i].data = i;
        }

        boolean[][] adj = AdjacencyList.init();

        System.out.println(isRoute(nodeLists[0], nodeLists[1], adj, nodeLists));
        System.out.println(isRoute(nodeLists[1], nodeLists[3], adj, nodeLists));
        System.out.println(isRoute(nodeLists[2], nodeLists[3], adj, nodeLists));

    }

    public static boolean isRoute(Node node1, Node node2, boolean[][] adj, Node[] nodeLists) {

        //mark visited  = false

        for(int i = 0; i < 5 ; i++)
            nodeLists[i].visited = false;

        //perform BFS
        Queue<Node> queue = new LinkedList<>();
        Node start = node1;
        queue.add(start);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            if (temp == node2)
                return true;
            temp.visited = true;
            for (int j = 0; j < 5; j++) {
                if (adj[temp.data][j] == true && nodeLists[j].visited==false) {
                    if(nodeLists[j]==node2)
                        return true;
                    else
                        queue.add(nodeLists[j]);

                }

            }
        }
        return false;
    }
}
