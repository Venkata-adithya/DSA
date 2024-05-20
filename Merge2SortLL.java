
//LC-21
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(foint val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ls=new ListNode(0);
        ListNode lc=ls;
        if(list1 == null) 
            return list2;
        else if(list2 == null) 
            return list1;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                lc.next = list1;
                list1 = list1.next;
            }
            else{
                lc.next = list2;
                list2 = list2.next;
            }
            lc = lc.next;
        }
        if(list1 == null) 
            lc.next=list2;
        else
            lc.next=list1;
        return ls.next;
    }
}
