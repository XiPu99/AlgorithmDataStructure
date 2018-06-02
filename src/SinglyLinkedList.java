/*
    Implementation of singly linked list
 */

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList(){
        head = null;
    }

    // add element to the head of linked list
    public void add(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void printList(){
        Node root = head;
        while(root!=null){
            System.out.print(root.data + "->");
            root = root.next;
        }
    }

    public Node search(int key){
        Node root = head;
        while(root.data!=key&&root!=null){
            root = root.next;
        }
        return root;
    }

    // return the head of the reversed version of linked list
    public Node reverse(){
        Node current = head;
        Node previous = null;
        Node nextNode = null;
        while(current.next!=null){
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        current.next = previous;
        return current;
    }

    public static void printListFromHead(Node head){
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList l = new SinglyLinkedList();
        for(int i = 1; i <= 9; i++){
            l.add(i);
        }
        l.printList();
        System.out.println();
        printListFromHead(l.reverse());
    }
}
