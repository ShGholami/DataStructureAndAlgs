package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        /*
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        myStack.printStack();
        */

        /*
        Stack mystack = new Stack(2);
        mystack.push(1);
        mystack.printStack();
        */

        Stack myStack = new Stack(7);
        myStack.push(23);
        myStack.push(3);
        myStack.push(11);

        myStack.pop();

        myStack.printStack();

    }
}
