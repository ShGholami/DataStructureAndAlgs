package datastructures.stack.leetcode;

public class Main5 {

    public static void sortStack(Stack2<Integer> stack) {
        Stack2<Integer> sortedStack = new Stack2<>(); // Additional stack for sorting

        // Step 1: Move elements from original stack to sortedStack in sorted order
        while (!stack.isEmpty()) {
            int temp = stack.pop(); // Pop an element from the original stack

            // Move elements from sortedStack back to the original stack if they are greater than `temp`, to find the right position for temp
            while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                stack.push(sortedStack.pop());
            }

            // Place `temp` in the correct position in sortedStack
            sortedStack.push(temp);
        }
        //Sorted element is sorted in descending order of stack - now when we pop from it and push to the original stack
        //It will be sorted in ascending order

        // Step 2: Move elements from sortedStack back to the original stack
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack2<Integer> stack = new Stack2<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }

}
