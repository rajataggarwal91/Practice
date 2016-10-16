package CrackingTheCodingInterview.LinkedLists;

/**
 * Created by uaggara on 9/28/16.
 */
public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;

    }

    public static Node sampleList(int size){
        Node prev = null, head = null;
        for(int i = 0;i < size; i++){
            Node newNode = new Node(i);
            if(prev!=null)
                prev.next = newNode;
            else {
                head = newNode;
            }
            prev = newNode;
        }
    return head;
    }


    public static Node arraysToLinkedList(int[] arr){
        Node prev=null, temp=null, head=null;
        if(arr.length>0) {
            head = new Node(arr[0]);
            prev = head;
        }
        for(int i = 1 ; i < arr.length ; i++) {
            temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
     return head;
    }


    public static void printList(Node head){
        while (head != null) {
            System.out.print(head.data);
            if(head.next!=null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

}
