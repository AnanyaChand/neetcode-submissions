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
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer>map=new HashMap<>();
        ListNode curr=head;
        while(curr!=null){
            int count=map.getOrDefault(curr,0)+1;
            map.put(curr,count);
            if(count>1){
                return true;
            }
            map.put(curr,count);
            curr=curr.next;

        }
        return false;
    }
}
