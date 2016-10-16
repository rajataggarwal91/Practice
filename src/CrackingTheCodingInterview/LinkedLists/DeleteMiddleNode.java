package CrackingTheCodingInterview.LinkedLists;

import static CrackingTheCodingInterview.LinkedLists.Node.printList;

/**
 * Created by uaggara on 9/28/16.
 */


//Important note : Cannot delete first and last node
public class DeleteMiddleNode {
    public static void main(String args[]) {
        Node head = Node.sampleList(6);
        Node mid = head.next.next;
        deleteMiddleNode(mid);
        printList(head);
    }

    public static void deleteMiddleNode(Node mid) {
        Node prev = mid;
        while(mid.next!=null){
            mid.data = mid.next.data;
            prev = mid;
            mid = mid.next;

        }
  prev.next=null;
    }
}
