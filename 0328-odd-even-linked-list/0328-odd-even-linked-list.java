/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode tmp1 = head;
        ListNode tmp2 = head.next;
        ListNode tmp3 = tmp1.next;
        int i=0;
        while(tmp1.next!=null)
        {
            i++;
            tmp3 = tmp1.next;
            tmp1.next = tmp3.next;
            if(tmp1.next !=null || i%2 == 0)
                tmp1 = tmp3;
        }
        tmp1.next = tmp2;
        return head;
        
    }
}