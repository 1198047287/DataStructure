package com.baize.链表;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */
public class _237_删除链表中的节点 {


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    class Solution {
        public void deleteNode(ListNode node) {
            // 解题思路。  把要删除的值用next覆盖掉。 然后next设置为下下个值即可
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
    

}
