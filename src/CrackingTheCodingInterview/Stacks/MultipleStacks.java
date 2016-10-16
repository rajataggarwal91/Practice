package CrackingTheCodingInterview.Stacks;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by uaggara on 9/30/16.
 */
public class MultipleStacks {


    Stack<Stack<Integer>> stackSet = new Stack<Stack<Integer>>();  //keeps track of list of stacks
    Stack<Integer> topStack; //keeps track of present stack
    int maxSize = 2;

    public void push(int value){

        if(topStack==null) {
            topStack = new Stack<>();
            stackSet.push(topStack);
        }

        if(topStack.size()>=maxSize) {
            Stack<Integer> newStack = new Stack<>();
            topStack = newStack;
            stackSet.push(topStack);
        }
        topStack.push(value);

    }

    public void push(Stack<Integer> st){
        this.push(st);
    }


    public int pop(){
        if(topStack == null || stackSet.isEmpty())
            return -1;
        if(topStack.isEmpty()) {
            stackSet.pop();
            if(!stackSet.isEmpty())
                topStack = stackSet.peek();
            else
                return -1;
        }
        return topStack.pop();
    }


    public void printStacks(){
        while(!stackSet.isEmpty()){
            Stack<Integer> temp = stackSet.pop();
            while(!temp.isEmpty()){
                System.out.println(temp.pop());
            }
            System.out.println();
        }
    }

    public int pop(int index){
        //check what stack does the index corresponds to

        ArrayList<Stack<Integer>> ar = new ArrayList<>();
        while(!stackSet.isEmpty()){
            ar.add(stackSet.pop());
        }
        for(int i = 0 ; i < ar.size() ; i++)
            stackSet.push(ar.get(ar.size()-1-i));
        return ar.get(ar.size()-1-index).pop();
    }
}

class MainClass{
    public static void main(String args[]) {
        MultipleStacks mStacks = new MultipleStacks();
        mStacks.push(1);
        mStacks.push(2);
        mStacks.push(3);
        mStacks.push(4);
        mStacks.push(5);
        System.out.println(mStacks.pop(2));
//        System.out.println(mStacks.pop());
//        System.out.println(mStacks.pop());
//        System.out.println(mStacks.pop());
//        System.out.println(mStacks.pop());
//        System.out.println(mStacks.pop());

        //mStacks.printStacks();
    }
}