package asdf.hello.leetcode.problem;

import android.util.Log;

/**
 * Created by Administrator on 2018/1/4.
 *
 *
 You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order and each of their nodes contain a single digit.
 Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.

 */

public class Problem_2 extends BaseProblem {
    @Override
    public void execute() {
        int[] nArrays = {2, 4, 3};
        ListNode node = getListNode(nArrays);
        printListNode(node);
        int[] nArrays2 = {2, 4, 4};
        ListNode node2 = getListNode(nArrays2);
        printListNode(node2);

        ListNode node3 = addTwoNumbers(node, node2);
        printListNode(node3);
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);

        ListNode headNode = node;

        ListNode tmp1 = l1;
        ListNode tmp2 = l2;

        int nNextVal = 0;

        while (tmp1 != null || tmp2 != null || nNextVal > 0){
            if (tmp1 != null){
                node.val = node.val + tmp1.val;
                tmp1 = tmp1.next;
            }

            if (tmp2 != null){
                node.val = node.val + tmp2.val;
                tmp2 = tmp2.next;
            }

            node.val = node.val + nNextVal;

            int val = node.val;
            nNextVal = val / 10;
            node.val = val % 10;

            if (tmp1 != null || tmp2 != null || nNextVal > 0){
                ListNode tmpNode = new ListNode(0);
                node.next = tmpNode;
                node = tmpNode;
            }
        }

        return headNode;
    }

    private ListNode getListNode(int[] nArray){
        ListNode node = null;
        ListNode current = null;

        for (int i = 0; i < nArray.length; i++){
            ListNode tmp = new ListNode(nArray[i]);

            if (current != null){
                current.next = tmp;
                current = tmp;
            }

            if (i == 0){
                node = tmp;
                current = tmp;
            }
        }

        return node;
    }

    private void printListNode(ListNode node){
        StringBuffer sb = new StringBuffer();

        ListNode tmp = node;
        while (tmp != null){
            sb.append(tmp.val).append(" -> ");
            tmp = tmp.next;
        }

        Log.e(TAG, "printListNode node = " + sb.toString());
    }
}
