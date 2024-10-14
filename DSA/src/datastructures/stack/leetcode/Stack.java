package datastructures.stack.leetcode;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size() - 1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    /*
    The add method of ArrayList is used to add the value to the end of the ArrayList,
    which corresponds to the top of the stack.
     */
    public void push(T input) {
        if (stackList == null)
            stackList = new ArrayList<>();
        stackList.add(input);
    }


}
