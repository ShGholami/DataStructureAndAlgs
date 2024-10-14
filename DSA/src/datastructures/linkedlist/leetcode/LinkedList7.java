package datastructures.linkedlist.leetcode;

public class LinkedList7 {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList7(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void reverseBetween2(int m, int n) {
        if (m == n || head == null)
            return;

        Node tailFirst = null;
        Node headBw = null;
        Node tailBw = null;
        Node headLast = null;
        Node current = head;

        for (int i = 0; i <= n; i++) {
            if (m != 0 && i == m - 1) {
                tailFirst = current;
            }
            if (i == m) {
                headBw = current;
            }
            if (i == n) {
                tailBw = current;
                headLast = tailBw.next;
            }
            current = current.next;
        }

        Node temp = headBw;
        headBw = tailBw;
        tailBw = temp;
        Node finish = headBw.next;
        Node before = null;
        Node after = temp.next;

        while (after != finish) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

        if(tailFirst != null)
            tailFirst.next = headBw;
        else
            head = headBw;

        tailBw.next = headLast;
    }

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null) return;

        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        Node currentNode = previousNode.next;

        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }

        head = dummyNode.next;
    }

}
