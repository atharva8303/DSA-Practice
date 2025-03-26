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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode first = l1, second = l2;
        
        int carry = 0;
        
        ListNode dummy = new ListNode(0);
        ListNode trav = dummy; 
        
        while (first != null || second != null || carry != 0) {
            
            if (first != null) {
                carry += first.val;
                first = first.next;
            }
            
            if (second != null) {
                carry += second.val;
                second = second.next;
            }
            
            trav.next = new ListNode(carry % 10);
            trav = trav.next;
            carry /= 10; //carry = carry / 10;

        }
        
        return dummy.next;
        
        
    }
}