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
  public ListNode mergeNodes(ListNode head) {
    var sum = 0;
    var dummyHead = new ListNode();
    var prev = dummyHead;

    for (var p = head.next; p != null; p = p.next) {
      if (p.val == 0) {
        var node = new ListNode(sum);
        prev.next = node;
        prev = node;
        sum = 0;
        continue;
      }
      sum += p.val;
    }
    return dummyHead.next;
  }
}