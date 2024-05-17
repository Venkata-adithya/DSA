
//LC-1290
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
    public int getDecimalValue(ListNode head) {
        ListNode Counter=head;
        int count=0;
        double sum=0;
        while(Counter!=null){
            Counter=Counter.next;
            count++;
        }
        for(int i=count-1;i>=0;i--){
            sum=sum+(head.val*Math.pow(2,i));
            head=head.next;
        }
        return (int)sum;
    }
}

//Optimized solution
public int getDecimalValue(ListNode head) {
       int sum = 0;
        
        while (head != null){
            sum *= 2;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }

//We can use bit manipulation
