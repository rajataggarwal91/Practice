package CrackingTheCodingInterview.LinkedLists;

import static CrackingTheCodingInterview.LinkedLists.Node.printList;

/**
 * Created by uaggara on 9/28/16.
 */
public class SumLists {
    public static void main(String args[]){
       int[] num1 = {7,9,2,2};
       int[] num2 = {2,1,8};
       Node head1 = Node.arraysToLinkedList(num1);
       Node head2 = Node.arraysToLinkedList(num2);
       printList(addLists(null,null));
    }

    public static Node addLists(Node head1, Node head2){
        int carry = 0;
        Node prev = null, saveHead = null, head3=null;
        while(head1!=null || head2!=null){
            head3 = new Node(0);
            if(prev==null)
                saveHead = head3;
            if(head1==null) {
                head3.data = (head2.data + carry) % 10;
                carry = 0;
                head2 = head2.next;
            }
            if(head2==null) {
                head3.data = (head1.data + carry) % 10;
                carry = 0;
                head1 = head1.next;
            }
            if(head2!=null && head1!=null) {
                head3.data = (head1.data + head2.data + carry) % 10;
                carry = (head1.data + head2.data + carry)/10;
                head1 = head1.next;
                head2 = head2.next;
            }

            if(prev!=null)
                prev.next = head3;
            prev = head3;


        }
if(carry!=0)
    head3.next = new Node(carry);
        return saveHead;
    }


}
