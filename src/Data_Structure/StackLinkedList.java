package Data_Structure;/*
    An implementation of stack using a singly linked list
 */

import Data_Structure.LinkedList.SinglyLinkedList;

public class StackLinkedList {
    SinglyLinkedList stack;

    public StackLinkedList(){
        stack = new SinglyLinkedList();
    }

    public void push(int i){
        stack.add(i);
    }

    public int pop(){
        return stack.remove();
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());

    }
}
