import java.util.LinkedList;
import java.util.Deque;

/*
    implement a stack using two queues
 */
public class stackByTwoQueues {

    private Deque<Integer> one;
    private Deque<Integer> two;

    public stackByTwoQueues(){

        one = new LinkedList<>();
        two = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        one.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(one.size()>1){
            two.add(one.remove());
        }
        int result = one.remove();
        Deque<Integer> temp = two;
        two = one;
        one = temp;
        return result;
    }

    /** Get the top element. */
    public int top() {
        return one.peekLast();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return one.size()==0;
    }


}
