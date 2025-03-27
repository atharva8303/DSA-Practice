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
    public ListNode middleNode(ListNode head) {
        // ListNode d1=new ListNode(0);
        // ListNode d2=new ListNode(0);
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!= null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }

        return slow;
    }
}




        // while(curr.next!=null)
        // {
        //     l++;
        //     curr=curr.next;
        // }
        // if(l%2==0)