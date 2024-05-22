//LC-234
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
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
        //ListNode temp=head;
        // BigInteger num=BigInteger.ZERO;
        // while(temp!=null){
        //     num=(num.multiply(BigInteger.TEN)).add(BigInteger.valueOf(temp.val));
        //     temp=temp.next;
        // }
        // if(head.val==0 && num.remainder(BigInteger.TEN).equals(BigInteger.ZERO)) num=num.divide(BigInteger.TEN);
        // BigInteger check=num;
        // BigInteger revNum=BigInteger.ZERO;
        // int rem=0;
        // while(check.compareTo(BigInteger.ZERO)!=0){
        //     rem=check.remainder(BigInteger.TEN).intValue();
        //     revNum=(revNum.multiply(BigInteger.TEN)).add(BigInteger.valueOf(rem));
        //     check=check.divide(BigInteger.TEN);
        // }
        // return num.equals(revNum);
}
