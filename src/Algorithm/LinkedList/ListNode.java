package Algorithm.LinkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null;}

    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val + "->");
            head = head.next;
        }
    }

    public static ListNode buildListFromArray(int[] nums){
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for(int i = 1; i < nums.length; i++){
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode test = buildListFromArray(new int[]{1,2,3,4,5});
        printList(test);
    }
}
