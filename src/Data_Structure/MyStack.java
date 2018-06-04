package Data_Structure;/*
    An implementation of stack using an array
 */

public class MyStack {

    private int top = -1; // index that tracks the top of the stack
    private int[] stack;

    public MyStack(int size){
        stack = new int[size];
    }

    // push to the top of the stack
    public void push(int data){
        top++;
        if(top>=stack.length) {
            throw new java.lang.Error("Stack overflow");
        }
        stack[top]= data;
    }

    // pop the element off the top of the stack
    public int pop() {
        if(isEmpty()) throw new java.lang.Error("Trying to pop an empty stack");
        top--;
        return stack[top+1];
    }

    // check if the stack is empty
    public boolean isEmpty(){
        return top==-1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
