package MergeTwoSortedList;

import ReverseLinkedList.ListNode;
/*
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 */
class Main {

    public static void main(String[] args) {
        final ListNode thirdNode = new ListNode(3, null);
        final ListNode secondNode = new ListNode(2, thirdNode);
        final ListNode firstNode = new ListNode(1, secondNode);
        final ListNode sixthNode = new ListNode(4, null);
        final ListNode seventhNode = new ListNode(2, sixthNode);
        final ListNode fifthNode = new ListNode(2, seventhNode);
        final ListNode fourthNode = new ListNode(1, fifthNode);

        Main main = new Main();

        System.out.println(main.mergeTwoLists(firstNode, fourthNode));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        final ListNode newHead = new ListNode();
        ListNode currentNew = newHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNew.next = list1;
                list1 = list1.next;
            } else {
                currentNew.next = list2;
                list2 = list2.next;
            }
            currentNew = currentNew.next;
        }

        currentNew.next = list1 != null ? list1 : list2;

        return newHead.next;
    }
}
