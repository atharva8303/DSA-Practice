/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;

        while (current != null) {
            Node newNode = new Node(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }

        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        current = head;
        Node newHead = head.next;
        Node copyCurrent = newHead;

        while (current != null) {
            current.next = copyCurrent.next;
            if (copyCurrent.next != null) {
                copyCurrent.next = copyCurrent.next.next;
            }
            current = current.next;
            copyCurrent = copyCurrent.next;
        }

        return newHead;
    }
}