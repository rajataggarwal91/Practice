package CrackingTheCodingInterview.LinkedLists;

/**
 * Created by uaggara on 9/29/16.
 */
public class CircularLinkedList {
    public static void main(String args[]){
        Node head = Node.sampleList(5);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head.next.next;
       // printList(head);
        Node ans = findHead(head);
        if(ans!=null)
            System.out.println(ans.data);
    }

    public static Node findHead(Node head){
        if(head==null)
            return null;

        Node slow = head;
        Node fast = head;

        do{
            if(fast==null || fast.next==null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        } while(slow!=fast);

        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }



}
