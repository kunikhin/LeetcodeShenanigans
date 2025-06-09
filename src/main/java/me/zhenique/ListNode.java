package me.zhenique;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ListNode {
     public int val;
     public ListNode next;
     public ListNode() {}
     public ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     public ListNode createList(int[] values) {
          ListNode dummy = new ListNode(-1);
          ListNode current = dummy;
          for (int val : values) {
               current.next = new ListNode(val);
               current = current.next;
          }
          return dummy.next;
     }

     public void assertListEquals(ListNode expected, ListNode actual) {
          ListNode e = expected;
          ListNode a = actual;
          int index = 0;
          while (e != null && a != null) {
               assertEquals(e.val, a.val, "Value mismatch at node index: " + index);
               e = e.next;
               a = a.next;
               index++;
          }
          if (e != null || a != null) {
               fail("Lists have different lengths");
          }
     }
}
