package algorithms.sorts.insertionsort.leetcode;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void insertionSort() {
        if (length < 2) return;
        Node sortedHead = head;
        Node unsortedHead = head.next;
        sortedHead.next = null;
        while (unsortedHead != null) {
            Node current = unsortedHead;
            unsortedHead = unsortedHead.next;
            if (current.value < sortedHead.value) {
                //insert to the first of sorted list
                current.next = sortedHead;
                sortedHead = current;
            } else {
                Node searchPointer = sortedHead;
                while (searchPointer.next != null && current.value > searchPointer.next.value) {
                    searchPointer = searchPointer.next;
                }
                //insert to the correct position in the sorted list, just after where searchPointer is pointing to
                current.next = searchPointer.next;
                searchPointer.next = current;
            }
        }

        head = sortedHead;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        tail = temp;
    }

}
