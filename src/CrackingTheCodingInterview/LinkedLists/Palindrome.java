package CrackingTheCodingInterview.LinkedLists;

import java.util.Stack;

/**
 * Created by uaggara on 9/28/16.
 */
public class Palindrome {
    public static void main(String args[]){
        int[] nonP = {1,2,3,4,4,3,2,1,0};
        int[] p = {1,2,4,2,1};
        Node head = Node.arraysToLinkedList(nonP);
        Node head2 = Node.arraysToLinkedList(p);
        System.out.println(isPalindrome(head));
        System.out.println(isPalindrome(head2));

    }
    public static boolean isPalindrome (Node head){
        Stack<Integer> stack = new Stack<>();
        //add into stack till the middle element
        boolean odd = false;
        Node fast = head, slow = head;
        while(fast!=null){
            if(fast.next==null) {
                odd = true;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = head;
        while(temp!=slow){
            stack.push(temp.data);
            temp = temp.next;
        }

        if(odd)
            temp = temp.next;


        while(temp!=null){
            if(stack.isEmpty())
                return false;
            if(temp.data!= stack.pop()){
                return false;
            }
            temp = temp.next;
        }

        if(!stack.isEmpty())
            return false;
        return true;

    }



}
