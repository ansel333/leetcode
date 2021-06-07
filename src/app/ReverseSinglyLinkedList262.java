package app;


public class ReverseSinglyLinkedList262 {

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(a[0]);
        for (int i = 1; i < a.length; i++) {
            head = insertNode(head, new ListNode(a[i]));
        }
        // System.out.println(reverseList1(head).toString());
        // System.out.println(reverseList2(head).toString());
        System.out.println(reverseList3(head).toString());
    }

    public static ListNode insertNode(ListNode head, ListNode newNode) {
        if (head == null) {
            head = newNode;
            return head;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    public static ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode reverseList3(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode storedNode = reverseList3(head.next);
        head.next.next = head;
        head.next = null;
        return storedNode;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode currentHead = head;
        while (head.next != null) {
            ListNode storedNode = head.next.next;
            head.next.next = currentHead;
            currentHead = head.next;
            head.next = storedNode;
        }
        return currentHead;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.val);
        ListNode next = this.next;
        while (next != null) {
            sb.append(", ").append(next.val);
            next = next.next;
        }
        return sb.toString();
    }
}