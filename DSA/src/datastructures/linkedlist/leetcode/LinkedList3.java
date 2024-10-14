package datastructures.linkedlist.leetcode;

public class LinkedList3 {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList3(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /*
    Here's the clever bit: by the time 'fast' hits the end of the list, 'slow' will be 'k' steps behind it -
    and therefore 'k' steps from the end of the list. So the function returns 'slow'.
     */
    public Node findKthFromEnd(int k){
        // Handle edge cases
        if(k <= 0 || head == null){
            return null;
        }

        Node first = head;
        Node second = head;

        // Move the first pointer k steps ahead
        for(int i = 0; i < k; i++){
            if(first == null) //-->If 'fast' encounters the end of the list (represented by 'null') before it has taken 'k' steps, the function returns 'null' because the list is shorter than 'k' elements.
                return null;
            first = first.next;
        }

        // Move both pointers until the first pointer reaches the end (null)
        while (first != null){
            first = first.next;
            second  = second.next;
        }

        // Second pointer now points to the k-th node from the end
        return second;
    }

    /*
    Time Complexity:
The algorithm traverses the list once, so the time complexity is O(n), where n is the number of nodes in the linked list.
Space Complexity:
The space complexity is O(1) because only two pointers (first and second) are used, regardless of the size of the input list.
     */

}
