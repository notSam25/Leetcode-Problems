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
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
  
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      //traverse first node
      int l1Total = 0, l2Total = 0, index = 1, total = 0;
      ListNode L1 = l1, L2 = l2;
      while(L1 != null) {
        l1Total += L1.val * index;
        index *= 10;
        L1 = L1.next;
      }

      index = 1;

      while(L2 != null) {
        l2Total += L2.val * index;
        index *= 10;
        L2 = L2.next;
      }
      total = l1Total + l2Total;
      System.out.printf("ListNode info(L1, L2, total) -> [ %d, %d, %d ]\n", l1Total, l2Total, total);
      
      return null;
  }
}

class addTwoNumbers {
  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode L1c = new ListNode(2),L1b = new ListNode(4, L1c), L1 = new ListNode(3, L1b);
    ListNode L2c = new ListNode(5),L2b = new ListNode(6, L2c), L2 = new ListNode(4, L2b);
    //expected 975

    solution.addTwoNumbers(L1, L2);
  }
}