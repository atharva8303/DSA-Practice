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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(1);
        dummy.next = head;
        int c = 0;

        ListNode currnode = dummy;
        while(currnode.next!=null){
            c++;
            currnode = currnode.next;
        }
        int k = c-n;
        currnode = dummy;
        for(int i =0; i<k; i++){
            currnode = currnode.next;
        }
        currnode.next = currnode.next.next;

        return dummy.next;

    }
}