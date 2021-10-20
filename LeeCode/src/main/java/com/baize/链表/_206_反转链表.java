package com.baize.链表;


/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class _206_反转链表 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      class Solution {
          // 头节点
        public ListNode reverseList(ListNode head) {
            int i = 0;
            // 保存临时节点
            while (head!=null){
                // 保存临时head
                ListNode next = head.next;
                i++;
                if (i==1){
                    // 第一个特殊处理
                    head.next = null;
                }else {

                }
            }
            return null;
        }
    }
}
