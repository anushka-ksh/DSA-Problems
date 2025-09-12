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
        int length=1;
        ListNode ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            length++;
        }
        ListNode mew=head;
        int idx=0;
        if(length%2==0){
            idx=length/2-1;
        }else{
            idx=length/2;
        }
        for(int i=0; i<idx; i++){
            mew=mew.next;
        }
        return mew;
    }
}