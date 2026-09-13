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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        //find the split portion
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;//will point first half last elemnt as null
        //reverse second half
        ListNode curr=head2;
        ListNode prev=null;
        while(curr!=null){
            ListNode nextN=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextN;
        }
    ListNode first=head;
    ListNode second=prev;
    while(first != null && second != null){
        ListNode temp1=first.next;
        ListNode temp2=second.next;
        first.next=second;
        first=temp1;
        second.next=first;
        second=temp2;
    }
    }
}
