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
    public ListNode partition(ListNode head, int x) {
        
        ListNode dummy1=new ListNode(-1);
        ListNode t1=dummy1;
        
        ListNode dummy2=new ListNode(-1);
        ListNode t2=dummy2;

        while(head!=null){

            if(head.val<x)
            {
                t1.next=head;
                t1=t1.next;
            }
            
            else
            {
                t2.next=head;
                t2=t2.next;
            }
            head=head.next;
        }
        t1.next=dummy2.next;
        t2.next=null;
        return dummy1.next;
    }    
}

/*class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        ListNode currNode = head;
        Lis
       tNode dummyPointer = dummy; while(currNode!=null){
            if(currNode.val<x){
                        dummy.next = new ListNode                                        
            }             currNode = currNode.next;           
                                                
        }

        return dummy.next;        
    }    
}*/
