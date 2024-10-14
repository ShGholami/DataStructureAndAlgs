package datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        System.out.println("root= " + binarySearchTree.getRoot());

        binarySearchTree.insert(47);
        binarySearchTree.insert(21);
        binarySearchTree.insert(76);
        binarySearchTree.insert(18);
        binarySearchTree.insert(52);
        binarySearchTree.insert(82);

        binarySearchTree.insert(27);

        System.out.println(binarySearchTree.getRoot().left.right.value);

        System.out.println("BST contains 27? " + binarySearchTree.contains(27));
        System.out.println("BST contains 17? " + binarySearchTree.contains(17));

        System.out.println("Using Recursive, BST contains 27? " + binarySearchTree.rContains(27));
        System.out.println("Using Recursive, BST contains 17? " + binarySearchTree.rContains(17));


        ///////////test recursive
        BinarySearchTree binarySearchTree2 = new BinarySearchTree();
        System.out.println("root= " + binarySearchTree.getRoot());

        binarySearchTree2.rInsert(2);
        binarySearchTree2.rInsert(1);
        binarySearchTree2.rInsert(3);

        System.out.println("\nRoot: " + binarySearchTree2.getRoot().value);
        System.out.println("\nRoot-> left: " + binarySearchTree2.getRoot().left.value);
        System.out.println("\nRoot-> right: " + binarySearchTree2.getRoot().right.value);


        /////////////Test BFS
        System.out.println("-------------------------Test BFS");
        BinarySearchTree testBSTwithBFS = new BinarySearchTree();
        testBSTwithBFS.insert(47);
        testBSTwithBFS.insert(21);
        testBSTwithBFS.insert(76);
        testBSTwithBFS.insert(18);
        testBSTwithBFS.insert(27);
        testBSTwithBFS.insert(52);
        testBSTwithBFS.insert(82);

        System.out.println(testBSTwithBFS.BFS());

        /////////////Test DFS-Preorder
        System.out.println("------------------------Test DFS-Preorder");
        BinarySearchTree testDFSPreOrder = new BinarySearchTree();
        testDFSPreOrder.insert(47);
        testDFSPreOrder.insert(21);
        testDFSPreOrder.insert(76);
        testDFSPreOrder.insert(18);
        testDFSPreOrder.insert(27);
        testDFSPreOrder.insert(52);
        testDFSPreOrder.insert(82);

        System.out.println(testDFSPreOrder.DFSPreOrder());

        /////////////Test DFS-Preorder
        System.out.println("------------------------Test DFS-Postorder");
        BinarySearchTree testDFSPostOrder = new BinarySearchTree();
        testDFSPostOrder.insert(47);
        testDFSPostOrder.insert(21);
        testDFSPostOrder.insert(76);
        testDFSPostOrder.insert(18);
        testDFSPostOrder.insert(27);
        testDFSPostOrder.insert(52);
        testDFSPostOrder.insert(82);

        System.out.println(testDFSPostOrder.DFSPostOrder());

        /////////////Test DFS-Inorder
        System.out.println("------------------------Test DFS-Inorder");
        BinarySearchTree testDFSInOrder = new BinarySearchTree();
        testDFSInOrder.insert(47);
        testDFSInOrder.insert(21);
        testDFSInOrder.insert(76);
        testDFSInOrder.insert(18);
        testDFSInOrder.insert(27);
        testDFSInOrder.insert(52);
        testDFSInOrder.insert(82);

        System.out.println(testDFSInOrder.DFSInOrder());
    }
}
