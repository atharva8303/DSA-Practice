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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        ListNode tail=null;
        int c=0;int f=0;
        while(curr!=null)
        {
            c++;
            curr=curr.next;
        }
        int a[]=new int[c];
        curr=head;
        for(int i=0;i<c;i++)
        {   if(curr!=null)
            {   a[i]=curr.val;
                curr=curr.next;
            }
        }
        int i=0;int j=c-1;
          while(i<j)
          {
            if(a[i]==a[j]){
                i++;
                j--;
            }
            else 
            return false;
          }
        return true;
    }
}