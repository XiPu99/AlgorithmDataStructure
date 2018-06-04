/*
    An implementation of queue using a linked list
 */
package Data_Structure.LinkedList;

public class QueueLinkedList {
    SinglyLinkedList queue;
    Node tail;

    public QueueLinkedList(){
        queue = new SinglyLinkedList();
        tail = null;
    }

    public void enqueue(int i){
        if(tail==null){
            queue.add(i);
            tail = queue.head;
        }
        else{
            queue.insert(i, tail);
            tail = tail.next;
        }
    }

    public int dequeue(){
        return queue.remove();
    }

    public void printQueue(){
        queue.printList();
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        for(int i = 1; i <= 9; i++){
            queue.enqueue(i);
        }
        queue.printQueue();
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printQueue();
    }
}
