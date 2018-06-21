package Algorithm.LinkedList;

public class Partition {
    public ListNode partition(ListNode head, int x){
        ListNode leftHead = new ListNode(0);
        ListNode leftTail = leftHead;
        ListNode rightHead = new ListNode(0);
        ListNode rightTail = rightHead;
        ListNode current = head;

        while(current!=null){
            if(current.val<x){
                leftTail.next = new ListNode(current.val);
                leftTail = leftTail.next;
            }
            else{
                rightTail.next = new ListNode(current.val);
                rightTail = rightTail.next;
            }
            current = current.next;
        }
        leftTail.next = rightHead.next;
        rightTail.next = null;
        return leftHead.next;
    }
    

}
