/*
    Implementation of singly linked list
 */
package Data_Structure.LinkedList;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(){
        head = null;
    }

    // add element to the head of linked list
    public void add(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public Node insert(int data, Node n){
        Node newNode = new Node(data);
        Node nextNode = n.next;
        n.next = newNode;
        newNode.next = nextNode;
        return newNode;
    }

    // remove the head
    public int remove(){
        if(head==null){
            throw new java.lang.Error("Trying to remove the head of an empty linked list");
        }
        int result = head.data;
        head = head.next;
        return result;
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

    // reverse the current linked list
    public void reverse(){
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
        head = current;
    }

    public static void printListFromHead(Node root){
        while (root != null) {
            System.out.print(root.data + "->");
            root = root.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList l = new SinglyLinkedList();
        for(int i = 1; i <= 9; i++){
            l.add(i);
        }
        l.printList();
        System.out.println();
        l.reverse();
        l.printList();
        System.out.println();
        l.remove();
        l.printList();
        System.out.println();
        l.insert(2, l.search(2));
        l.printList();
    }
}
