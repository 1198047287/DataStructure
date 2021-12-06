package com.baize.链表;

public class __判断一个列表是否有环 {
      // 解题思路：  快慢指针（快慢指针相遇）   边界： 快指针next为不为空
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

}
