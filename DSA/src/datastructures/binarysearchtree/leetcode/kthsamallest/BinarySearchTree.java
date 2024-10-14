package datastructures.binarysearchtree.leetcode.kthsamallest;

import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public Integer kthSmallest(int k) {
        // Create an empty stack to keep track of nodes
        Stack<Node> stack = new Stack<>();

        // Start from the root of the BST
        Node currentNode = this.root;

        // Continue as long as there are unprocessed nodes
        while (!stack.isEmpty() || currentNode != null) {

            // Traverse to the leftmost node of the current subtree,
            // pushing all the nodes onto the stack
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            // Process nodes from the stack when no left children
            currentNode = stack.pop();

            // Decrement k after each processed node
            k -= 1;

            // If k reaches 0, return the current node value
            if (k == 0) {
                return currentNode.value;
            }

            // Move to the right child after a node has been processed
            currentNode = currentNode.right;
        }

        // Return null if fewer than k nodes in the tree
        return null;
    }

}
