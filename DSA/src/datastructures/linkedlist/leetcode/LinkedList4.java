package datastructures.linkedlist.leetcode;

public class LinkedList4 {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList4(int value) {
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
        if (head == null) {
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

    //My Solution
    public void partitionList(int x) {
        if (head == null) return;
        Node l = null; // 'l' is the head of the "less than x" list
        Node g = null; // 'g' is the head of the "greater or equal to x" list
        Node lTail = null; // 'lTail' keeps track of the last node in the "less than x" list
        Node gTail = null; // 'gTail' keeps track of the last node in the "greater or equal to x" list
        Node temp = head;  // Used for traversing the original list

        while (temp != null) {
            if (temp.value < x) {
                // Add to the "less than x" list
                if (l == null) {
                    l = temp;
                    lTail = temp;
                } else {
                    lTail.next = temp;
                    lTail = temp;
                }
            } else {
                // Add to the "greater than or equal to x" list
                if (g == null) {
                    g = temp;
                    gTail = temp;
                } else {
                    gTail.next = temp;
                    gTail = temp;
                }
            }
            temp = temp.next;
        }
        if (l != null) {
            head = l; // Set the head of the list to the "less than x" list's head
        }
        if (g != null) {
            lTail.next = g; // Connect the "less than x" list to the "greater or equal to x" list
            gTail.next = null; // Ensure the last node in the "greater or equal to x" list points to null
        }
    }

    //Instructor's solution
    public void partitionList2(int x) {
        if (head == null) return;
        Node dummyNode1 = new Node(0); // Dummy node for the "less than x" list
        Node dummyNode2 = new Node(0); // Dummy node for the "greater or equal to x" list
        Node pre1 = dummyNode1; // Pointer to the last node in the "less than x" list
        Node pre2 = dummyNode2; // Pointer to the last node in the "greater or equal to x" list
        Node current = head; // Used for traversing the original list

        while (current != null) {
            if (current.value < x) {
                pre1.next = current; // Add to the "less than x" list
                pre1 = current;      // Move the pointer forward
            } else {
                pre2.next = current; // Add to the "greater or equal to x" list
                pre2 = current;      // Move the pointer forward
            }
            current = current.next;
        }

        head = dummyNode1.next;      // Terminate the "greater or equal to x" list
        pre1.next = dummyNode2.next; // Connect the "less than x" list to the "greater or equal to x" list
        pre2.next = null;            // Set the head of the list to the new rearranged list
    }
}
