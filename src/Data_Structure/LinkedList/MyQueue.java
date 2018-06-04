/*
    Queue implementation using an array
 */
package Data_Structure.LinkedList;

public class MyQueue {

    private int head;
    private int tail;
    private int numOfElements;
    private int[] queue;

    public MyQueue(int size){
        head = 0;
        tail = 0;
        numOfElements = 0;
        queue = new int[size];
    }

    public void enqueue(int data){
        if(numOfElements==queue.length){
            throw new Error("Queue overflow");
        }
        queue[tail] = data;
        // wrap around when tail is outside the index bound
        if(tail==queue.length-1) tail = 0;
        else tail++;
        numOfElements++;
    }

    public int dequeue(){
        if(numOfElements==0){
            throw new Error("Queue underflow");
        }
        int result = queue[head];
        // wrap around when head is at the end of array
        if(head==queue.length-1) head = 0;
        else head++;
        numOfElements--;
        return result;
    }

    public boolean isEmpty(){
        return head==tail;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        for(int i = 1; i <= 5; i++){
            queue.enqueue(i);
        }
    }
}
