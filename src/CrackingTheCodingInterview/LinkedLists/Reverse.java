package CrackingTheCodingInterview.LinkedLists;


import static CrackingTheCodingInterview.LinkedLists.Node.printList;

/**
 * Created by uaggara on 9/28/16.
 */
public class Reverse {
    public static void main(String args[]){
        Node head = Node.sampleList(4);
        printList(reverseList(head));

    }

    public static Node reverseList(Node head){
        Node prev=null, cur=head, next;
        while(cur!=null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
     return prev;
    }

}
