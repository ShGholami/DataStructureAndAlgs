package datastructures.linkedlist.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedList5 {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList5(int value) {
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


    public void removeDuplicates() {
        if (head == null) return;
        Set<Integer> nodesSet = new HashSet<>();
        Node before = null;
        Node current = head;
        while (current != null) {
            if (nodesSet.contains(current.value)) {
                before.next = current.next;
                length -= 1;
            } else {
                nodesSet.add(current.value);
                before = current;
            }
            current = current.next;
        }
    }

    //My Solution
    public void removeDuplicates2() {
        if (head == null) return;
        Set<Integer> nodesSet = new HashSet<>();
        Node before = null;
        Node current = head;
        while (current != null) {
            if (!nodesSet.add(current.value)) {
                before.next = current.next;
                length -= 1;
            } else {
                before = current;
            }
            current = current.next;
        }
    }

    /*
     * The time complexity of both solutions is O(n)
     * Time Complexity of Key Operations in Both Solutions:
     *
    Iteration Over the List:
    The linked list is iterated over once from start to finish --> number of nodes n --> O(n)

    Both contains() and add() methods are used on the Set during each iteration.
    For a HashSet, both contains() and add() operations have an average time complexity of O(1).
    This is due to the hash-based implementation of HashSet, where each element is placed in a bucket based on its hash code, allowing for nearly constant-time lookups and insertions.

    Overall Time Complexity:
    - Since both contains() and add() are called once for each node during the iteration, and each of these operations has an average complexity of O(1), the overall time complexity for both solutions is O(n).
    - Therefore, iterating through n nodes and performing O(1) operations for each yields O(n) time complexity overall.
     * */


}
