package CrackingTheCodingInterview.LinkedLists;

import java.util.HashMap;

/**
 * Created by uaggara on 9/28/16.
 */
public class DeleteDups {
    public static void main(String args[]){
        int[] values = {1,2,1,2,2};
        Node head = Node.arraysToLinkedList(values);
        Node.printList(head);
        head = deleteDups(head);
        System.out.println("deletedDups: ");
        Node.printList(head);
    }
    public static Node deleteDups(Node head){

        //1. Get every data in the hashmap with value 1
        //2. Check its occurence, skip and make the value as 0 and remove if hashmap value is already 0


        Node temp = head, prev;
        HashMap<Integer, Boolean> hmap = new HashMap<>();
        while(temp!=null) {
            hmap.put(temp.data, true);
            temp = temp.next;
        }
        temp = head.next;
        prev = head;
        while(temp!=null){
            if(hmap.containsKey(temp.data)){
                if(hmap.get(temp.data)==true){
                    hmap.put(temp.data, false);
                }
                else{
                    prev.next = temp.next;
                    prev = temp;
                }
            }
            else {
                prev = temp;
            }
            temp = temp.next;

        }
        return head;
    }

}
