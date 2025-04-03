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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;   
        ListNode prev = null;   

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }   
        ListNode newHead = null;
        ListNode tail = null;
        int carry = 0;

        while (prev != null) {
            int doubledValue = prev.val * 2 + carry;
            carry = doubledValue / 10;
            doubledValue = doubledValue % 10;

            ListNode newNode = new ListNode(doubledValue);
            if (newHead == null) {
                newHead = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            prev = prev.next;
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        curr = newHead;
        prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}