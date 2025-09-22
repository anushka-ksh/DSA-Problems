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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode ptr= head;
        int length=1;
        while(ptr.next!=null){
            ptr=ptr.next;
            length++;
        }
        int half=Math.abs(length/2);
        ptr=head;
        int ptrcount=1;
        while(ptrcount<half){
            ptr=ptr.next;
            ptrcount++;
        }
        ptr.next=ptr.next.next;
        return head;
    }
}