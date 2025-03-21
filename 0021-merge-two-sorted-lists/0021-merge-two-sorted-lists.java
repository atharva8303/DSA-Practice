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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                current.next = curr1;
                curr1 = curr1.next;
            } else {
                current.next = curr2;
                curr2 = curr2.next;
            }
            current = current.next;
        }

        if (curr1 != null) {
            current.next = curr1;
        } else if (curr2 != null) {
            current.next = curr2;
        }
        return dummy.next;
    }
}