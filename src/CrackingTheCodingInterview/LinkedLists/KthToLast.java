package CrackingTheCodingInterview.LinkedLists;

import static CrackingTheCodingInterview.LinkedLists.Node.printList;

/**
 * Created by uaggara on 9/28/16.
 */
public class KthToLast {
    public static void main(String args[]){
        Node head = Node.sampleList(1);
        printList(kthToLast(head,1));
    }

    public static Node kthToLast(Node head, int k){

        Node fast=head, slow=head;


        //move fast forward by k steps
        while(k-->0){
            if(fast==null)
                return null;
            fast = fast.next;
        }

        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

      return slow;

    }

}
