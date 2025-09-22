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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        int pos=1;
        ListNode ptr=head;
        ListNode evenhead= new ListNode(0);
        ListNode oddhead= new ListNode(0);
        ListNode evenptr=evenhead;
        ListNode oddptr=oddhead;

        while(ptr!=null){
            if(pos%2==0){
                evenptr.next= new ListNode(ptr.val);
                evenptr=evenptr.next;
                
            }else{
                oddptr.next=new ListNode(ptr.val);
                oddptr=oddptr.next;
                
            }
            ptr = ptr.next;
            pos++;
        }
        oddptr.next=evenhead.next;
        return oddhead.next;
    }
}