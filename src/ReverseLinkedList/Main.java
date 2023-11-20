package ReverseLinkedList;

/*
 *
 * https://leetcode.com/problems/reverse-linked-list/
 *
 */

public class Main {

    public static void main(String[] args) {
        ListNode fifth = new ListNode(5);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);
        System.out.println(first);

        ListNode reversed = Main.reverseList(first);
        System.out.println(reversed);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode reversedList = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return reversedList;
    }
}
