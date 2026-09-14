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
        ListNode curr1=l1;
        ListNode curr2=l2;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;
        while(curr1!=null || curr2!=null ){
            int val1=0;
            int val2=0;
            if(curr1!=null){
                val1=curr1.val;
            }
            if(curr2!=null){
                val2=curr2.val;
            }
            int sum=val1+val2+carry;
            carry=sum/10;
            int rem=sum%10;
            curr.next=new ListNode(rem);
            curr=curr.next;
            
            if(curr1!=null){
                curr1=curr1.next;
            }
            if(curr2!=null){
                curr2=curr2.next;
            }
        }
            if(carry!=0){
                curr.next=new ListNode(carry);
            }
                
        
        return dummy.next;
    }
}
