package datastructures.linkedlist.leetcode;

public class Main3 {
    public static void main(String[] args) {
        LinkedList3 myLinkedList = new LinkedList3(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 2;
        int result = myLinkedList.findKthFromEnd(k).value;

        System.out.println(result); // Output: 4


        int k2 = 6;
        Object result2 = myLinkedList.findKthFromEnd(k2);

        System.out.println(result2); // Output: null

        /*
            EXPECTED OUTPUT:
            ----------------
            4
            null
        */

    }
}
