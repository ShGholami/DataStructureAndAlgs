package datastructures.doublylinkedlist.leetcode;

public class DoublyLinkedList4 {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList4(int value) {
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
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
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
            newNode.prev = current;
        }
        length++;
    }

    public void swapPairs() {
        if (length <= 1)
            return;

        Node cur = head;
        // Iterate through the list, swapping nodes in pairs
        while (cur != null) {
            Node first = cur;
            Node second = cur.next;

            //Swap next pointers-----------------------------------------------------
            // Store the next node after the pair
            Node temp = second.next;
            if (first.prev == null) { //first and second are first pair to swap
                // Update head when the first element is being swapped
                head = second;
            } else { // This is not the first pair to swap and there is a node previous to the current first
                // second is supposed to be swapped and connected to the previous node in the list
                first.prev.next = second;
            }
            second.next = first;
            first.next = temp;

            //Swap previous pointers-----------------------------------------------------
            if (temp != null) {
                temp.prev = first;
            }
            second.prev = first.prev;
            first.prev = second;

            // Move `current` to the next pair (skip to the node after the swapped pair)
            cur = first.next;
        }
    }
}
