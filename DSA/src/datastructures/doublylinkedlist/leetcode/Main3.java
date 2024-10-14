package datastructures.doublylinkedlist.leetcode;

public class Main3 {
    public static void main(String[] args) {
        DoublyLinkedList3 myDLL1 = new DoublyLinkedList3(1);
        myDLL1.append(2);
        myDLL1.append(3);
        myDLL1.append(2);
        myDLL1.append(1);

        System.out.println("myDLL1 isPalindrome:");
        System.out.println( myDLL1.isPalindrome() );



        DoublyLinkedList3 myDLL2 = new DoublyLinkedList3(1);
        myDLL2.append(2);
        myDLL2.append(3);

        System.out.println("\nmyDLL2 isPalindrome:");
        System.out.println( myDLL2.isPalindrome() );



        /*
       		EXPECTED OUTPUT:
        	----------------
            true

            false

     	*/

    }
}
