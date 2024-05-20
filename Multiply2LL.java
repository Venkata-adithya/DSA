//https://www.geeksforgeeks.org/multiply-two-numbers-represented-linked-lists/
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
    public int mulTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        int num1=0;
        int num2=0;
        while(head1!=null){
            num1=(num1*10)+head1.val;
        }
        while(head2!=null){
            num2=(num2*10)+head2.val;
        }
        return (num1*num2);
    }
}
