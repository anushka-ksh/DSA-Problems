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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||k==0){
            return head;
        }
        int length=1;
        ListNode ptr= head;

        while(ptr.next!=null){
            ptr=ptr.next;
            length++;
        }
        ptr.next=head;
        int newPtr=length-(k%length)-1;

        ListNode mew=head;
        for(int i=0; i<newPtr; i++){
            mew=mew.next;
        }

        ListNode newHead=mew.next;
        mew.next=null;

        return newHead;
        
    }
}