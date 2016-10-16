package CrackingTheCodingInterview.LinkedLists;

import static CrackingTheCodingInterview.LinkedLists.Node.printList;

/**
 * Created by uaggara on 9/29/16.
 */
public class Intersection {
    public static void main(String args[]){
        Node head1 = Node.sampleList(5);
        Node head2 = Node.sampleList(4);
        Node temp = head1;
        while(temp.next!=null){
            temp = temp.next;
        }

        printList(head1);
        printList(head2);
        Node ans = getIntersection(head1,head2);
        if(ans!=null)
        System.out.println(ans.data);

    }

    public static Node getIntersection(Node head1, Node head2){

        if(head1==null || head2==null)
            return null;
        int count1 = 0, count2 = 0;

        Node temp = head1;

        //count number of nodes in each list
        while(temp!=null){
            temp = temp.next;
            count1++;
        }

        temp = head2;
        while(temp!=null){
            temp = temp.next;
            count2++;
        }

       Node temp1 = count1 > count2 ? head1 : head2;
       for(int i = 0; i <Math.abs(count1 - count2);i++){
           temp1 = temp1.next;
        }

        //Move both the pointers together till they reach null and check if pointers are same
        Node temp2 = count1 > count2 ? head2 : head1;
        while(temp2!=null){
            if(temp2==temp1){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }



}
