package Data_Structure;

import java.util.LinkedList;
import java.util.Queue;

public class stackByOneQueue {

    private Queue<Integer> queue;

    public stackByOneQueue(){
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        // revert the order of elements in the queue
        int size = queue.size();
        while(size>1){
            queue.add(queue.remove());
            size--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.remove();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
