package Algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
    Algorithm problem on LeetCode;
    https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
public class MergeKLists {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for(int i = 0; i < lists.length; i++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
        }
        if(pq.isEmpty()) return null;
        ListNode removed = pq.remove();
        ListNode root = new ListNode(removed.val);
        ListNode current = root;
        while(!pq.isEmpty()||removed.next!=null){
            if(removed.next!=null){
                pq.add(removed.next);
            }
            removed = pq.remove();
            current.next = new ListNode(removed.val);
            current = current.next;
        }
        return root;
    }

}
