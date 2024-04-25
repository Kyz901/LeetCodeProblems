package ReverseLinkedList;

/**
 * Definition for singly-linked list.
 */

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
            .append("[").append(val);
        ListNode node = this;

        while (node.next != null) {
            sb.append(",").append(node.next.val);
            node = node.next;
        }

        return sb.append("]").toString();
    }
}

